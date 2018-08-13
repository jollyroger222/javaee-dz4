/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geek.javaee.s.dz4.controller;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import geek.javaee.s.dz4.dao.TovarDAO;
import geek.javaee.s.dz4.entity.Tovar;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Collection;


/**
 *
 * @author 123
 */
@ViewScoped
@ManagedBean
public class TovarListController {

    @Inject
    private TovarDAO tovarDAO;

    public Collection<Tovar> getListTovar(){
        return tovarDAO.getListTovar1();
    }

    public String hello(){
        return "Vasya";
    }


    public void removeTovarById( String tovarId){
        TovarDAO.removeTovarById(tovarId);
    }
}
