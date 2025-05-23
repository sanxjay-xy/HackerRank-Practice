import java.io.*;
import java.util.*;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int d = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int j=0;j<d;j++){
                int di = sc.nextInt();
                arr.add(di);
            }
            list.add(arr);
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;
            
            if(x<list.size() && x>=0){
                if(y<list.get(x).size() && y>=0){
                    System.out.println(list.get(x).get(y));
                }
                else{
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
