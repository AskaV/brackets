package com.Tanda;

public class Main {

    public static void main(String[] args) {
        BalanceVerificator balance = new BalanceVerificator();
        int tryNumber = 1;

        System.out.print("Input: ");
        //Scanner scanInput = new Scanner(System.in);
        // String input = scanInput.nextLine();
        String input = "{[{[]}]}dfg";// {[{[]}]}
        try {
            if (tryNumber <= 5) {
                int number = balance.verify(input);
                if (number == -1) {
                    System.out.println("\nOutput: BALANCED");
                } else {
                    System.out.println("\nOutput: NOT BALANCED (" + number + ")");
                }
            }
        } catch (
                Exception IllegalArgumentException) {
            System.out.print(IllegalArgumentException);
        }
    }

}