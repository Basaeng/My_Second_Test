package org.com.domain;

public class Member {
    private Long id;
    private String name;
    private String top;

    private Color panties;

    public Member(Long id, String name, String top, Color panties) {
        this.id = id;
        this.name = name;
        this.top = top;
        this.panties = panties;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) { this.id = id;}

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

    public Color getPanties() {
        return panties;
    }
    public void setPanties(Color panties) {
        this.panties = panties;
    }

}

