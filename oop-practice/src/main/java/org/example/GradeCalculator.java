package org.example;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;
    //private final List<Course> courses;

    public GradeCalculator(List<Course> courses) {
        
        this.courses = new Courses(courses);
    }

    public double calculateGrade() {

        // (학점수×교과목 평점)의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multipyCreditAndCourseGrade();

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        // return mulipliedCreditAndCourseGrade / totalCompletedCredit;
        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
