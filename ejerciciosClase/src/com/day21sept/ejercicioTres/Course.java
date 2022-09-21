package com.day21sept.ejercicioTres;

public class Course {
    private int classId;
    private int capacity;
    private int studentCount;
    private String title;

    public Course(int classId, int capacity, int studentCount, String title) {
        setClassId(classId) ;
        this.capacity = capacity;
        this.studentCount = studentCount;
        this.title = title;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        if(classId < 0 ){
            System.out.println("this is not a correct classId should  be a positive");
        } else this.classId = classId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Course{" +
                "classId=" + classId +
                ", capacity=" + capacity +
                ", studentCount=" + studentCount +
                ", title='" + title + '\'' +
                '}';
    }
}
