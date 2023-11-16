package sevices;

import models.Moto;

import java.util.ArrayList;
import java.util.List;

public class ManagerMoto implements IManager <Object,String,Integer>{
    List<Moto> motoList=new ArrayList<>();

    @Override

    public void add(Object moto) {
        motoList.add((Moto) moto);
    }

    @Override
    public void edit(Integer a,Object moto) {

        int index=-1;
        for (int i = 0; i < this.motoList.size(); i++) {
            if (a == this.motoList.get(i).getId()) {
                index = i;
            }
        }
        System.out.println(this.motoList.set(index,(Moto) moto));

    }


    @Override
    public void delete( String name) {
        for (Moto p:motoList) {
            if (p.getName().equals(name)){
                motoList.remove(p);
            }
        }
    }

    @Override
    public Object searchName(String nameMoto) {
        for (Moto p : motoList) {
            if (p.getName().contains(nameMoto)) {
                System.out.println(p);
            }
        }
        return "Not Found";

    }
    @Override
    public void searchPrice(Integer price) {
        for (Moto p:motoList) {
            if (p.getPrice()==price){
                System.out.println(p);
            }
        }
    }

    @Override
    public void showAll() {
        for (Moto p:motoList) {
            System.out.println(p);
        }
    }
    public void ascendingUp(){
        List<Moto> motoList1=new ArrayList<>();
        motoList1.sort((a,b)->Float.compare((float) a.getCc(),(float) b.getCc()));
        motoList.add((Moto) motoList1);
        System.out.println(motoList);

    }
    public void ascendingDown(){
        List<Moto> motoList1=new ArrayList<>();
        motoList1.sort((a,b)->Float.compare((float) b.getCc(),(float) a.getCc()));
        motoList.add((Moto) motoList1);
        System.out.println(motoList);

    }
}
