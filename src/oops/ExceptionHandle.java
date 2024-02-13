package oops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        System.out.println("Program start...");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Number 1 and 2 -> ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("{ ArithmeticException }");
            System.out.println("Problem : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("{ InputMismatchException }");
            System.out.println("Problem : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("{ Exception }");
            System.out.println("Problem : " + e.getMessage());
        } finally {
            System.out.println("finally block");
            System.out.println("Closing all resources/");
        }

        System.out.println("Program terminated...");
    }
}
