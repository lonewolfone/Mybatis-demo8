package org.lanqiao.pojo;


import java.util.Objects;

public class Student {
    private int id;
    private String sname;
    private int   sage;
    private String ssex;
    private int cid;
    //学生关联班级：添加一个班级属性
    private Clas clas;

    public Student(){

    }

    public Student(String sname, int sage, String ssex, int cid, Clas clas) {
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.cid = cid;
        this.clas = clas;
    }

    public Student(int id, String sname, int sage, String ssex, int cid, Clas clas) {
        this.id = id;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.cid = cid;
        this.clas = clas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Clas getClas() {
        return clas;
    }

    public void setClas(Clas clas) {
        this.clas = clas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                sage == student.sage &&
                cid == student.cid &&
                Objects.equals(sname, student.sname) &&
                Objects.equals(ssex, student.ssex) &&
                Objects.equals(clas, student.clas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sname, sage, ssex, cid, clas);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", ssex='" + ssex + '\'' +
                ", cid=" + cid +
                ", clas=" + clas +
                '}';
    }
}
