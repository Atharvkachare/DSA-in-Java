// Rotate matrix anticlockwise in 90 degree

public class InplaceRotateMatrix90Degree {
    public static void inplaceRotate(int[][] arr, int n)
    {
        //transpose
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse
        for(int i=0; i<n/2; i++)
        {
            for(int j=0; j<n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[n-i-1][j];
                arr[n-i-1][j] = temp;
            }
        }
    }
    
}
