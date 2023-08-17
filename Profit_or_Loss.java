import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cp,sp;
        cp=scan.nextInt();
        sp=scan.nextInt();
        if(sp > cp){
            System.out.println("Profit");
        }
        else if(sp < cp){
            System.out.println("Loss");
        }
        else{
            System.out.println("No profit and No loss");
        }
    }
}