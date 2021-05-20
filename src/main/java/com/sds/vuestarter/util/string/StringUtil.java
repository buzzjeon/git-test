package com.sds.vuestarter.util.string;

import static com.sds.vuestarter.util.number.NumberUtil.*;

import java.util.HashSet;
import java.util.Set;

public class StringUtil {

    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }
    
    
    
    public static String getRandomString(int max) {
        return getRandomString(1,max);
    }
    
    public static String getRandomString(int min, int max) {
        int len = rand(min,max);
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len ; i++ ) {
            sb.append((char)('a'+rand(25)));
        }
        
        return sb.toString();
    }
    
    
    public static String lpad(int num, int len) {
        return lpad(""+num,len, ' ');
    }
    public static String lpad(int num, int len,char ch) {
        return lpad(""+num,len, ch);
    }
    public static String lpad(String str, int len) {
        return lpad(str,len, ' ');
    }
    public static String lpad(String str, int len, char ch) {
        int slen = str.length();
        if( slen >= len ) return str;
        StringBuilder sb = new StringBuilder();
        for(int i=slen; i<len ; i++ ) { sb.append(ch); }
        sb.append(str);
        
        return sb.toString();
    }
    
    
    
    
    
    @SuppressWarnings("unused")
    private static void createSampleData(String[] args) {
        int MAX = 500;
        Set<String> nset = new HashSet<>();
        String[] domain = {"gugle.com", "never.com", "samsun.net", "dummy.org"};
        
        for(int i=0; i<MAX; i++ ) {
            String name = getRandomString(3, 8);
            if( nset.contains(name) ) {i--;continue;} nset.add(name);
            int age = rand(13,48);
            String phone = String.format("010-%04d-%04d", rand(9999), rand(9999));
            String gender = rand(1)==1?"F":"M";
            String email = name+"@"+domain[rand(3)];
            System.out.println(name+"\t"+age+"\t"+phone+"\t"+gender+"\t"+email);
        }
    }
}
