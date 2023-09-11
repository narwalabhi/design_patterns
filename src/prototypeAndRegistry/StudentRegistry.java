package prototypeAndRegistry;

import java.util.HashMap;

public class StudentRegistry {

    private final HashMap<String, Student> studentRegistry = new HashMap<>();

    public StudentRegistry() {
    }

    public void addStudent(String key, Student student) {
        if (studentRegistry.containsKey(key)){
            throw new IllegalArgumentException("Student already exists");
        }
        studentRegistry.put(key, student);
    }

    public Student getStudent(String key) {
        if (!studentRegistry.containsKey(key)){
            throw new IllegalArgumentException("Student does not exist");
        }
        return studentRegistry.get(key);
    }

}
