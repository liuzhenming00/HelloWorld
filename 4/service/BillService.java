package com.hspedu.mhl.service;

import com.hspedu.mhl.dao.BillDAO;
import com.hspedu.mhl.domain.Bill;
import com.hspedu.mhl.domain.DiningTable;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

public class BillService {
    private BillDAO billDAO = new BillDAO();
    private MenuService menuService = new MenuService();
    private DiningTableService diningTableService = new DiningTableService();

    public boolean orderMenu(int menuId,int nums, int diningTableId){
        String billID = UUID.randomUUID().toString();
        int update = billDAO.update("insert into bill values(null,?,?,?,?,?,now(),'未结账')",
                billID, menuId, nums, menuService.getMenuById(menuId).getPrice() * nums, diningTableId);
        if (update <= 0){
                    return false;
                }
        return diningTableService.updateDiningTableState(diningTableId,"就餐中");

    }
    public List<Bill> list(){
        return billDAO.queryMulti("select * from bill",Bill.class);
    }
    public boolean hasPayBillByDiningTableId(int diningTableId){
        Bill bill = billDAO.querySingle("select * from bill where diningTableId = ? and state = '未结账' limit 0,1", Bill.class, diningTableId);
        return bill != null;


    }
    public boolean payBill(int diningTaleId,String payMode){
        int update = billDAO.update("update bill set state = ? where diningTableId=? and state = '未结账'", payMode, diningTaleId);
        if (update <= 0){
            return false;
        }
        if (!diningTableService.updateDiningTableToFree(diningTaleId,"空")){
            return false;
        }
        return true;
    }
}
