package proyecto.model;

import java.util.ArrayList;

public class Curriculum {

    private ArrayList<String> softSkills;
    private ArrayList<String> technicalSkill;
    private ArrayList<String> certifications;
    private ArrayList<String> titles;
    private Integer id;
    //private Student student;


    public Curriculum(ArrayList<String> softSkills, ArrayList<String> technicalSkill, ArrayList<String> certifications, ArrayList<String> titles, Integer id) {
        this.softSkills = softSkills;
        this.technicalSkill = technicalSkill;
        this.certifications = certifications;
        this.titles = titles;
        this.id = id;
    }

    public Curriculum(){

    }

    public ArrayList<String> getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(ArrayList<String> softSkills) {
        this.softSkills = softSkills;
    }

    public ArrayList<String> getTechnicalSkill() {
        return technicalSkill;
    }

    public void setTechnicalSkill(ArrayList<String> technicalSkill) {
        this.technicalSkill = technicalSkill;
    }

    public ArrayList<String> getCertifications() {
        return certifications;
    }

    public void setCertifications(ArrayList<String> certifications) {
        this.certifications = certifications;
    }

    public ArrayList<String> getTitles() {
        return titles;
    }

    public void setTitles(ArrayList<String> titles) {
        this.titles = titles;
    }

//    public Student getStudent() {
//        return student;
//    }
//
//    public void setStudent(Student student) {
//        this.student = student;
//    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Curriculum{" +
                "softSkills=" + softSkills +
                ", technicalSkill=" + technicalSkill +
                ", certifications=" + certifications +
                ", titles=" + titles +
                ", id=" + id +
                '}';
    }
}
