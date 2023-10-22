import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Go Convert your Number!");
        System.out.println("What is your starting number type?");
        System.out.print("1. Decimal\n2. Binary\n3. Octal\n4. Hexadecimal  >>>  ");
        int intialChoice = scanner.nextInt();
        String typeChoice;
        DecimalHexadecimalClass convert = new DecimalHexadecimalClass(intialChoice);

        if(intialChoice == 1){typeChoice = "'Decimal'";} else if(intialChoice == 2){typeChoice = "'Binary'";}else if(intialChoice == 3){typeChoice = "'Octal'";}else if(intialChoice == 4){typeChoice = "'Hexadecimal'";}else{typeChoice = "'invalid'";}
        System.out.println("So, you chose "+typeChoice+".");
        System.out.println("\nWhat type of number would you like to convert it to?");
        System.out.print("1. Decimal\n2. Binary\n3. Octal\n4. Hexadecimal\n5. Show All\t\t>>>  ");
        int goalChoice = scanner.nextInt();

        if(intialChoice == 1){
            System.out.print("What number you want to change? (decimal) >>> ");
            convert.intNumber = scanner.nextInt();
            if (goalChoice == 1){
                System.out.print("\nSuccesfull.\nHere's the result (decimal) >>> "+convert.toDecimal(convert.intNumber));
            } else if(goalChoice == 2){
                System.out.print("\nSuccesfull.\nHere's the result (binary) >>> "+convert.toBinary(convert.intNumber));
            } else if(goalChoice == 3){
                System.out.print("\nSuccesfull.\nHere's the result (octal) >>> "+convert.toOctal(convert.intNumber));
            } else if(goalChoice == 4){
                System.out.print("\nSuccesfull.\nHere's the result (hexadecimal) >>> "+convert.toHexadecimal(convert.intNumber));
            } else if(goalChoice == 5){
                System.out.print("\nSuccesfull.\nYour number (decimal) >>> "+convert.toDecimal(convert.intNumber));
                System.out.print("\nHere's the result\n(binary)\t\t>>> "+convert.toBinary(convert.intNumber));
                System.out.print("\n(octal)\t\t\t>>> "+convert.toOctal(convert.intNumber));
                System.out.print("\n(hexadecimal)\t>>> "+convert.toHexadecimal(convert.intNumber));
            }
        } else if (intialChoice == 2) {
            System.out.print("What number you want to change? (binary) >>> ");
            convert = new BinaryClass(intialChoice);
            convert.intNumber = scanner.nextInt();
            if (goalChoice == 1){
                System.out.print("\nSuccesfull.\nHere's the result (decimal) >>> "+convert.toDecimal(convert.intNumber));
            } else if(goalChoice == 2){
                System.out.print("\nSuccesfull.\nHere's the result (binary) >>> "+convert.toBinary(convert.intNumber));
            } else if(goalChoice == 3){
                System.out.print("\nSuccesfull.\nHere's the result (octal) >>> "+convert.toOctal(convert.intNumber));
            } else if(goalChoice == 4){
                System.out.print("\nSuccesfull.\nHere's the result (hexadecimal) >>> "+convert.toHexadecimal(convert.intNumber));
            } else if(goalChoice == 5){
                System.out.print("\nSuccesfull.\nYour number (binary) >>> "+convert.toBinary(convert.intNumber));
                System.out.print("\nHere's the result\n(decimal)\t\t>>> "+convert.toDecimal(convert.intNumber));
                System.out.print("\n(octal)\t\t\t>>> "+convert.toOctal(convert.intNumber));
                System.out.print("\n(hexadecimal)\t>>> "+convert.toHexadecimal(convert.intNumber));
            }
        } else if (intialChoice == 3) {
            System.out.print("What number you want to change? (octal) >>> ");
            convert = new OctalClass(intialChoice);
            convert.intNumber = scanner.nextInt();
            if (goalChoice == 1){
                System.out.print("\nSuccesfull.\nHere's the result (decimal) >>> "+convert.toDecimal(convert.intNumber));
            } else if(goalChoice == 2){
                System.out.print("\nSuccesfull.\nHere's the result (binary) >>> "+convert.toBinary(convert.intNumber));
            } else if(goalChoice == 3){
                System.out.print("\nSuccesfull.\nHere's the result (octal) >>> "+convert.toOctal(convert.intNumber));
            } else if(goalChoice == 4){
                System.out.print("\nSuccesfull.\nHere's the result (hexadecimal) >>> "+convert.toHexadecimal(convert.intNumber));
            } else if(goalChoice == 5){
                System.out.print("\nSuccesfull.\nYour number (octal) >>> "+convert.toOctal(convert.intNumber));
                System.out.print("\nHere's the result\n(decimal)\t\t>>> "+convert.toDecimal(convert.intNumber));
                System.out.print("\n(binary)\t\t>>> "+convert.toBinary(convert.intNumber));
                System.out.print("\n(hexadecimal)\t>>> "+convert.toHexadecimal(convert.intNumber));
            }
        } else if (intialChoice == 4){
            System.out.print("What number you want to change? (hexadecimal) >>> ");
            convert = new DecimalHexadecimalClass(intialChoice);
            convert.strNumber = scanner.next();
            if (goalChoice == 1){
                System.out.print("\nSuccesfull.\nHere's the result (decimal) >>> "+convert.toDecimal(convert.strNumber));
            } else if(goalChoice == 2){
                System.out.print("\nSuccesfull.\nHere's the result (binary) >>> "+convert.toBinary(convert.strNumber));
            } else if(goalChoice == 3){
                System.out.print("\nSuccesfull.\nHere's the result (octal) >>> "+convert.toOctal(convert.strNumber));
            } else if(goalChoice == 4){
                System.out.print("\nSuccesfull.\nHere's the result (hexadecimal) >>> "+convert.toHexadecimal(convert.strNumber));
            } else if(goalChoice == 5){
                System.out.print("\nSuccesfull.\nYour number (hexadecimal) >>> "+convert.toHexadecimal(convert.strNumber));
                System.out.print("\nHere's the result\n(decimal)\t\t>>> "+convert.toDecimal(convert.strNumber));
                System.out.print("\n(binary)\t\t>>> "+convert.toBinary(convert.strNumber));
                System.out.print("\n(octal)\t\t\t>>> "+convert.toOctal(convert.strNumber));
            }
        } else {
            System.out.println("\nInvalid Number.");
        }
    }
}
