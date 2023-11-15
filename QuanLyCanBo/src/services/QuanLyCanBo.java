package services;

import models.CanBo;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo implements IManager{
    List<CanBo> list=new ArrayList<>();
    @Override
    public void addCanBo(CanBo canBo) {
        list.add(canBo);

    }

    @Override
    public void xathai(String name) {
        list.removeIf(c -> c.getHoVaTen().equals(name));
    }

    @Override
    public CanBo timKiem(String name) {
        for (CanBo p:list) {
            if (p.getHoVaTen().equals(name)){
                return p;
            }

        }

        return null;
    }

    @Override
    public void showAll() {
        for (CanBo p:list) {
            System.out.println(p);
        }

    }

}
