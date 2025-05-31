package proyecto.model;

public class Student implements Identifiable{
    private String name;
    private Integer id;
    private Curriculum curriculum;

    public Student(String name, Integer id, Curriculum curriculum) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Student {" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", curriculum=" + curriculum +
                '}';
    }
}
