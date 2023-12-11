package src.com.calculator.model;

public class Course {
    String name;
    int score;
    int creditHours;
    String grade;
    int gradePoint;
    String remark;

    public Course(String name, int score, int creditHours) {
        this.name = name;
        this.score = score;
        this.creditHours = creditHours;
        calculateGradeAndRemark();
    }

    public void calculateGradeAndRemark() {
        if (score >= 70 && score <= 100) {
            grade = "A";
            gradePoint = 5;
            remark = "Excellent";
        } else if (score >= 60 && score <= 69) {
            grade = "B";
            gradePoint = 4;
            remark = "Very Good";
        } else if (score >= 50 && score <= 59) {
            grade = "C";
            gradePoint = 3;
            remark = "Good";
        } else if (score >= 45 && score <= 49) {
            grade = "D";
            gradePoint = 2;
            remark = "Fair";
        } else if (score >= 40 && score <= 44) {
            grade = "E";
            gradePoint = 1;
            remark = "Pass";
        } else if (score >= 0 && score < 40) {
            grade = "F";
            gradePoint = 0;
            remark = "Fail";
        } else {
            grade = "F";
            gradePoint = 0;
            remark = "Invalid Score";
        }
    }

    public int getCreditHours() {
        return creditHours;
      }

      public int getGradePoint() {
        return gradePoint;
      }

    public double getQualityPoint() {
        return gradePoint * creditHours;
    }

    public String getGradeString() {
        return grade + " (" + gradePoint + ")";
    }
}