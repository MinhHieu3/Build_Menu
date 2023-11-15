package sevices;

import java.util.ArrayList;
import java.util.List;

public class Street implements IMagager{
    private List<Family> families;

    public Street() {
        this.families = new ArrayList<>();
    }

    @Override
    public void addNember(Object object) {
        families.add((Family) object);
    }

    @Override
    public void deleteNember(int a) {
        for (Family p:families) {
           if (p.getHouseNumber()==a){
               families.remove(p);
           }
        }

    }

    @Override
    public Object searchNumber(int n) {
        for (Family b:families) {
            if (b.getHouseNumber()==n){
                return b;

            }
        }
        return null;
    }
    public Object searchPeopleNumber(int d){
        for (Family  c:families) {
            if (c.getPersonNumber()==d){
                return c;
            }
        }
        return null;
    }

    public void showAll() {
        for (Family p:families) {
            System.out.println(p);
        }

    }
}
