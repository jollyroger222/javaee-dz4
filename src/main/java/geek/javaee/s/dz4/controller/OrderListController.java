package geek.javaee.s.dz4.controller;

import geek.javaee.s.dz4.dao.OrderDAO;
import geek.javaee.s.dz4.entity.Order;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;


@ViewScoped
@ManagedBean
public class OrderListController {

    @Inject
    private OrderDAO orderDAO;

    public Collection<Order> getListOrder(){
        return orderDAO.getListOrder1();
    }

}




