package com.hspedu.mhl.service;

import com.hspedu.mhl.dao.DiningTableDao;
import com.hspedu.mhl.domain.DiningTable;

import java.util.List;

public class DiningTableService {
    private DiningTableDao diningTableDao = new DiningTableDao();
    public List<DiningTable> list(){
        return diningTableDao.queryMulti("select id, state from diningTable",DiningTable.class);


    }
    public DiningTable getDiningTableById(int id){
        return diningTableDao.querySingle("select * from diningTable where id = ?",DiningTable.class,id);
    }
    public boolean orderDiningTable(int id,String orderName,String orderTel){
        int update = diningTableDao.update("update diningTable set state = '已经预定',orderName = ?,orderTel= ?where id = ?", orderName, orderTel,id);
        return update > 0;
    }
    public boolean updateDiningTableState(int id, String state){
       int date = diningTableDao.update("update diningTable set state=? where id=?",state,id);
        return date > 0;

    }
    public boolean updateDiningTableToFree(int id, String state){
        int date = diningTableDao.update("update diningTable set state=?,orderName='',orderTel='' where id=?",state,id);
        return date > 0;

    }

}
