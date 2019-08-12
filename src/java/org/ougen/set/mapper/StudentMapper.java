package org.ougen.set.mapper;

import org.apache.ibatis.annotations.Param;
import org.ougen.set.enumdate.MyEnum;
import org.ougen.set.model.Student;
import org.ougen.set.model.Teacher;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 17:26 2019/7/22
 */
public interface StudentMapper {

    public List<Student> getAll();

    public List<Teacher> getTeacher(@Param("studentId") int studentId);

    public Student getOne(int studentId);

    public void updateS(@Param("student") Student student);

    public List<MyEnum> getMyEnum(@Param("myEnum") MyEnum myEnum);
}
