package serviecs;

import models.Library;

public interface IManager <Library>{
    void addDocument(models.Library library);

    void deleteDocument(String name);

    void showAll();

}