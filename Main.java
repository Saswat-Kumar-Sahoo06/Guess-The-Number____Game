import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);


        System.out.print("Limitation of number till: ");
        int a = sc.nextInt();
        int b = r.nextInt(0,a);
        //System.out.println("Computer generated value is: "+b);

        int count=1;
        for(int i=0;i<=a;i++){
            System.out.print("Choose the number: ");
            int c = sc.nextInt();
            if(c<b){
                System.out.println("  (Take greater)");
                count++;
            }
            else if(c>b){
                System.out.println("  (Take smaller)");
                count++;
            }
            else{
                System.out.println("Congrats... You find the value after "+count+" tries.");
                break;
            }
        }

        if(count < 3){
            System.out.println("You are Pro....");
        }


    }
}