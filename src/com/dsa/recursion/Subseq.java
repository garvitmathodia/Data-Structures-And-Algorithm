package com.dsa.recursion;

public class Subseq {
	public static void main(String[] args) {
		
		subseq("", "abc");
	}

	static void subseq(String p, String up) {
		if (up.isEmpty()) {
			System.out.println(p);
			return;
		}

		char ch = up.charAt(0);
		subseq(p + ch, up.substring(1));
		subseq(p, up.substring(1));
//		subseq(p+(ch+0), up.substring(1));
	}
	
}


// public static void main(String[] args) {
// 	String s = new String("abc");
// 	ArrayList<String> ans = new ArrayList<>();
// 	ArrayList<String> ss = findFirst(s , 0 , ans , "");
// 	for(String i : ss){
// 		System.out.println(i);
// 	}
// }

// public static ArrayList<String> findFirst(String s , int index , ArrayList<String> ans , String ss){
// 	if(index==s.length()){
// 		ans.add(new String(ss));
// 		return ans;
// 	}
// 	findFirst(s , index+1 , ans , ss+s.charAt(index));
// 	ss.replace(Character.toString(s.length()-1), "");
// 	findFirst(s , index+1 , ans , ss);
// 	return ans;

// }


// public static void main(String[] args) {
// 	String s = "abc";
// 	ArrayList<String> ss = findFirst(s);
	
// 	for(String i : ss){
// 		System.out.print(i +" ");
// 	}
// }

// public static ArrayList<String> findFirst(String s){
// 	if(s.isEmpty()){
// 		ArrayList<String> sss = new ArrayList<>();
// 		sss.add("");
// 		return sss;
// 	}
	
// 	char ch = s.charAt(0); //a
// 	ArrayList<String> ss = findFirst(s.substring(1)); //bc
	
// 	ArrayList<String> ml = new ArrayList<>();
	
// 	for(String i : ss){
// 		ml.add(ch+i);
// 		ml.add(""+ i);
// 	}
// 	return ml;
// }