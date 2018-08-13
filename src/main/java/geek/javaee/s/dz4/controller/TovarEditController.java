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

public class TovarEditController {
    @Inject
    private TovarDAO tovarDAO;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tovar getTovar() {
        return tovar;
    }

    public void setTovar(Tovar tovar) {
        this.tovar = tovar;
    }

    private Tovar tovar=new Tovar();

    public void init(){
        final Tovar tovar=tovarDAO.getTovarById(id);
        if(tovar != null) this.tovar=tovar;
    }

    public String save(){
        tovarDAO.merge(tovar);
        return "tovar";
    }



    public Collection<Tovar> getListTovar(){
        return tovarDAO.getListTovar1();
    }






    public void removeTovarById( String tovarId){
        TovarDAO.removeTovarById(tovarId);
    }
}
