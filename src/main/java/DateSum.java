package src.main.java;

public class DateSum {
    public static void main(String[] args) {
        System.out.println(sum(Integer.MAX_VALUE));
        System.out.println(sum(31));
        System.out.println(sum(Integer.MIN_VALUE));
    }

    private static long sum(int days) {
        long current_timestamp = System.currentTimeMillis();
        // Переполнение может возникнуть если Integer.MAX_VALUE * 86400000L + current_timestamp
        // будет больше Long.MAX_VALUE.
        // Это охренеть какое далекое будущее.
        // На проблемы охренеть какого далекого будущего забьём ради простоты кода.
        // Отнимая же то текущего времени какое бы ни было количество дней заданных переменной типа int
        // получить переполнение невозможно
        return current_timestamp + days * 86400000L;
    }
}
