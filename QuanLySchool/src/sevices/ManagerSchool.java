package sevices;

import models.Teacher;

import java.util.ArrayList;
import java.util.Comparator;
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
            if (this.teacherList.get(i).getNameTeacher().equals(name)) {
                index = i;
            }
        }
        this.teacherList.set(index, (Teacher) teacher);
    }

    @Override
    public void delete(String nameTeachers) {
        for (Teacher t : teacherList) {
            if (t.getNameTeacher().equals(nameTeachers)) {
                teacherList.remove(t);
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

    public void ascendingUp() {
        List<Teacher> list = new ArrayList<>(teacherList);
        list.sort(Comparator.comparingDouble(Teacher::getWega));
        System.out.println(teacherList);

    }
}
