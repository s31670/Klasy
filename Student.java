import java.util.ArrayList;

public class Student {
    public String name;
    public String surname;
    public ArrayList<Double> grades;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grades.size() < 20) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Student can't have more than 20 grades.");
        }
    }

    public double calculateAverage() {
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("No grades available to calculate average.");
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();
        return roundGrade(average);
    }

    private double roundGrade(double average) {
        double[] possibleGrades = {2, 2.5, 3, 3.5, 4, 4.5, 5};
        double closest = possibleGrades[0];
        for (double grade : possibleGrades) {
            if (Math.abs(average - grade) < Math.abs(average - closest)) {
                closest = grade;
            }
        }
        return closest;
    }
}

