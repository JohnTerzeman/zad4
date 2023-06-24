public class Main {
    static int globalVariable;
    static int globalsum;
    static int sum;
    static int localsum;

    public static void main(String[] args) {
        int localVariable;

        for (localVariable = 10; localVariable <= 18; localVariable++) {
            localsum += localVariable;
        }
        for (globalVariable = 7; globalVariable < localVariable; globalVariable++) {
            globalsum += globalVariable;
        }
        System.out.println("Вывод суммы сумм локальных и глобальных переменных:");
        sum = localsum + globalsum;
        System.out.println(sum);
    }

}
