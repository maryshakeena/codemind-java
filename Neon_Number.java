import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,rem,sqt,sum=0;
        n=scan.nextInt();
        sqt=n*n;
        while(sqt!=0)
        {
            rem=sqt%10;
            sum=sum+rem;
            sqt=sqt/10;
            
        }
        if(sum==n){
            System.out.println("Neon Number");
        }
        else{
            System.out.println("Not Neon Number");
        }
    }
}
  