import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        int ja = 0 ; 
        int min = Integer.MAX_VALUE;
        int t =0; 
        for( int i = 0 ; i<n ; i++){
            t = in.nextInt();
            if( Math.abs(t)< Math.abs(min) || Math.abs(t)==Math.abs(min) && t>0 ){
                min = t ; 
            }
        }
        if(t != 0)
        System.out.println(min);
        else 
        System.out.println(t);

}
}
