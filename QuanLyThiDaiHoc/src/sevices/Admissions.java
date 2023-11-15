package sevices;

import models.In4;

import java.util.ArrayList;
import java.util.List;

public class Admissions implements IMagager{
    List<In4> list=new ArrayList<>();
    @Override
    public void addThiSinh(In4 in4) {
        list.add(in4);

    }

    @Override
    public void showAll() {
        for (In4 p: list) {
            System.out.println(p);
        }

    }

    @Override
    public In4 searchSobaoDanh(int in4) {
        for (In4 p: list) {
            if (p.getSoBaoDanh()==in4){
                return p;
            }
        }
        return null;
    }
}
