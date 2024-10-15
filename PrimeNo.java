public class PrimeNo {
    public static void main(String[] args) {
        int num=29;
        boolean flag=false;

        if(num == 0 || num == 1)
        {
            flag=true;
        }
        for(int i=2; i<=num/2; ++i)
        {
            //condition for non prime number
            if(num%i ==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println(num + " Prime number");
        }
        else{
            System.out.println(num +" is not prime number");
        }
    }

   
}
