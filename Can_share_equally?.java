import java.util.Scanner;
public class Sample{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int x,y;
    x=scan.nextInt();
    y=scan.nextInt();
    if(x%2==0 && (x>0 || y%2==0))
        System.out.println("YES");
    else
        System.out.println("NO");
    scan.close();
  }
}