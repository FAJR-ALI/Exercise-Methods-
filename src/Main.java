import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Question 1
        System.out.println("Input first number ");
        int firstnum = scanner.nextInt();
        System.out.println("Input second number ");
        int secondnum = scanner.nextInt();
        System.out.println("Input third number ");
        int thirdnum = scanner.nextInt();
        smallestNumber(firstnum ,secondnum ,thirdnum);

        //Question 2
        System.out.println("Enter a number to check if its - , + , zero ");
        int num = scanner.nextInt();
        numbersCheck(num);

        //Question 3
        System.out.println("Password rules are: \n 1.A password must have at least eight characters \n 2.A password consists of only letters and digits \n 3.A password must contain at least two digits");
        System.out.println("Input a password ");
        String password = scanner.nextLine();
        if(passwordchecker(password)){
            System.out.println("you entered a valid password");
        }else {
            System.out.println("you entered an invalid password ");
        }


    }

    //Question1
    public static void smallestNumber(int fnum ,int snum ,int tnum){
        if(fnum < snum && fnum < tnum ){
            System.out.println("the Smallest value is " + fnum);
        }else if( snum < fnum && snum < tnum){
            System.out.println("the Smallest value is " + snum);
        }else
            System.out.println("the Smallest value is " + tnum);
    }

    //Question2
    public static void numbersCheck (int num){
        if(num < 0){
            System.out.println("the Number is Negative ");
        }else if(num > 0){
            System.out.println("the number is positive ");
        }else System.out.println("the number is ZERO ");
    }

    //Question3
    public static boolean passwordchecker(String password) {
        if (password == null) {
            return false;
        }
        if (password.length() < 10) {
            return false;
        }
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch)) {
                return false;
            }
        }
        if (digitCount >= 2) {
            return true;
        }
        return false;
    }
}