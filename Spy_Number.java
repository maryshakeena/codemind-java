import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,d,sum=0,mul=1;
        n=scan.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            sum=sum+d;
            mul=mul*d;
        }
        if(sum==mul){
            System.out.println("Spy Number");
        }
        else{
            System.out.println("Not Spy Number");
        }
    }
}
  