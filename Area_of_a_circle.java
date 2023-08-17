import java.util.Scanner;
public class Cir{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        double r=inp.nextDouble();
        double ar=3.14*r*r;
        System.out.printf("%.2f",ar);
    }
}