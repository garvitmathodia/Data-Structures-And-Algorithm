package com.dsa.recursion;
import java.util.*;
public class MazePath {

    public static void main(String[] args) {
        int sr = 0;
        int sc = 0;
        int dr = 2;
        int dc = 2;
        int[][] arr = new int[3][3];
        ArrayList<String> s = findFirst(arr , sr , sc , dr , dc);
        for(String ss : s){
            System.out.print(ss + " ");
        }
    }

    public static ArrayList<String> findFirst(int[][] arr, int sr , int sc , int dr , int dc){
        
        if(sr==dr && sc==dc){
            ArrayList<String> ss = new ArrayList<>();
            ss.add(new String(""));
            return ss;
        }
        
        ArrayList<String> d = new ArrayList<>();
        ArrayList<String> r = new ArrayList<>();
        
        if(sr<arr.length){
            d = findFirst(arr , sr+1 , sc , dr , dc);
        }
        
        if(sc<arr[0].length){
           r = findFirst(arr , sr , sc+1 , dr , dc);
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String s : d){
            paths.add("D" + s);
        }
        
        for(String s : r){
            paths.add("R" + s);
        }
        
        return paths;
    }
}
