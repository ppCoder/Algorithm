package test;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        /**
         * Collection类
         */
        Collection collection;
        List list;
        Map map;
        Set set;
        Iterator iterator;
        Vector vector;
        ArrayList arrayList;
        LinkedList linkedList;
        HashMap hashMap;
        HashSet hashSet;


        /**
         * 基本数据类型
         */
        Integer integer;
        BigDecimal bigDecimal;
        String string;

        /**
         * 线程安全
         */
        AtomicInteger atomicInteger;
        ThreadLocal threadLocal;
        ConcurrentHashMap concurrentHashMap;

        /**
         * 位运算符
         */
        int n = 3;
        int hash = 8;
        int i = (n-1) & hash;
        System.out.printf("%d",i);

        /**
         * 多线程
         */
        Thread thread = new Thread();
        thread.start();
    }
}
