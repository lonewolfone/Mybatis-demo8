package org.lanqiao.pojo;


import java.util.Objects;

public class Clas {
    private int cid;
    private String cname;

    public Clas(){

    }

    public Clas(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clas clas = (Clas) o;
        return cid == clas.cid &&
                Objects.equals(cname, clas.cname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, cname);
    }

    @Override
    public String toString() {
        return "Clas{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }
}
