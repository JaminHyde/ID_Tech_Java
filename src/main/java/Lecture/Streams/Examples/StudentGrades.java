package Lecture.Streams.Examples;

import java.util.*;
import java.util.stream.Collectors;

public class StudentGrades {
    public static void main(String[] args) {
        List<Grade> grades = new ArrayList<>();
        grades.add(new Grade("John", "Math", 85));
        grades.add(new Grade("John", "Science", 90));
        grades.add(new Grade("John", "English", 75));
        grades.add(new Grade("Emily", "Math", 95));
        grades.add(new Grade("Emily", "Science", 80));
        grades.add(new Grade("Emily", "English", 92));
        grades.add(new Grade("David", "Math", 88));
        grades.add(new Grade("David", "Science", 87));
        grades.add(new Grade("David", "English", 90));

        Map<String, Double> averageGradesByStudent = grades.stream()
                .collect(Collectors.groupingBy(Grade::getStudentName,
                        Collectors.averagingDouble(Grade::getGrade)));

        System.out.println("Average grades by student: " + averageGradesByStudent);
    }
}

class Grade {
    private String studentName;
    private String courseName;
    private int grade;

    public Grade(String studentName, String courseName, int grade) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }
}

