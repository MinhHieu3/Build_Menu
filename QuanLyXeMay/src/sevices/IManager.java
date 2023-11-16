package sevices;

import models.Moto;

public interface IManager<O,T,N> {
    void add(O add);
    void edit(N a,O edit);
    void delete(T delete);
    O searchName(T search);
    void searchPrice( N price);
    void showAll();
}
