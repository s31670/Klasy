import java.util.HashSet;

public class StudentGroup {
    public String groupName;
    public HashSet<Student> students;

    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new HashSet<>();
    }

    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Group can't have more than 15 students.");
        }
        if (!students.add(student)) {
            throw new IllegalStateException("Student is already in the group.");
        }
    }
}

