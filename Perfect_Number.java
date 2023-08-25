import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in); 
    int num,sum=0,i;
    num=scan.nextInt();
    for(i=1;i<num;i++)
    {
        if(num%i==0){
            sum=sum+i;
        }
    }
    if(sum==num)
    {
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
 }
}