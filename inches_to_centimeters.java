import java.util.Scanner;
public class Sample
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i=scan.nextInt();
        double c;
        c=2.54*i;
        System.out.printf("%.2f",c);
    }
}