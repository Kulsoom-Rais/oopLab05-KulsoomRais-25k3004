import java.util.ArrayList;
import java.util.Iterator;

class Student {
    String name;
    double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

public class StudentManager {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // Add at least 5 students
        students.add(new Student("Kulsoom", 3.8));
        students.add(new Student("Sara", 3.2));
        students.add(new Student("Ali", 1.9));
        students.add(new Student("Maryum", 3.9));
        students.add(new Student("Ahmad", 2.5));

        // Remove students with GPA below 2.0
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.gpa < 2.0) {
                it.remove();
            }
        }

        // Find topper student
        Student topper = students.get(0);
        for (Student s : students) {
            if (s.gpa > topper.gpa) {
                topper = s;
            }
        }

        // Count students eligible for Dean’s List (GPA > 3.5)
        int deanCount = 0;
        for (Student s : students) {
            if (s.gpa > 3.5) {
                deanCount++;
            }
        }

        // Show modified student list
        System.out.println("Modified Student List:");
        for (Student s : students) {
            System.out.println(s.name + " - GPA: " + s.gpa);
        }

        System.out.println("\nTopper: " + topper.name + " (GPA: " + topper.gpa + ")");
        System.out.println("Students eligible for Dean’s List: " + deanCount);
    }
}
