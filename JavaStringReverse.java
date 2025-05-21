import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        StringBuilder s = new StringBuilder(A);
        if(A.compareTo(s.reverse().toString())==0){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }
}



