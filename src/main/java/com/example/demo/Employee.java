package com.example.demo;

public class Employee {

    private Integer id;
    private String fname;
    private String sname;

    public Employee(Integer id,String fname, String sname) {
        this.id = id;
        this.fname = fname;
        this.sname = sname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


}
