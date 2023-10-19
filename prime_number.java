import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n,i,c=0;
        n=scan.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c=c+1;
            }
        }
        if(c==2)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
        
    }
}