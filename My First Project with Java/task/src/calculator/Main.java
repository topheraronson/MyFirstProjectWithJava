package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int staffExpenses;
        int otherExpenses;

        int bubbleGumEarnings = 202;
        int toffeeEarnings = 118;
        int iceCreamEarnings = 2250;
        int total = bubbleGumEarnings + toffeeEarnings + iceCreamEarnings;

        int milkChocolateEarnings = 1680;
        int doughnutEarnings = 1075;
        int pancakeEarnings = 80;
        total += milkChocolateEarnings + doughnutEarnings + pancakeEarnings;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubbleGumEarnings);
        System.out.println("Toffee: $" + toffeeEarnings);
        System.out.println("Ice cream: $" + iceCreamEarnings);

        System.out.println("Milk chocolate: $" + milkChocolateEarnings);
        System.out.println("Doughnut: $" + doughnutEarnings);
        System.out.println("Pancake: $" + pancakeEarnings);
        System.out.println();

        System.out.println("Income: $" + total);
        System.out.println("Staff expenses:");
        staffExpenses = scanner.nextInt();

        System.out.println("Other expenses:");
        otherExpenses = scanner.nextInt();
        System.out.println("Net income: " + (total - (otherExpenses + staffExpenses)));
    }
}