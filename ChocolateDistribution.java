import java.util.Arrays;
import java.util.*;

public class ChocolateDistribution {
    static int ChocolateDistribution(int []a, int n, int m)
    {
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++)
        {
            int diff = a[i+m-1]- a[i];
            if(diff < min)
            {
                min=diff;
            }
            
        }
        return min;
    }
    public static void main(String[] args) {
        int []a = {3,4,1,9,56,7,9,12};
        int n=a.length;
        int m=5;
        System.out.println(ChocolateDistribution(a,n,m));
    }
}
