package geek.javaee.s.dz4.dao;

import geek.javaee.s.dz4.entity.Order;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
public class OrderDAO {



    @NotNull
    private  Map<String, Order> orders = new LinkedHashMap<>();

    @NotNull
    public  Collection<Order> getListOrder1() {
        return orders.values();
    }

    @PostConstruct
    private void init() {
        merge(new Order("zakaz 1"));
        merge(new Order("zakaz 2"));
        merge(new Order("zakaz 3"));
    }



//    @Nullable
//    public Tovar getTovarById(@Nullable final String tovarId) {
//        if (tovarId == null || tovarId.isEmpty()) return null;
//        return tovars.get(tovarId);
//    }

    @Nullable
    public Order merge(@Nullable final Order order) {
        if (order == null) return null;
        @Nullable final String id = order.getId();
        if (id == null || id.isEmpty()) return null;
        this.orders.put(id, order);
        return order;
    }

//    public void removeProjectById(@Nullable final String tovarsId) {
//        if (tovarsId == null || tovarsId.isEmpty()) return;
//        if (!tovars.containsKey(tovarsId)) return;
//        tovars.remove(tovarsId);
//    }

}