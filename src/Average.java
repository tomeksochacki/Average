import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        float variable1 = 0;
        float variable2 = 0;
        float sum = 0;
        float average = 0;

        System.out.println("Enter to namber 1:");
        variable1 = scanner1.nextFloat();
        System.out.println("Enter to namber 2:");
        variable2 = scanner2.nextFloat();
        sum = variable1 + variable2;

        average = sum/2;
        System.out.println("Average id: " + average);


    }
}
