import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            int item = sc.nextInt();
            list.add(item);
        }
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++){
            String query = sc.next();
            if(query.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                list.add(x, y);
            }
            else if(query.equals("Delete")){
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        for(int i : list){
            System.out.print(i+" ");
        }
    }
}
