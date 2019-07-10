/*     */ package com.sinosoft.engine.analyze.utils;
/*     */ 
/*     */ import net.sf.json.JSONObject;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileFilter;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FtpUtil
/*     */ {
/*  24 */   private static Logger logger = Logger.getLogger(FtpUtil.class);
/*     */ 
/*     */   
/*     */   private FTPClient ftpClient;
/*     */ 
/*     */   
/*     */   public static final int BINARY_FILE_TYPE = 2;
/*     */ 
/*     */   
/*     */   public static final int ASCII_FILE_TYPE = 0;
/*     */ 
/*     */   
/*     */   public boolean connectServer(FtpConfig cfg) throws SocketException, IOException {
/*  37 */     this.ftpClient = new FTPClient();
/*  38 */     this.ftpClient.setConnectTimeout(cfg.getClientTimeout());
/*     */     try {
/*  40 */       this.ftpClient.connect(cfg.getHost(), cfg.getPort());
/*  41 */       int reply = this.ftpClient.getReplyCode();
/*  42 */       if (!FTPReply.isPositiveCompletion(reply)) {
/*  43 */         this.ftpClient.disconnect();
/*  44 */         logger.warn("FTP连接拒绝:" + cfg.getHost() + ":" + cfg.getPort());
/*  45 */         return false;
/*     */       } 
/*  47 */       boolean result = this.ftpClient.login(cfg.getUsername(), cfg.getPassword());
/*  48 */       if (!result) {
/*  49 */         logger.warn("FTP用户名或密码错误:" + JSONObject.fromObject(cfg).toString());
/*  50 */         return false;
/*     */       } 
/*  52 */       this.ftpClient.setBufferSize(1024);
/*  53 */       this.ftpClient.setControlEncoding("UTF-8");
/*  54 */       this.ftpClient.setFileType(2);
/*  55 */       logger.info("连接FTP成功：" + JSONObject.fromObject(cfg).toString());
/*  56 */       return true;
/*  57 */     } catch (Exception e) {
/*  58 */       logger.error("连接FTP异常", e);
/*  59 */       return false;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  74 */   public void setFileType(int fileType) throws IOException { this.ftpClient.setFileType(fileType); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeServer() {
/*  82 */     if (this.ftpClient != null && this.ftpClient.isConnected()) {
/*  83 */       this.ftpClient.logout();
/*  84 */       this.ftpClient.disconnect();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  95 */   public boolean changeDirectory(String path) throws IOException { return this.ftpClient.changeWorkingDirectory(path); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 105 */   public boolean createDirectory(String pathName) throws IOException { return this.ftpClient.makeDirectory(pathName); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 115 */   public boolean removeDirectory(String path) throws IOException { return this.ftpClient.removeDirectory(path); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeDirectory(String path, boolean isAll) throws IOException {
/* 128 */     if (!isAll) {
/* 129 */       return removeDirectory(path);
/*     */     }
/*     */     
/* 132 */     FTPFile[] ftpFileArr = this.ftpClient.listFiles(path);
/* 133 */     if (ftpFileArr == null || ftpFileArr.length == 0) {
/* 134 */       return removeDirectory(path);
/*     */     }
/*     */     
/* 137 */     for (FTPFile ftpFile : ftpFileArr) {
/* 138 */       String name = ftpFile.getName();
/* 139 */       if (ftpFile.isDirectory()) {
/* 140 */         System.out.println("* [sD]Delete subPath [" + path + "/" + name + "]");
/* 141 */         removeDirectory(path + "/" + name, true);
/* 142 */       } else if (ftpFile.isFile()) {
/* 143 */         System.out.println("* [sF]Delete file [" + path + "/" + name + "]");
/* 144 */         deleteFile(path + "/" + name);
/* 145 */       } else if (!ftpFile.isSymbolicLink()) {
/*     */         
/* 147 */         if (ftpFile.isUnknown());
/*     */       } 
/*     */     } 
/*     */     
/* 151 */     return this.ftpClient.removeDirectory(path);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean existDirectory(String path) throws IOException {
/* 161 */     boolean flag = false;
/* 162 */     FTPFile[] ftpFileArr = this.ftpClient.listFiles(path);
/* 163 */     for (FTPFile ftpFile : ftpFileArr) {
/* 164 */       if (ftpFile.isDirectory() && ftpFile
/* 165 */         .getName().equalsIgnoreCase(path)) {
/* 166 */         flag = true;
/*     */         break;
/*     */       } 
/*     */     } 
/* 170 */     return flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List<String> getFileOrDirList(String path, final boolean isFile) throws IOException {
/* 182 */     FTPFile[] fileArr = this.ftpClient.listFiles(path, new FTPFileFilter() {
/*     */           public boolean accept(FTPFile ftpFile) {
/* 184 */             if (isFile) {
/* 185 */               return ftpFile.isFile();
/*     */             }
/* 187 */             return ftpFile.isDirectory();
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 192 */     if (fileArr == null || fileArr.length == 0) return null; 
/* 193 */     List<String> retList = new ArrayList<String>();
/* 194 */     for (FTPFile f : fileArr) retList.add(f.getName()); 
/* 195 */     return retList;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 202 */   public List<String> getFileList(String path) throws IOException { return getFileOrDirList(path, true); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 209 */   public List<String> getDirList(String path) throws IOException { return getFileOrDirList(path, false); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 219 */   public boolean deleteFile(String pathName) throws IOException { return this.ftpClient.deleteFile(pathName); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean uploadFile(String localFilePath, String remoteFileName) throws IOException {
/* 231 */     boolean flag = false;
/* 232 */     iStream = null;
/*     */     try {
/* 234 */       iStream = new FileInputStream(localFilePath);
/*     */ 
/*     */ 
/*     */       
/* 238 */       flag = this.ftpClient.storeFile(remoteFileName, iStream);
/* 239 */     } catch (IOException e) {
/* 240 */       flag = false;
/* 241 */       return flag;
/*     */     } finally {
/* 243 */       if (iStream != null) {
/* 244 */         iStream.close();
/*     */       }
/*     */     } 
/* 247 */     return flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 257 */   public boolean uploadFile(String fileName) throws IOException { return uploadFile(fileName, fileName); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean uploadFile(InputStream iStream, String newName) throws IOException {
/* 269 */     boolean flag = false;
/*     */     try {
/* 271 */       flag = this.ftpClient.storeFile(newName, iStream);
/* 272 */     } catch (IOException e) {
/* 273 */       flag = false;
/* 274 */       return flag;
/*     */     } finally {
/* 276 */       if (iStream != null) {
/* 277 */         iStream.close();
/*     */       }
/*     */     } 
/* 280 */     return flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean download(String remoteFileName, String localFileName) throws IOException {
/* 292 */     boolean flag = false;
/* 293 */     File outfile = new File(localFileName);
/* 294 */     oStream = null;
/*     */     try {
/* 296 */       oStream = new FileOutputStream(outfile);
/*     */ 
/*     */ 
/*     */       
/* 300 */       flag = this.ftpClient.retrieveFile(remoteFileName, oStream);
/* 301 */     } catch (IOException e) {
/* 302 */       flag = false;
/* 303 */       return flag;
/*     */     } finally {
/* 305 */       oStream.close();
/*     */     } 
/* 307 */     return flag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 317 */   public InputStream downFile(String sourceFileName) throws IOException { return this.ftpClient.retrieveFileStream(sourceFileName); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws Exception {
/* 330 */     FtpUtil ftpUtil = new FtpUtil();
/* 331 */     boolean re = ftpUtil.connectServer(new FtpConfig("192.168.0.127", 21, "root", "123456"));
/*     */     
/* 333 */     ftpUtil.changeDirectory("/usr/local/System_Offline_Linux_tongyong_lstm12_161222_rongcheng170317/xml_result");
/*     */ 
/*     */ 
/*     */     
/* 337 */     System.out.println(re);
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\analyz\\utils\FtpUtil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */