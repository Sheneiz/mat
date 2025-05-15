// StudentRegistry.java
import java.util.*;

public class StudentRegistry {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }
    public void removeStudent(String indexNumber) {
        students.removeIf(s -> s.getIndexNumber().equals(indexNumber));
    }
    public Student findStudent(String indexNumber) {
        for (Student s : students) {
            if (s.getIndexNumber().equals(indexNumber)) return s;
        }
        return null;
    }
    public List<Student> getAllStudents() { return students; }
}