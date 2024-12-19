import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void hello32(){
        for (int i = 0; i < 32; i++) {
            System.out.print("Hello world!");
        }
    }
    public static void square(int a){
        System.out.println(a*a);
    }
    public static void Multi(float a, float b){
        System.out.println(a*b);
    }
    public static void RightTriangleArea(float a, float b){
        System.out.println((a*b)/2);
    }
    public static void CircleArea(int a){
        System.out.println((a*a) * 3.14 );
    }
    public static void GetNumberInput(){
        Scanner scan = new Scanner(System.in);

        while(true){
            try {
                System.out.print("Enter a number: ");
                int number = scan.nextInt();
                System.out.println("You've chosen: " + number);
                break;
            }catch (InputMismatchException e) {
                scan.nextLine();
                System.out.println("Please try again.");
            }
        }
    }

    public static void GetChoice(String a, String b, String c){
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.println("1. " + a);
                System.out.println("2. " + b);
                System.out.println("3. " + c);
                System.out.println("Choose a word by typing their respective number:");
                int choice = sc.nextInt();

                if (choice == 1){
                    System.out.println("You chose: " + choice);
                    break;
                }
                else if (choice == 2){
                    System.out.println("You chose: " + choice);
                    break;
                }
                else if (choice == 3){
                    System.out.println("You chose: " + choice);
                    break;
                }
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Please try again.");
            }
        }
    }
    public static void main(String[] args) {
        //GetNumberInput();
        GetChoice("The Office", "Rick and Morty", "Adventure Time");
    }
}