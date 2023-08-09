import java.util.Scanner;
public class sample{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float x,y,z;
        x=scan.nextFloat();
        y=scan.nextFloat();
        z=x*y;
        System.out.format("%.2f",z);
        scan.close();
    }
}