/* Практическое задание №1.
Задача 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i. */

package sem1;
import java.util.Random;
public class z1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println ("Случайное целое число в диапазоне от 0 до 2000 равняется: "+i);
    }
}

