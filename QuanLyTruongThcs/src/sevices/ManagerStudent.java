package sevices;

import models.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerStudent implements IManager<Student> {
    List<Student> studentList = new ArrayList<>();
    public ManagerStudent() {
        studentList.add(new Student("Hiếu","Ninh Bình",19));
        studentList.add(new Student("Trang","Ninh Bình",20));
        studentList.add(new Student("Minh Hiếu","DN",23));
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void showAll() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(this.studentList.get(i));
        }
    }
    public void showStudent(){
        for (Student p:studentList) {
            if (p.getAge()==20){
                System.out.println(p);
            }
        }
    }

    @Override
    public Student search(int n, String homeTowns) {
        Map<Integer,String>map=new HashMap<>();
        for (Student p:studentList) {
            if (p.getAge()==23&&p.getHomeTown().equals(homeTowns)){
                if (map.containsKey(p)){
                    map.put(p.getAge(),map.get(p)+1);
                }
            }
        }
        for (Map.Entry<Integer,String> p:map.entrySet()) {
            System.out.println(p);
        }
        return null;
    }
}
