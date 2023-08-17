import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x,y;
        x=scan.nextInt();
        y=scan.nextInt();
        if(x>=y*30){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}