import java.util.Scanner;
import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numere = new int[3];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            System.out.print("Scrie numarul " + (i + 1) + ": \n");
            int a = scanner.nextInt();

            numere[i] = a;
        }

        Arrays.sort(numere);

        for(int i = 0; i < 3; i++)
            if(i != 2)
                System.out.print(numere[i] + " < ");
            else
                System.out.print(numere[i] );


    }
}