/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geek.javaee.s.dz4.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import geek.javaee.s.dz4.entity.Tovar;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author 123
 */
@ApplicationScoped
public class TovarDAO {



    @NotNull
    private static Map<String, Tovar> tovars = new LinkedHashMap<>();
    
    @NotNull
    public Collection<Tovar> getListTovar1() {
        return tovars.values();
    }
    
    @PostConstruct
    private void init() {
        merge(new Tovar("tovar 1"));
        merge(new Tovar("tovar 2"));
        merge(new Tovar("tovar 3"));
        merge(new Tovar("tovar 4"));
        merge(new Tovar("tovar 5"));
    }

    

    @Nullable
    public Tovar getTovarById(@Nullable final String tovarId) {
        if (tovarId == null || tovarId.isEmpty()) return null;
        return tovars.get(tovarId);
    }

    @Nullable
    public Tovar merge(@Nullable final Tovar tovar) {
        if (tovar == null) return null;
        @Nullable final String id = tovar.getId();
        if (id == null || id.isEmpty()) return null;
        this.tovars.put(id, tovar);
        return tovar;
    }

    public static void removeTovarById(@Nullable final String tovarId) {
        if (tovarId == null || tovarId.isEmpty()) return;
//        if (!tovars.containsKey(tovarId)) return;
        tovars.remove(tovarId);
    }

}