package com.example;

public class Main {

    public static void main(String[] args) {
        String s = "aabbaddba";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        int count = 0;
        for(int i = 0; i < s.length(); ++i){
            System.out.println("char at " + i + ": " + s.charAt(i));
            sb.append(s.charAt(i));
            System.out.println("sb= " + sb);
            reverse.append(sb.toString());
            if(sb.toString().equals(reverse.reverse().toString())){
                System.out.println("sbreverse= " +reverse);
                count = reverse.length();
            }
            reverse.delete(0,reverse.length());
        }
        return String.valueOf(count);
    }
}
