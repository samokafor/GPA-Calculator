package src.com.calculator.util;

import src.com.calculator.model.Course;

public class CalculateGpaUtil {
    public static double calculateGPA(Course[] courses) {
        double totalQualityPoints = 0;
        int totalCreditHours = 0;

        for (Course course : courses) {
            totalQualityPoints += course.getQualityPoint();
            totalCreditHours += course.getCreditHours();
        }

        return totalQualityPoints / totalCreditHours;
    }
}
