package com.example.codiblytasks.tasktwo;

public class Main {
    public static void main(String[] args)  {
        BalancedWordCounter balance =new BalancedWordCounter();
        System.out.println(balance.count("aabbabcccba"));
        System.out.println(balance.count("ear"));
        System.out.println(balance.count("aa"));
        System.out.println(balance.count("ab"));
        System.out.println(balance.count("a"));
        System.out.println(balance.count(""));
        //System.out.println(balance.count("abababa1"));
        //System.out.println(balance.count(null));

    }
}