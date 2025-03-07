import java.util.Scanner;

public class Sumof2Numbers {

    public static int sum(int number1, int number2){
        return number1+number2;
    }

    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int number1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the number2 : ");
        int number2= input1.nextInt();

        int result = sum(number1, number2);
        System.out.println("The sum of two numbers: "+ result);
    }
}
