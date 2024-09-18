import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {

        /*
        Menu:

            1: Enter Numbers
            2: Display All Numbers
            3: Display the Sum of the Numbers
            4: Display the Subtraction of the Numbers
            5: Display the Multiplication of the Numbers
            6: Display the Division of the Numbers
            7: Exit
         */

        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("1: Enter Numbers");
            System.out.println("2: Display All Numbers");
            System.out.println("3: Display the Sum of the Numbers");
            System.out.println("4: Display the Subtraction of the Numbers");
            System.out.println("5: Display the Multiplication of the Numbers");
            System.out.println("6: Display the Division of the Numbers");
            System.out.println("7: Exit");

            option = input.nextInt();

            switch (option) {
                case 1:
                    boolean addMore = true;
                    while (addMore) {
                        System.out.println("Enter a number:");
                        int number = input.nextInt();
                        listOfNumbers.add(number);
                        System.out.println("Do you want to enter another number? (yes/no):");
                        String userInput = input.next();
                        addMore = userInput.equalsIgnoreCase("yes");
                    }
                    break;

                case 2:
                    System.out.println(
                            listOfNumbers.size() == 1
                                    ? "You have entered the below number: " + listOfNumbers
                                    : "You have entered the below numbers: " + listOfNumbers
                    );
                    break;

                case 3:
                    int sum = 0;
                    for (int num : listOfNumbers) {
                        sum += num;
                    }
                    System.out.println("The sum of the numbers is: " + sum);
                    break;

                case 4:
                    if (listOfNumbers.size() > 0) {
                        int difference = listOfNumbers.get(0);
                        for (int i = 1; i < listOfNumbers.size(); i++) {
                            difference -= listOfNumbers.get(i);
                        }
                        System.out.println("The subtraction result is: " + difference);
                    } else {
                        System.out.println("No numbers to subtract.");
                    }
                    break;

                case 5:
                    if (listOfNumbers.size() > 0) {
                        int product = 1;
                        for (int num : listOfNumbers) {
                            product *= num;
                        }
                        System.out.println("The multiplication result is: " + product);
                    } else {
                        System.out.println("No numbers to multiply.");
                    }
                    break;

                case 6:
                    if (listOfNumbers.size() > 0) {
                        double division = listOfNumbers.get(0);
                        for (int i = 1; i < listOfNumbers.size(); i++) {
                            if (listOfNumbers.get(i) != 0) {
                                division /= listOfNumbers.get(i);
                            } else {
                                System.out.println("Division by zero is not allowed.");
                                division = 0;
                                break;
                            }
                        }
                        System.out.println("The division result is: " + division);
                    } else {
                        System.out.println("No numbers to divide.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 7);


    }
}
