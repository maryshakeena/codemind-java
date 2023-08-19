import java.util.Scanner;
public class Solution{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n = scan.nextInt();
        int[] intArray = new int[n];
        for(int i=0;i<n;i++){
            intArray[i] = scan.nextInt();
        }
        int sum=0;
        for(int eachElement: intArray){
            sum += eachElement;
        }
        System.out.println(sum);
    }
}