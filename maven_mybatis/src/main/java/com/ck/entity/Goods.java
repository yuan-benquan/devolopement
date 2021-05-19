package com.ck.entity;

/**
 * @Descrition:
 * @Author yuanbq
 * @Date 2021/5/13 10:08
 */
public class Goods {
    private int id;
    private String name;
    private String address;
    private int peoples;

    public Goods(int id, String name, String address, int peoples) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.peoples = peoples;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPeoples() {
        return peoples;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", peoples=" + peoples +
                '}';
    }
}
