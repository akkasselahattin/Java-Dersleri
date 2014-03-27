package javahafta7;

import java.util.Scanner;

/**
 *
 * @author sakkas
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println();
            System.out.println("Lab. Methods and Enumerations");
            System.out.println("Please select an item from Menu");
            System.out.println("1- isMultiple");
            System.out.println("2- Hypotenuse");
            System.out.println("3- reverseDigits");
            System.out.println("4- Coin Tossing");
            System.out.println("5- Exit");
            System.out.print("Choice: ");
            try {
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        submenuIsMultiple();
                        break;
                    case 2:
                        submenuHypotenuse();
                        break;
                    case 3:
                        submenuReverseDigits();
                        break;
                    case 4:
                        submenuCoinToss();
                        break;
                    case 5:
                        System.out.println("Goodbye");
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }

        } while (choice != 5);
    }

    public static void submenuIsMultiple() {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter first number:");
        num1 = input.nextInt();
        System.out.print("Enter second number:");
        num2 = input.nextInt();
        if (Operations.isMultiple(num1, num2)) {
            System.out.printf("%d is a multiple of %d\n", num1, num2);
        } else {
            System.out.printf("%d is not a multiple of %d\n", num1, num2);
        }

    }

    public static void submenuHypotenuse() {
        Scanner input = new Scanner(System.in);
        double side1, side2;
        System.out.print("Enter the first side of right triangle(double): ");
        side1 = input.nextDouble();
        System.out.print("Enter the second side of right triangle(double): ");
        side2 = input.nextDouble();
        System.out.printf("Hypotenuse of the triangle is %f\n", Operations.hypotenuse(side1, side2));
        System.out.println("Please enter only double!");

    }

    public static void submenuReverseDigits() {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter an integer to reverse digits: ");
        num = input.nextInt();
        System.out.printf("%d in reversed order is %d\n", num, Operations.reverseDigits(num));

    }

    public static void submenuCoinToss() {
        Scanner input = new Scanner(System.in);
        int tossChoice = -1;
        int headsCount = 0, tailsCount = 0;
        do {
            System.out.println("Coin Tossing Submenu");
            System.out.println("1- Toss Coin");
            System.out.println("2-Exit and print results");
            System.out.print("Choice: ");

            tossChoice = input.nextInt();
            if (tossChoice == 1) {
                if (Operations.flip() == Operations.CoinState.HEADS) {
                    System.out.println("Toss result: HEADS");
                    headsCount++;
                } else {
                    System.out.println("Toss result: TAILS");
                    tailsCount++;
                }
            } else if (tossChoice != 2) {
                System.out.println("Invalid choice!");
            }
        } while (tossChoice != 2);
        System.out.printf("HEADS count:%d \nTAILS count: %d\n", headsCount, tailsCount);

    }

}
