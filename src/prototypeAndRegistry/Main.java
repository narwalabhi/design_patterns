package prototypeAndRegistry;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        StudentRegistry studentRegistry = new StudentRegistry();

        Student student1 = new Student(1, "John Doe", 1, "Batch 1", "Module 1", "Track 1", 2020, "Instructor 1", 2021, "Payment Partner 1", 1);
        Student student2 = new Student(2, "John tho", 1, "Batch 2", "Module 1", "Track 1", 2020, "Instructor 1", 2021, "Payment Partner 1", 1);

        studentRegistry.addStudent(student1.getBatchName(), student1);
        studentRegistry.addStudent(student2.getBatchName(), student2);

        Student s3 = studentRegistry.getStudent("Batch 1").clone();
        s3.setId(3);
        s3.setName("Jane Dough");

        Student s4 = studentRegistry.getStudent("Batch 2").clone();
        s4.setId(4);
        s4.setName("Jane though");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(s3);
        System.out.println(s4);
    }


}
