package org.ougen.set.model;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 17:15 2019/7/22
 */
public class Teacher {
    private int teacherId;
    private String teacherName;
    private List<Student> student_list;

    public List<Student> getStudent_list() {
        return student_list;
    }

    public void setStudent_list(List<Student> student_list) {
        this.student_list = student_list;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
