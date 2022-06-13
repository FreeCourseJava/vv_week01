package src.main.java;

public class Account {

    public static void main(String[] args) {

        System.out.println(topUp(100,10));
    }

    private static int topUp (int balance, int income) {
        balance += income;
        return balance;
    }
}
