package com.java.version.java11;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String s = " Ram ";
        
        System.out.println(s.stripTrailing());
        System.out.println(s.stripLeading());
        System.out.println(s.isBlank());
        System.out.println(s.lines());
        System.out.println(s.repeat(5));
        System.out.println(s.strip()); // this is equalant to trim but some difference is there
        
        String str = '\u2001'+"String    with    space"+ '\u2001';
        
        String s1 = str.trim();
        System.out.println(s1);
        
        String s2 = str.strip();
        System.out.println(s2);
    }
}
