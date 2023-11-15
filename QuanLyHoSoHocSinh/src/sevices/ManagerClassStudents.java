package sevices;

import models.Students;

import java.util.ArrayList;
import java.util.List;

public class ManagerClassStudents implements IMagager{
    List<Students> listClass=new ArrayList<>();
    @Override
    public void add(Object n) {
        listClass.add((Students) n);
    }

    @Override
    public void delete(String name) {
        for (Students p:listClass) {
            if (p.getName().equals(name)){
                listClass.remove(p);
            }
        }
    }

    @Override
    public Object search(String name2) {
        for (int i = 0; i < this.listClass.size(); i++) {
            if (this.listClass.get(i).getName().equals(name2)){
                return listClass.get(i);
            }
        }
        return null;
    }

    @Override
    public void show() {
        for (int i = 0; i < this.listClass.size(); i++) {
            System.out.println(this.listClass.get(i));
        }
    }
}
