package com.walden.javadesignmode.mode.prototypemode;

/**
 * Created by wangjt on 2017/7/17.
 * 对象复制
 */

public class Mail implements Cloneable {
    String address = "-";
    String title = "-";
    String content = "-";

    public String send() {
        return this.toString();
    }

    @Override
    public Object clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return mail;
    }

    @Override
    public String toString() {
        return "address:" + address + " title:" + title + " content:" + content + "\n";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
