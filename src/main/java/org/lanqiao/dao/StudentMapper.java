package org.lanqiao.dao;

import org.lanqiao.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //查询:根据cid获取学生信息
    public List<Student> findStuByCid();
    //多表查询：根据sid获取学生信息，包括他的班级信息
    public Student findStuBySid(int id);
    //单表查询：根据sid获取学生信息，包括他的班级信息
    public Student findStuBySids(int id);
}
