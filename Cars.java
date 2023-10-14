import java.util.Scanner;
public class Sample{
    public static void main(String[] args)
    {
      Scanner scan= new Scanner(System.in);
      int n=scan.nextInt();
      if(n%4==0)
      {
          System.out.printf("%d",n/4);
      }
      else{
          System.out.printf("%d",n/4+1);
      }
    }
}