package com.example;

public class Main {

    public static void main(String[] args) {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        int longest = 0;
        int count;
        int firstIndex = 0;
        for(int i = 0; i < s.length(); ++i){
            for(int j = i; j < s.length(); ++j){
                System.out.println("char at " + j + ": " + s.charAt(j));
                sb.append(s.charAt(j));
                System.out.println("sb= " + sb);
                reverse.append(sb.toString());
                if(sb.toString().equals(reverse.reverse().toString())){
                    System.out.println("sbreverse= " +reverse);
                    count = reverse.length();
                    if(count > longest){
                        longest = count;
                        firstIndex = i;
                    }
                }
                reverse.delete(0,reverse.length());
            }
            sb.delete(0,sb.length());
        }
        sb.append(s);
        return sb.substring(firstIndex,firstIndex+longest);
    }
}
