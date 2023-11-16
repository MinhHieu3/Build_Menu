package sevices;

import models.Teacher;

public interface IManager <O,S>{
    void showAll();
    void add(O add);
    void edit(S edit, O o);
    void delete(S delete);

    O search(S search);

}
