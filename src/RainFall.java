import java.util.Scanner;
public class RainFall {
    public static void main(String[]args)
    {
        double length;
        double width;
        double areainch;
        double rainfall;
        double rain;
        double totalrainfall;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        length=sc.nextDouble();


        System.out.println("enter width");
        width=sc.nextDouble();

        System.out.println("enter rainfall");
        rainfall=sc.nextDouble();

        areainch=(width*12)*(length*12);
        rain=areainch*rainfall;
        totalrainfall=rain/231;
        System.out.print("print rainfall total rainfall:"+totalrainfall);
    }
}
