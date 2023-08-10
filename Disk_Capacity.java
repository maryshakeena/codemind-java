import java.util.Scanner;
public class Sample
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t,s,b,c;
        t=scan.nextInt();
        s=scan.nextInt();
        b=scan.nextInt();
        c=2*t*s*b*512;
        System.out.printf("%d",c);
        scan.close();
    }
}