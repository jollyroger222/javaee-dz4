package geek.javaee.s.dz4.dao;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Basic {

    public static void main(String[] args) {
        test(null);
    }

    public static void test(@NotNull String n) {
        System.out.println(n);
    }

}
