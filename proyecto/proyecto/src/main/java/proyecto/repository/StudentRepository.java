package proyecto.repository;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;
import proyecto.model.Student;

@Repository
public class StudentRepository extends CRUDMemory<Student>{
    public StudentRepository(){
    }

    @Override
    public Student patch(Student student){
        for (Student element:data){
            if (element.getId().intValue() == student.getId().intValue()){
                if (student.getName() != null){
                    element.setName(student.getName());
                }
                return element;
            }
        }
        return null;
    }
}
