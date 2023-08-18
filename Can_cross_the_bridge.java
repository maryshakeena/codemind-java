import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int x,y,z,a;
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();
        a=(z-y)/x;
        System.out.printf("%d",a);
        
    }
}