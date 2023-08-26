import java.util.*;
public class M{
    public static void main(String[] args){
        Scanner sa=new Scanner(System.in);
        double a,b,c;
         a=sa.nextDouble();
         b=sa.nextDouble();
         c=sa.nextDouble();
        double s=(a+b+c)/2;
        double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",ar);
    }
}