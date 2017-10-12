import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(!(1<= m && 1<=n && m<=n && n<=50))
        {
          return;
        }
        int[] array = new int[m];
        int sum=0;
        for(int i = 0;i<m;i++)
            array[i]=0;
        for(int a0 = 0; a0 < n; a0++){
            int id_number = in.nextInt();
            int amount = in.nextInt();
            array[id_number-1] += amount;
            sum += amount;
        }
        int averageAmount = (int)(sum/m);
        int extra = sum-(averageAmount * m); 
        for(int i=0;i<m;i++)
        {
            if(i==0)
            {
                array[i] = array[i]-(averageAmount+extra);
                System.out.println((i+1)+" "+array[i]);
                continue;
            }
            array[i] -= averageAmount;
            System.out.println((i+1)+" "+array[i]);
        }
        in.close();
    }
}
