import java.util.Scanner;

class Input2 {
    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1:  ");
        int number1 = input.nextInt();
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();

        if(number1 == 4) {
            if(number2 == 4) {
                System.out.println(8);
            } else if(number2 == 2) {
                System.out.println(6);
            } else if(number2 == 0) {
                System.out.println(4);
            } else {
                System.err.println("This calculator currently only supports the numbers 4, 2, and 0");
                throw new java.util.zip.DataFormatException("Not a 4 or 2 or 0");
            }
        }else if(number1 == 2) {
            if(number2 == 4) {
                System.out.println(6);
            } else if(number2 == 2) {
                System.out.println(4);
            } else if(number2 == 0) {
                System.out.println(0);
            } else {
                System.err.println("This calculator currently only supports the numbers 4, 2, and 0");
                throw new java.util.zip.DataFormatException("Not a 4 or 2 or 0");
            }
        }else if(number1 == 0) {
            if(number2 == 4) {
                System.out.println(4);
            } else if(number2 == 2) {
                System.out.println(2);
            } else if(number2 == 0) {
                System.out.println(0);
            } else {
                System.err.println("This calculator currently only supports the numbers 4, 2, and 0");
                throw new java.util.zip.DataFormatException("Not a 4 or 2 or 0");
            }
        }else{
            System.err.println("This calculator currently only supports the numbers 4, 2, and 0");
            throw new java.util.zip.DataFormatException("Not a 4 or 2 or 0");
        }

        // closing the scanner object
        input.close();
    }
}
