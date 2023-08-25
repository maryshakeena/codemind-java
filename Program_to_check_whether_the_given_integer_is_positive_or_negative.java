import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
    }
}