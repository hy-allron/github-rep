package com.allron.javalearn.algorithm.csdn每日一题;

/**
 * 描述：30天中，从第一天开始五天学习，一天休息、一天锻炼，输出每天是应该学习还是休息还是锻炼 <br>
 * 作者：allron <br>
 * 修改日期：2021/10/12 15:47 <br>
 * E-mail: hyshizhe@163.com <br>
 */
public class _20211012输出每天是应该学习还是休息还是锻炼 {
    public static void main(String[] args) {
        int n1=0,n2=0,n3=0,i;
        for(i=1;i<=30;i++){
            if(n1<5){
                System.out.println("学习");
                n1++;
                continue;
            }
            else{
                System.out.println("休息");
                System.out.println("锻炼");
                n1=0;
                i++;
            }
        }
    }
}

