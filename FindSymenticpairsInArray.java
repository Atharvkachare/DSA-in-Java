import java.util.HashMap;
import java.util.Scanner;

public class FindSymenticpairsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pairs: ");
        int n=sc.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<2; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // creating a hashmap to storeing the elements so that we check if it is present in the map or not
        HashMap<Integer, Integer> map=new HashMap<>();
        System.out.println("the symetric pair are: ");
        for(int i=0; i<n; i++)
        {
            int first=arr[i][0];
            int second=arr[i][1];
            if(map.containsKey(second) && map.get(second) == first){
                System.out.println("(" + first+","+second+") ");
            }else{
                map.put(first, second);
            }
        }
        sc.close();
    }
}
