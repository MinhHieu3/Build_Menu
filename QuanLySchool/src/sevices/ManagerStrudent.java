package sevices;

import models.Strudent;

import java.util.ArrayList;
import java.util.List;

public class ManagerStrudent implements IManager <Object,String>{
    List<Strudent> strudentList=new ArrayList<>();
    @Override
    public void showAll() {
        for (Strudent p:strudentList) {
            System.out.println(p);
        }
    }

    @Override
    public void add(Object strudent) {
     strudentList.add((Strudent) strudent);

    }

    @Override
    public void edit(String editStrudent, Object strudent) {
        int index=-1;
        for (int i = 0; i < this.strudentList.size(); i++) {
            if( this.strudentList.get(i).getNameStrudent().equals(editStrudent)){
                index=i;
            }
        }
        this.strudentList.set(index,(Strudent) strudent);

    }

    @Override
    public void delete(String nameStrudents) {
        for (Strudent p:strudentList) {
            if (p.getNameStrudent().equals(nameStrudents));
           strudentList.remove(p);
        }
    }

    @Override
    public Object search(String nameStrudent) {
        for (Strudent p:strudentList) {
            if (p.getNameStrudent().equals(nameStrudent)){
                return nameStrudent;
            }
        }
        return "Not Found";
    }
    public void showList1(){
        for (Strudent p:strudentList) {
            System.out.println(p.getStt()+p.getNameStrudent()+p.Medium());
        }
    }
    public void showList2(){
        for (Strudent p:strudentList) {
            if (p.Medium()>8.5&&p.getMath()>=8&&p.getPhysical()>=8&&p.getChemistry()>=8){
                System.out.println(p);
            }
            else {
                System.out.println("Không Có Học Sinh Giỏi");
            }
        }
    }
    public void showList3(){
        for (Strudent p:strudentList) {
            if (p.Medium()<5||p.getMath()<5||p.getPhysical()<5||p.getChemistry()<5){
                System.out.println(p+"\n Trượt" );
            }
        }
    }
    public void showList4(){
        for (Strudent p:strudentList) {
            if (p.Medium()>=5&&p.getMath()>=5&&p.getPhysical()>=5&&p.getChemistry()>=5){
                System.out.println(p+"\n Lên Lớp" );
            }
        }
    }
}
