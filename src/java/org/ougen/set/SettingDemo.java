package org.ougen.set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.ougen.set.enumdate.MyEnum;
import org.ougen.set.mapper.StudentMapper;
import org.ougen.set.model.Student;
import org.ougen.set.model.Teacher;

import java.io.IOException;
import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 16:44 2019/7/22
 */
public class SettingDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-setting.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
//        List<Student> students = studentMapper.getAll();
//
//        List<Teacher> teachers = studentMapper.getTeacher(2);
//        System.out.println(teachers);
//        List<Student> student = studentMapper.getAll();
//        System.out.println(student);
        Student student = studentMapper.getOne(2);

        student.setStudentName("xxxx");
        System.out.println(student.getTeacher_list().get(1));
        Student s2 = studentMapper.getOne(2);
        studentMapper.updateS(student);
        sqlSession.commit();
        System.out.println();

//        Thread.sleep(3000);
//        List<MyEnum> myEnum = studentMapper.getMyEnum(MyEnum.famele);
//        myEnum.forEach(SettingDemo::myread);

    }
    public static void myread(MyEnum myEnum){
        System.out.println(myEnum.getGender());
    }
}
