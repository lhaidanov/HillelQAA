import java.util.Random;
import java.util.Scanner;

//public class GameWithRandomNumber {
//    public static void main(String[] args) {
//
//        Random rand = new Random();
//        int x = rand.nextInt(9);
//        System.out.println(x);
//        Scanner reader = new Scanner(System.in);  // Reading from System.in
//        System.out.println("Enter a number between 0 and 9: ");
//        String m = reader.nextLine();
//        if (m.matches("\\d")) {
//            int n = Integer.parseInt(m);
//            if (n == x) {
//                System.out.println("you win");
//            } else if (n < x) {
//                System.out.println("Your number is smaller, try again");
//            } else {
//                System.out.println("Your number is bigger, try again");
//            }
//        } else {
//            System.out.println("Please enter valid number");
//        }
//
//    }
//}

public class GameWithRandomNumber {
    public static void main(String[] args) {
        int range = 10; // range of random number between 0 and this number (exclusive)
        int randomNumber = randomNumber(range);
        boolean result;
        do {
            int enteredNumber = enterNumber(range);
            result = isSameNumber(randomNumber, enteredNumber);
            if (result) {
                System.out.println("Congratulations! You guessed a number");
            } else if (enteredNumber > randomNumber) {
                System.out.println("Your number is bigger");
            } else {
                System.out.println("Your number is smaller");
            }
        } while (!result);


    }

    public static int randomNumber(int range) {
        Random rand = new Random();
        int x = rand.nextInt(range);
        return x;
    }

    public static int enterNumber(int range) {
        Scanner sc = new Scanner(System.in);
        String s;
        boolean isNumber;
        do {
            System.out.println("Please enter a number between 0 and 9:" + (range - 1));
            s = sc.nextLine();
            if (!(isNumber = s.matches("\\d+"))) {
                System.out.println("Not a valid number");
            }
        } while (!isNumber);
        return Integer.parseInt(s);

    }

    public static boolean isSameNumber(int randomNumber, int enteredNumber) {
        return randomNumber == enteredNumber;
    }


}