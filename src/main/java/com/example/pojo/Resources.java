package com.example.pojo;


public class Resources {
    private Integer id;

    private String key;

    private String val;

    private Integer sortnum;

    private Short status;

    @Override
    public String toString() {
        return "Resources{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", val='" + val + '\'' +
                ", sortnum=" + sortnum +
                ", status=" + status +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public Integer getSortnum() {
        return sortnum;
    }

    public void setSortnum(Integer sortnum) {
        this.sortnum = sortnum;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}