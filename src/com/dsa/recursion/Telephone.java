package com.dsa.recursion;

import java.util.*;
public class Telephone {

    public static void main(String[] args) {
        String s = "678";
        Map<Character,String> m = new HashMap<>();
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");
        ArrayList<String> sss = findFirst(s,m);
        System.out.println(sss.size());
        for(String i : sss){
            System.out.print(i +" ");
        }
    }

    public static ArrayList<String> findFirst(String s , Map<Character,String> m){
        if(s.isEmpty()){
            String ss = "";
            ArrayList<String> l = new ArrayList<>();
            l.add(ss);
            return l;
        }
        
        char ch = s.charAt(0); //6
        ArrayList<String> ss = findFirst(s.substring(1),m); //78
        
        ArrayList<String> ml = new ArrayList<>();
        String a = m.get(ch);
        
        for(int i = 0; i<a.length() ; i++){
            char ph = a.charAt(i);
            for(String j : ss){
                ml.add(ph + j);
            }
        }
        return ml;
    }
}
