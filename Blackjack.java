import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=21-(a+b);
        if(c>10)
        {
            System.out.printf("%d",-1);
        }
        else{
            System.out.printf("%d",c);
        }
    }
}