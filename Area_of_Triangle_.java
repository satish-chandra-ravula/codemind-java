import java.util.*;
public class M{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       float a,b,c;
       a=sc.nextFloat();
       b=sc.nextFloat();
       c=sc.nextFloat();
       double s=(a+b+c)/2;
        double res=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",res);
        
    }
}