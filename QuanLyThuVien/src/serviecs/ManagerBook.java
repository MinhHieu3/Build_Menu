package serviecs;


import models.Book;
import models.Library;
import models.Magazine;
import models.Newspaper;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public  class ManagerBook implements IManager{
    List<Library> list=new ArrayList<>();

    @Override
    public void addDocument(Library library) {

        list.add(library);
    }


    @Override
    public void deleteDocument(String name) {
            list.removeIf(c -> c.getMaTaiLieu().equals(name));
    }



    @Override
    public void showAll() {
        for (Library p:list){
            System.out.println(p);
        }

    }


    public Object findBook(String name){
        for (Library p: list) {
            if (p instanceof Book&&((Book)p).getTenTacGia().equals(name)){
                return p;

            }
        }
        return "Not Found";
    }
    public Object findMagazine(int a) {
        for (Library b : list) {
            if (b instanceof Magazine&&b.getSoPhatHanh()==a);
            return b;

        }
        return "Not Found";

    }
    public Object findNewspaper(int c){
        for (Library d:list) {
            if (d instanceof Newspaper&& ((Newspaper) d).getNgayPhatHanh()==c){
                return d;
            }
        }
        return "Not Found";
    }




}
