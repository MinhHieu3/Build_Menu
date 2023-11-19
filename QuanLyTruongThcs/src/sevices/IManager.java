package sevices;

public interface IManager <T>{
    void add(T add);
    void showAll();
    T search(int n,String search);
}
