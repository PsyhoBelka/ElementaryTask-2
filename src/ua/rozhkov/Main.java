package ua.rozhkov;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            Convert convert1 = new Convert();
            System.out.print("Input width of Convert1: ");
            convert1.setWidth(scanner.nextDouble());
            System.out.print("Input height of Convert1: ");
            convert1.setHeight(scanner.nextDouble());
            System.out.println("Square of Convert 1 is " + convert1.square());

            Convert convert2 = new Convert();
            System.out.print("Input width of Convert2: ");
            convert2.setWidth(scanner.nextDouble());
            System.out.print("Input height of Convert2: ");
            convert2.setHeight(scanner.nextDouble());
            System.out.println("Square of Convert 2 is " + convert2.square());

           /* if (((convert2.getWidth() < convert1.getWidth()) & (convert2.getHeight() < convert1.getHeight())) ||
                    ((convert2.getHeight() < convert1.getWidth()) & (convert2.getWidth() < convert1.getHeight()))) {
                System.out.println("Convert 1 can be place in Convert 2");
            } else {
                System.out.println("Convert 1 can't be place in Convert 2");
            }*/

            if (convert1.square() > convert2.square()) {
                System.out.println("Convert 1 can be place in Convert 2");
            } else {
                System.out.println("Convert 1 can't be place in Convert 2");
            }
            System.out.println("Do you want to compare another convert pair? Type anything to repeat or exit to end: ");
        } while (!Objects.equals(scanner.next().toLowerCase(), "exit"));
    }
}
