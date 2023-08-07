import java.util.Scanner;
public class ave{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int N,M;
        N=scan.nextInt();
        M=scan.nextInt();
        double c=(N+M)/2.0;
        scan.close();
        System.out.printf("%.4f",c);
    }
}