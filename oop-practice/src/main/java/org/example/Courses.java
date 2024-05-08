package org.example;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multipyCreditAndCourseGrade() {

        return courses.stream()
                .mapToDouble(course -> course.multiplyCreditAndCourseGrade())
                .sum();

        /*
        double mulipliedCreditAndCourseGrade = 0;
        for(Course course : courses) {
            //mulipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
            mulipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }

        return mulipliedCreditAndCourseGrade;
        */

    }

    public int calculateTotalCompletedCredit() {

        return courses.stream()
                .mapToInt(course -> course.getCredit())
                .sum();
    }
}
