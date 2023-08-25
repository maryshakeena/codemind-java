import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int p,t,r,s;
        p=scan.nextInt();
        t=scan.nextInt();
        r=scan.nextInt();
        s=(p*t*r)/100;
        System.out.println(s);
    }
}
  