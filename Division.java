import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int division = num1/num2;
        System.out.println(division);
    }
}