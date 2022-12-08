public class MultiplicationTable {
    public static void main(String[] args) {
        var to = 9;
        var cols = 4;

        System.out.println("\nТаблица умножения вариант 1:\n");
        for (int i = 1; i <= to; i++) {
            for (int j = 1; j <= to; j++) {
                var res = i * j;
                System.out.print((res == 1 ? "" : res) + "\t");
            }
            System.out.println();
        }

        System.out.println("\nТаблица умножения вариант 2:\n");
        for (int i = 2; i <= to; i++) {
            for (int j = 2; j <= to; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }

        System.out.println("\nТаблица умножения вариант 3:\n");
        for (int r = 2; r <= to; r += cols) {
            for (int i = 2; i <= to; i++) {
                for (int j = r; j < r + cols && j <= to; j++) {
                    System.out.print(j + " * " + i + " = " + (i * j) + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
