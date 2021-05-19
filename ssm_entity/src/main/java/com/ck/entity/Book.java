package com.ck.entity;

import java.util.Date;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/18 15:17
 */
public class Book {
//    bid int PRIMARY KEY auto_increment, --  图书编号
//    bname varchar(100) not null, -- 图书名
//    price DOUBLE, -- 价格
//    btid INT, -- 图书类型编号
//    dtime date, -- 出版时间
//    imgurl varchar(100), -- 图片路径
//    state int -- 审核状态（0
    private  int bid;
    private String bname;
    private  double price;
    private  int btid;
    private Date dtime;
    private String imgurl;
    private int state;

    public Book(int bid, String bname, double price, int btid, Date dtime, String imgurl, int state) {
        this.bid = bid;
        this.bname = bname;
        this.price = price;
        this.btid = btid;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
    }

    public Book() {
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", btid=" + btid +
                ", dtime=" + dtime +
                ", imgurl='" + imgurl + '\'' +
                ", state=" + state +
                '}';
    }
}
