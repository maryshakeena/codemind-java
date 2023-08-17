import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x,y,a,b;
        x=scan.nextInt();
        a=scan.nextInt();
        b=scan.nextInt();
        y=1*a+2*b;
        if(y>=x){
            System.out.println("Qualify");
        }
        else{
            System.out.println("Not Qualify");
        }
    }
}