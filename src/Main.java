
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    /**
     * Главный метод
     * @param args основные аргументы
     */
    public static void main(String[] args) {
        ArrayList<Integer> arrayL = new ArrayList<>();
        LinkedList<Integer> linkedL = new LinkedList<>();
        Timer Array_List = new Timer(arrayL);
        Timer Linked_List = new Timer(linkedL);
        Scanner in = new Scanner(System.in);
        int i;
        boolean flag=false;
        do {
            int operation;
            operation = checkOperation(in);
            Array_List.setN(operation);
            Linked_List.setN(operation);
            System.out.printf("%-30s %-20s  %-10s%n", operation + " повторений", "ArrayList", "LinkedList");
            System.out.printf("%-30s %-20s  %-10s%n", "Получение элементов ", Array_List.get(), Linked_List.get());
            System.out.printf("%-30s %-20s  %-10s%n", "Добавление элементов ", Array_List.add(), Linked_List.add());
            System.out.printf("%-30s %-20s  %-10s%n", "Удаление элементов с конца ", Array_List.deleteTail(), Linked_List.deleteTail());
            System.out.printf("%-30s %-20s  %-10s%n", "Удаление элементов из начала ", Array_List.deleteBegin(), Linked_List.deleteBegin());
            System.out.println();
            i=checkInput(in);
        }while (i==1);
    }

    /**
     * Ввод количества повтрений, проверка корректности ввода
     * @param in Scanner
     * @return возвращается число повторений
     */
    public static int checkOperation(Scanner in) {
        int operation = 0;
        boolean flag = false;
        System.out.print("Введите количество повторений: ");
        do {
            if (in.hasNextInt())
            {
                operation = in.nextInt();
                if (operation >= 0) flag = true;
                else
                    System.out.println("Введите корректное количество повторений!");
            }
            else
                System.out.println("Некорректный ввод!");
            in.nextLine();
        } while (!flag);
        return operation;
    }

    /**
     * Проверка, продолжать ли выполнение программы
     * @param in Scanner
     * @return возвращает i - знак продолжения или выхода
     */
    public static int checkInput(Scanner in) {
        int i = 0;
        boolean flag = false;
        System.out.println("Если хотите продолжить, введите '1'. Если хотите закончить, введите '0'");
        do {
            if (in.hasNextInt())
            {
                i = in.nextInt();
                if (i==1||i==0) flag = true;
                else
                    System.out.println("Введите '1' для продолжения или '0' для выхода!");
            }
            else
                System.out.println("Некорректный ввод!");
            in.nextLine();
        } while (!flag);
        return i;
    }
}