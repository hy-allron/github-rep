package com.allron.javalearn.base;

import com.allron.javalearn.base.字符串.String认识;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Allron
 * @date 19/7/21
 */
public class Foreach里的removeandadd {
    public static void main(String认识[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        Iterator<String> iterator = list.iterator();
        /*while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }*/


        /*for (String item : list) {
            if ("2".equals(item)) {
                //remove 1 没问题,remove 2 则抛出java.util.ConcurrentModificationException
                //list.remove(item);
                //list.add("3");java.util.ConcurrentModificationException
            }
        }*/

        for(int i=0;i<list.size();i++){
            if("2".equals(list.get(i))){
                //list.remove(list.get(i));
                list.add("3");
            }
        }
        System.out.println(list);
    }
}
