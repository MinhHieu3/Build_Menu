package sevices;

import models.People;

import java.util.ArrayList;
import java.util.List;

public class ManagerTown implements IManager {
    List<People> list=new ArrayList<>();
    @Override
    public void add(Object o) {
        list.add((People)o);

    }

    @Override
    public void delete(int n) {
        for (People p :list) {
            if (p.getId()==n){
                list.remove(p);

            }
        }

    }
    public void delete2(String name2) {
        list.removeIf(n -> n.getName().equals(name2));
    }
    @Override
    public Object search(String name) {
        for (People p:list) {
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
    public Object search2(String name2) {
        for (People n:list) {
            if(n.getName().equals(name2)){
                return n;
            }
        }
        return null;
    }

    @Override
    public void showAll() {
        for (People p:list) {
            System.out.println(p);
        }

    }

}
