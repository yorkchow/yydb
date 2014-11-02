package com.yydb.common.web.upload.exception;

import org.apache.commons.fileupload.FileUploadException;

/**
 * File name length limit exceeded exception
 * 文件名超长异常类
 * @author YorkChow<york.chow@actionsky.com>
 * @since 2014/11/2
 * Time: 22:25
 */
public class FileNameLengthLimitExceededException extends FileUploadException {

    private int length;
    private int maxLength;
    private String filename;

    public FileNameLengthLimitExceededException(String filename, int length, int maxLength) {
        super("file name : [" + filename + "], length : [" + length + "], max length : [" + maxLength + "]");
        this.length = length;
        this.maxLength = maxLength;
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public int getLength() {
        return length;
    }


    public int getMaxLength() {
        return maxLength;
    }
}
