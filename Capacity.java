import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int t,s,b,k;
        t=scan.nextInt();
        s=scan.nextInt();
        b=scan.nextInt();
        k=2*t*s*b*512/1024;
        System.out.printf("%d KB",k);
        
    }
}