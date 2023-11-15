package sevices;

import models.Moto;

import java.util.ArrayList;
import java.util.List;

public class ManagerMoto implements IManager{
    List<Moto> motoList=new ArrayList<>();

    @Override
    public void add(Object object) {
        motoList.add((Moto) object);

    }

    @Override
    public void edit(int a,Moto moto) {
        int index=-1;
        for (int i = 0; i < this.motoList.size(); i++) {
            if(a==this.motoList.get(i).getId()){
                index=i;
            }
        }
        System.out.println(this.motoList.set(index,moto));

    }

    @Override
    public Object delete(String name) {
        for (Moto p:motoList) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return "Not Found";
    }

    @Override
    public void searchName(String nameMoto) {
        for (Moto p:motoList) {
            if (p.getName().contains(nameMoto)){
                System.out.println(p);
            }
        }

    }
    public void search(int a){
        for (Moto p:motoList) {
            if(p.getId()==a){
                System.out.println(p);
            }
        }
    }

    @Override
    public void searchPrice(int price) {
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
        motoList.sort((a,b)->Float.compare((float) a.getCc(),(float) b.getCc()));
        System.out.println(motoList);

    }
    public void ascendingDown(){
        motoList.sort((a,b)->Float.compare((float) b.getCc(),(float) a.getCc()));
        System.out.println(motoList);

    }
}
