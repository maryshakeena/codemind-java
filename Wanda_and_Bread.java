import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    int n,m,k;
    n=scan.nextInt();
    m=scan.nextInt();
    k=scan.nextInt();
    if(n<=m*k)
    {
       System.out.printf("YES");
    }
    else
    {
        System.out.printf("NO");
    }
}
}