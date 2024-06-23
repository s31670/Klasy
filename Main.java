public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Jane", "Smith");

        student1.addGrade(4.0);
        student1.addGrade(5.0);
        student2.addGrade(3.0);
        student2.addGrade(3.5);

        System.out.println(student1.calculateAverage());
        System.out.println(student2.calculateAverage());

        StudentGroup group = new StudentGroup("Group 1");
        group.addStudent(student1);
        group.addStudent(student2);
        System.out.println("Group: " + group.groupName);

    }
}
