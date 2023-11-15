package services;

import models.CanBo;

public interface IManager <Canbo>{
    void addCanBo(CanBo canBo);
    CanBo timKiem(String canbo);
    void xathai(String name);
    void showAll();

}
