import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] list = s.trim().split("['!?,._@$%*&^\\s]+");
        if(s.trim().isEmpty()) System.out.println(0);
        else{
            System.out.println(list.length);
            for(String i : list){
                System.out.println(i);
            }
        }
        scan.close();
    }
}

