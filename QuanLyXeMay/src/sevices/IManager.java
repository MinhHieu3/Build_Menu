package sevices;

import models.Moto;

public interface IManager {
    void add(Object object);
    void edit(int a, Moto moto);
    Object delete(String name);
    void searchName(String nameMoto);
    void searchPrice( int price);
    void showAll();
}
