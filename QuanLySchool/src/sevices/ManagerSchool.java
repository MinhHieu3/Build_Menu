package sevices;

import models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ManagerSchool implements IManager<Object, String> {
    List<Teacher> teacherList = new ArrayList<>();

    @Override
    public void showAll() {
        for (Teacher p : teacherList) {
            System.out.println(p);
        }

    }

    @Override
    public void add(Object nameTeacher) {
        teacherList.add((Teacher) nameTeacher);

    }

    @Override
    public void edit(String name, Object teacher) {
        int index = -1;
        for (int i = 0; i < this.teacherList.size(); i++) {
            if (name == this.teacherList.get(i).getNameTeacher()) {
                index = i;
            }
        }
        this.teacherList.set(index, (Teacher) teacher);
    }

    @Override
    public void delete(String nameTeachers) {
        for (Teacher p:teacherList) {
            if(p.getNameTeacher().equals(nameTeachers)){
                teacherList.remove(p);
            }
        }
    }

    @Override
    public Object search(String nameSubject) {
        for (Teacher p : teacherList) {
            if (p.getSubject().equals(nameSubject)) {
                return p;
            }
        }
        return null;
    }
    public void ascendingUp(){
        List <Teacher> list=new ArrayList<>();
        list.sort((a,b)->Float.compare((float) a.getWega(),(float) b.getWega()));
        teacherList.add((Teacher) list);
        System.out.println(teacherList);

    }
}
