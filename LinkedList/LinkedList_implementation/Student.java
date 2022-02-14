package linkedlist;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private Integer id;
    private Character grade;
    private String program;

    public Student(String name, Integer id) {
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-Za-z]*"))
            this.name = name;
        else
            this.name = "null";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (name.matches("[0-9]"))
            this.id = id;
    }

    public Character getGrade() {
        return grade;
    }

    public void setGrade(Character grade) {
        if (Character.isAlphabetic(grade))
            this.grade = grade;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        if (this.getGrade() == null)
            setGrade('X');
        if (this.getProgram() == null)
            setProgram("XXX");

        return "<Name: " + name + ", id: " + id + ", Grade: " + grade + ", Program: " + program + ">";
    }

    @Override
    public int compareTo(Student o) {
        return Comparator.comparing(Student::getName).compare(this, o);
    }
}