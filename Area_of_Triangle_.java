import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int a,b,c;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        double s,area;
        s=(a+b+c)/2.0;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
        scan.close();
    }
}