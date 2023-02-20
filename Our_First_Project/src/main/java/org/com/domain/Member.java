package org.com.domain;

public class Member {
    private int id;

    private String name;

    private String top;
    private String bottom;
    private String panties;
    private String socks;

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public String getPanties() {
        return panties;
    }

    public void setPanties(String panties) {
        this.panties = panties;
    }

    public String getSocks() {
        return socks;
    }

    public void setSocks(String socks) {
        this.socks = socks;
    }

    public static void main(String[] args){
        Member han = new Member();
        han.setId(201810896);
        han.setName("hankyuhyun");
        han.setBottom("uniqlo");
        han.setSocks("nike");
        han.setTop("uniqlo");
        han.setPanties("Kalvin_Cline");
        System.out.println("han's name:"+han.name);
        System.out.println("han's id:"+han.id);
        System.out.println("han's top:"+han.top);
        System.out.println("han's bottom:"+han.bottom);
        System.out.println("han's panties:"+han.panties);
    }
}

