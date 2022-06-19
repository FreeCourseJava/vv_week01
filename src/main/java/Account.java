package src.main.java;

public class Account {

    public static void main(String[] args) {
        topUp(100,10);
        topUp(2147470000,110000);
        topUp(Integer.MAX_VALUE,Integer.MIN_VALUE);
        topUp(Integer.MAX_VALUE,Integer.MAX_VALUE);
        topUp(Integer.MIN_VALUE,Integer.MIN_VALUE);
        topUp(0,Integer.MIN_VALUE);
        topUp(0,Integer.MAX_VALUE);
        topUp(-1,Integer.MIN_VALUE);
        topUp(Integer.MAX_VALUE,1);
        topUp(0,0);
    }

    private static int topUp (int balance, int income) {
        int sum = balance+income;

        int sign_mask = 1 << 31;
        /*  Складывая положительное и отрицательное числа невозможно получить переполнение,
            поэтому рассматриваем только варианты, когда у слагаемых одинаковые знаки.
            Для этого смотрим одинаковый ли у них старший бит.
            Если да, то выполняем следующую проверку - смотрим совпадают ли знаки суммы и слагаемых
            (достаточно сравнить с одним, так как знаки у слагаемых одинаковые).
            Если не совпадают - произошло переполнение
        */
        if ((((balance ^ income) & sign_mask) == 0)
                && ((sum & sign_mask) != (balance & sign_mask))) {
            System.out.println("ERROR: Sum of " + balance + " and " + income + " can't be calculated, return 0");
            return 0;
        }
        else {
            System.out.println("Sum of " + balance + " and " + income + ": " + sum);
            return sum;
        }
    }
}
