import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int r;
        r=scan.nextInt();
        float pi=3.14f,area;
        area=pi*r*r;
        System.out.printf("%.2f",area);
    }
}