import java.util.Scanner;
public class  Sample{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n,r=0,m;
        n=scan.nextInt();
        m=n;
        while(n>0){
            r=r*10+n%10;
            n=n/10;
        }
        if(m==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}