import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int c;
        float f;
        c=scan.nextInt();
        f=32+(c*(float)9/5);
        System.out.printf("%.2f",f);
    }
}