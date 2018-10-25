package org.lanqiao.dao;


import org.lanqiao.pojo.Clas;

public interface ClasMapper {
    //查询：根据班级cid查询班级中学生信息
    public Clas findCidByCid(int cid);

}
