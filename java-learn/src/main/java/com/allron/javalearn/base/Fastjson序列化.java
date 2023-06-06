package com.allron.javalearn.base;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * Fastjson序列化与反序列化对象
 *
 * @author Allron
 * @date 19/8/29
 */
public class Fastjson序列化 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JSONobject ins = new JSONobject();
        ins.setColor("red");
        ins.setObj("s");
        //序列化
        String text = JSON.toJSONString(ins);
        System.out.println(text);
        //反序列化
        JSONobject ins1 = JSON.parseObject(text, JSONobject.class);
        System.out.println(ins1.getColor());
        System.out.println(ins1.getObj());
    }
}

@Data
class JSONobject {
    private String obj;
    private String color;
}