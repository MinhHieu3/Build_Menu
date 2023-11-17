package sevices;

import models.Product;

public interface IManager<T, N> {
    void add(T add);

    void showAll();


    void edit(int n, T edit);

    void delete(int delelte);

    T search(N search);


}
