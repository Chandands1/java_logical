import java.util.Scanner;

public class Even{
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check Even or odd: ");
        int number = input.nextInt();
        boolean result = isEven(number);
        if(result){
            System.out.println("The number is Even: "+ number);
        }else {
            System.out.println("The number is Odd: "+ number);
        }
    }
}