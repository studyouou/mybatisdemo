package org.ougen.set.model;

import java.util.List;

/**
 * Author: OuGen
 * Discription:
 * Date: 17:15 2019/7/22
 */
public class Student {
    private int studentId;
    private String studentName;
    private List<Teacher> teacher_list;

    public List<Teacher> getTeacher_list() {
        return teacher_list;
    }

    public void setTeacher_list(List<Teacher> teacher_list) {
        this.teacher_list = teacher_list;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
