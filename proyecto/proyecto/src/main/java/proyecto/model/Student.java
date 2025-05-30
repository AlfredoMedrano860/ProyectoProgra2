package proyecto.model;

public class Student {
    private String name;
    private String id;
    private Curriculum curriculum;

    public Student(String name, String id, Curriculum curriculum) {
        this.name = name;
        this.id = id;
        this.curriculum = curriculum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", curriculum=" + curriculum +
                '}';
    }
}
