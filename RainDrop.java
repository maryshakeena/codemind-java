import java.util.Scanner;
public class Sample{
    public static void main(String[] args){
        int a;
        String Sound="";
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        if(a%3==0)
            Sound+="Pling";
        if(a%5==0)
            Sound+="Plang";
        if(a%7==0)
            Sound+="Plong";
        if(Sound.isEmpty())
        System.out.println(a);
        else
            System.out.println(Sound);
        scan.close();
    }
}