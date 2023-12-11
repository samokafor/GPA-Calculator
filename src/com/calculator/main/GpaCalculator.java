package src.com.calculator.main;


import src.com.calculator.util.InputValidator;
import src.com.calculator.model.Course;
import src.com.calculator.util.CalculateGpaUtil;
import java.util.Scanner;

class GpaCalculator {
    public static void main(String args[]) {
        System.out.println("Hello, This GPA Calculator was \nCreated by Samuel Nwachukwu Okafor \nIn collaboration with Elev8!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's get to business... ");

        int numberOfCourses = InputValidator.getValidIntegerInput(scanner, "How many courses have you offered? ", 1,
                Integer.MAX_VALUE);

        scanner.nextLine();

        Course[] courses = new Course[numberOfCourses];
        String[] courseCodes = new String[numberOfCourses];

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("\nEnter details for Course " + (i + 1));

            String courseName = InputValidator.getNonEmptyStringInput(scanner, "Enter course name only (E.g, PHY): ");
            String courseCode = InputValidator.getNonEmptyStringInput(scanner, "Enter course code only (E.g., 422): ");


            int courseScore = InputValidator.getValidIntegerInput(scanner,
                    "Enter your score for " + courseName + " " + courseCode + ": ", 0, 100);
            int creditHours = InputValidator.getValidIntegerInput(scanner,
                    "Enter credit hours for " + courseName + " " + courseCode + ": ", 1, Integer.MAX_VALUE);

            courses[i] = new Course(courseName, courseScore, creditHours);
            courseCodes[i] = courseName + " " + courseCode;
        }

        
        System.out
                .println("\n|----------------------------|-----------------------|------------|---------------------|");
        System.out.println("| COURSE & CODE              | COURSE UNIT           | GRADE      | GRADE-UNIT          |");
        System.out.println("|----------------------------|-----------------------|------------|---------------------|");

        for (int i = 0; i < numberOfCourses; i++) {
            System.out.printf("| %-26s | %-21d | %-10s | %-19d |\n", courseCodes[i], courses[i].getCreditHours(),
                    courses[i].getGradeString(), courses[i].getGradePoint());
        }

        System.out.println("|---------------------------------------------------------------------------------------|");

        double gpa = CalculateGpaUtil.calculateGPA(courses);

        System.out.printf("\nYour GPA is: %.2f\n", gpa);
        }
    }

