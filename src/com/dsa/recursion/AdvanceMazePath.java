package com.dsa.recursion;
import java.util.*;;
public class AdvanceMazePath {

    public static void main(String[] args) {
        int sr = 1;
        int sc = 1;
        int dr = 4;
        int dc = 4;
        ArrayList<String> s = findFirst(sr , sc , dr , dc);
        for(String ss : s){
            System.out.print(ss + " ");
        }
    }

    public static ArrayList<String> findFirst(int sr , int sc , int dr , int dc){
        
        if(sr==dr && sc==dc){
            ArrayList<String> p = new ArrayList<>();
            p.add("");
            return p;
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(int i = 1 ; i<=dc-sc ; i++){
            ArrayList<String> r = findFirst(sr , sc+i , dr , dc);
            for(String s : r){
                paths.add("h"+i+s);
            }
        }
        
        for(int i = 1 ; i<=dr-sr ; i++){
            ArrayList<String> v = findFirst(sr+i , sc , dr , dc);
            for(String s : v){
                paths.add("v"+i+s);
            }
        }
        
        for(int i = 1 ; i<=dc-sc && i<=dr-sr ; i++){
             ArrayList<String> d = findFirst(sr+i , sc+i , dr , dc);
             for(String s : d){
                 paths.add("d"+i+s);
             }
        }
        
        return paths;
    }
}
