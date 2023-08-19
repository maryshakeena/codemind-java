import java.util.Scanner;
public class star {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=1; j--)
            {
                System.out.printf("%d ",j);
            }
            System.out.println();
        }
    }
}
