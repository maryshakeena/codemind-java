import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2==0 || n%2==0 && n>=2 && n<=5)
        {
            System.out.println("not weird");
        }
        else{
            System.out.println("weird");
        }
    }
}