import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1: Convert Decimal to Binary");
        System.out.println("2: Convert Binary to Decimal");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a decimal number: ");
                int decimal = scanner.nextInt();
                String binary = decimalToBinary(decimal);
                System.out.println("\n" + decimal + " to Binary is " + binary);
                break;
            case 2:
                System.out.print("Enter a binary number: ");
                String binaryInput = scanner.next();
                int decimalEquivalent = binaryToDecimal(binaryInput);
                System.out.println("\n" + binaryInput + " to decimal is " + decimalEquivalent);
                break;
            default:
                System.out.println("Invalid choice. Please choose either 1 or 2.");
        }
    }

    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, length - 1 - i);
            }
        }

        return decimal;
    }
}
