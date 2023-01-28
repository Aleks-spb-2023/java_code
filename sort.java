import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sort {
    private static final String TASK_MENU = "Выберите нужный пункт меню: "
            + "\n\t1 - Задача 1"
            + "\n\t2 - Задача 2"
            + "\n\t3 - Задача 3"
            + "\n\t4 -Задача 4"
            + "\n\t5 - Вернуться назад, в главное меню"
            + "\n\t0 - Выход";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(TASK_MENU);
            
            int num = sc.nextInt();
            
            
            
        }
        
    }
    public static void task1(){
        System.out.println("Введите число больше нуля");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Random rnd = new Random();
        int [] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10);

            
        }
        System.out.println(Arrays.toString(arr));

    }
}
