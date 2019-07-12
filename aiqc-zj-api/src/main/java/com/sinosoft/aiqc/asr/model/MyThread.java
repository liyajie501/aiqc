package com.sinosoft.aiqc.asr.model;

import java.io.File;

/**
 * Created by Administrator on 2019/4/26.
 */
public class MyThread implements Runnable{
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void run()
    {
        System.out.println("hello ");
    }
}
