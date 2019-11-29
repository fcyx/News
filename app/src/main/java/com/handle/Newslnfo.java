package com.handle;

import java.io.Serializable;

public class Newslnfo implements Serializable {

    /**
     * liveInfo : null
     * docid : EURTDE6600038FO9
     * source : 网易娱乐
     * title : 想不到吧！雷佳音给自己取的英文名竟然是这个
     * priority : 120
     * hasImg : 1
     * url : http://3g.163.com/ent/19/1125/20/EURTDE6600038FO9.html
     * commentCount : 13
     * imgsrc3gtype : 1
     * stitle :
     * digest : 网易娱乐11月25日报道近日，雷佳音和汤唯宣传新片时，被要求
     * imgsrc : http://cms-bucket.ws.126.net/2019/11/25/a0cb0ae377594927bec11c4d1a2f6409.png
     * ptime : 2019-11-25 20:36:50
     */

    private Object liveInfo;
    private String docid;
    private String source;
    private String title;
    private int priority;
    private int hasImg;
    private String url;
    private int commentCount;
    private String imgsrc3gtype;
    private String stitle;
    private String digest;
    private String imgsrc;
    private String ptime;

    public Object getLiveInfo() {
        return liveInfo;
    }

    public void setLiveInfo(Object liveInfo) {
        this.liveInfo = liveInfo;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getHasImg() {
        return hasImg;
    }

    public void setHasImg(int hasImg) {
        this.hasImg = hasImg;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getImgsrc3gtype() {
        return imgsrc3gtype;
    }

    public void setImgsrc3gtype(String imgsrc3gtype) {
        this.imgsrc3gtype = imgsrc3gtype;
    }

    public String getStitle() {
        return stitle;
    }

    public void setStitle(String stitle) {
        this.stitle = stitle;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }
}
