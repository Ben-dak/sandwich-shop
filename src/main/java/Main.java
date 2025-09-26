import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please select the size of your sandwich:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        System.out.print("Select 1 or 2: ");

        double regLoadedPrice = 6.45;
        double larLoadedPrice = 10.70;

        String sizeInput = myScanner.nextLine();
        double sandwichSize =Double.parseDouble(sizeInput);

        double basePrice = 0;

        if (sandwichSize == 1) {
            basePrice = 5.45;
        } else if (sandwichSize == 2) {
            basePrice = 8.95;
        } else {
            System.out.println("Error");
        }
        System.out.println("Would you like the sandwich loaded? (yes/no): ");
        String input = myScanner.nextLine();

        if (input.equals("yes")) {
            if (sandwichSize == 1) {
                basePrice = basePrice + 1.00;
            }
            if (sandwichSize == 2) {
                basePrice = basePrice + 1.75;
            }
        }

        System.out.println(basePrice);

        System.out.println("Enter your age: ");
        int age = myScanner.nextInt();

        double discount = 0.0;
        if(age<= 17) {
            discount = 0.10;
        }else if (age >= 65) {
            discount = 0.20;
        }
        double finalPrice = basePrice - (basePrice * discount);
        System.out.printf("Your sandwich will cost: $%.2f%n", finalPrice);

        }

    }


