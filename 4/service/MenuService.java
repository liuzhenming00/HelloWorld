package com.hspedu.mhl.service;

import com.hspedu.mhl.dao.MenuDao;
import com.hspedu.mhl.domain.Menu;


import java.util.List;

public class MenuService {
    private MenuDao menuDao = new MenuDao();

    public List<Menu> list(){
        return menuDao.queryMulti("select * from menu",Menu.class);
    }
    public Menu getMenuById(int id){
        return menuDao.querySingle("select * from menu where id = ?",Menu.class,id);
    }
}
