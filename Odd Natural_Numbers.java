import java.util.Scanner;
public  class Sample{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int i,n;
        n=scan.nextInt();
        for(i=1;i<=n;i=i+2)
        {
            System.out.printf("%d ",i);
        }
    }
}