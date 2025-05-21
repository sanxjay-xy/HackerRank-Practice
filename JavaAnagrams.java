import java.io.*;
import java.util.*;

public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = sc.next().toLowerCase().chars().sorted().toArray();
        int[] B = sc.next().toLowerCase().chars().sorted().toArray();
        if(Arrays.equals(A, B)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
