import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        double c;
        c=(a+b)/2.0;
        System.out.printf("Average of %d and %d is: %.2f",a,b,c);
    }
}