/*     */ package com.sinosoft.engine.core.util;
/*     */ 
/*     */ import java.math.BigInteger;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.SecureRandom;
/*     */ import java.security.spec.InvalidKeySpecException;
/*     */ import javax.crypto.SecretKeyFactory;
/*     */ import javax.crypto.spec.PBEKeySpec;
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
/*     */ 
/*     */ public class PasswordHash
/*     */ {
/*     */   public static final String PBKDF2_ALGORITHM = "PBKDF2WithHmacSHA1";
/*     */   public static final int SALT_BYTE_SIZE = 16;
/*     */   public static final int HASH_BYTE_SIZE = 16;
/*     */   public static final int PBKDF2_ITERATIONS = 1000;
/*     */   public static final int ITERATION_INDEX = 0;
/*     */   public static final int SALT_INDEX = 1;
/*     */   public static final int PBKDF2_INDEX = 2;
/*     */   public static final String SEPARATOR = ":";
/*     */   
/*  75 */   public static String createHash(String password) throws NoSuchAlgorithmException, InvalidKeySpecException { return createHash(password.toCharArray()); }
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
/*     */   public static String createHash(char[] password) throws NoSuchAlgorithmException, InvalidKeySpecException {
/*  88 */     SecureRandom random = new SecureRandom();
/*  89 */     byte[] salt = new byte[16];
/*  90 */     random.nextBytes(salt);
/*     */ 
/*     */     
/*  93 */     byte[] hash = pbkdf2(password, salt, 1000, 16);
/*     */     
/*  95 */     return "1000:" + toHex(salt) + ":" + toHex(hash);
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
/*     */ 
/*     */   
/* 111 */   public static boolean validatePassword(String password, String correctHash) throws NoSuchAlgorithmException, InvalidKeySpecException { return validatePassword(password.toCharArray(), correctHash); }
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
/*     */   public static boolean validatePassword(char[] password, String correctHash) throws NoSuchAlgorithmException, InvalidKeySpecException {
/* 128 */     String[] params = correctHash.split(":");
/* 129 */     int iterations = Integer.parseInt(params[0]);
/* 130 */     byte[] salt = fromHex(params[1]);
/* 131 */     byte[] hash = fromHex(params[2]);
/*     */ 
/*     */     
/* 134 */     byte[] testHash = pbkdf2(password, salt, iterations, hash.length);
/*     */ 
/*     */     
/* 137 */     return slowEquals(hash, testHash);
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
/*     */   private static boolean slowEquals(byte[] a, byte[] b) {
/* 152 */     int diff = a.length ^ b.length;
/* 153 */     for (int i = 0; i < a.length && i < b.length; i++)
/* 154 */       diff |= a[i] ^ b[i]; 
/* 155 */     return (diff == 0);
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
/*     */ 
/*     */   
/*     */   private static byte[] pbkdf2(char[] password, byte[] salt, int iterations, int bytes) throws NoSuchAlgorithmException, InvalidKeySpecException {
/* 172 */     PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, bytes * 8);
/* 173 */     SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
/* 174 */     return skf.generateSecret(spec).getEncoded();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static byte[] fromHex(String hex) {
/* 185 */     byte[] binary = new byte[hex.length() / 2];
/* 186 */     for (int i = 0; i < binary.length; i++) {
/* 187 */       binary[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
/*     */     }
/* 189 */     return binary;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String toHex(byte[] array) {
/* 200 */     BigInteger bi = new BigInteger(true, array);
/* 201 */     String hex = bi.toString(16);
/* 202 */     int paddingLength = array.length * 2 - hex.length();
/* 203 */     if (paddingLength > 0) {
/* 204 */       return String.format("%0" + paddingLength + "d", new Object[] { Integer.valueOf(0) }) + hex;
/*     */     }
/* 206 */     return hex;
/*     */   }
/*     */ }


/* Location:              C:\Users\admin\Desktop\znzj\znyyzj_analyze_zfbx\WEB-INF\classes\!\com\huayunworld\znyyzj\engine\cor\\util\PasswordHash.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.0.6
 */