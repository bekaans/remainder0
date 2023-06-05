import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println("Write the number :"); int number=input.nextInt();

        for (i=0 ; i<=number ; i++){

            if ((i%12)==0)
            {
                System.out.println(i);
            }
        }
    }
}