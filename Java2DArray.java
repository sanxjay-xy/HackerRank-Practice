import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Java2DArray {
    
    private static int printMaxSum(List<List<Integer>> matrix){
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<=3;i++){
            
            List<Integer> row1 = matrix.get(i);
            List<Integer> row2 = matrix.get(i+1);
            List<Integer> row3 = matrix.get(i+2);
            for(int j=0; j<=3;j++){
                int sum=row1.get(j+0)+row1.get(j+1)+row1.get(j+2)
                +row2.get(j+1)+row3.get(j+0)+row3.get(j+1)+row3.get(j+2);
                if(sum>ans)
                    ans=sum;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try
            {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );   
            } 
            catch (IOException ex) 
            {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int maxHourglassSum = printMaxSum(arr);
        System.out.println(maxHourglassSum);
    }
}
