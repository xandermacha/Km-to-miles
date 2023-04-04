// one mile = 1.60935 km
import java.util.Scanner;

public class miles{
    public static double To_km = 1.60935;
    public static void main(String[] args){
        double answer;
        float miles;
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("how many miles would you like to convert to kilometers?");
        miles = scan.nextFloat();
        answer = miles * To_km;
        System.out.println(miles + " miles is " + answer + " kilometers.");
         //closes scanner to stop resource leak error "Resource leak: 'scan' is never closedJava(536871799)"

    }
}