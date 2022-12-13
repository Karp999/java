/* Практическое задание №1. Задачи связаны между собой.
Задача 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
Задача 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
Задача 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
Задача 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

package sem1;
import java.util.Arrays;
import java.util.Random;
public class dz1 {
    // первоначально у меня пойдёт метод main
    public static void main(String[] args) {
        int i = randNum();
        System.out.println("Случайное целое число в диапазоне от 0 до 2000 равняется i = " + i);
        int n = mostSignificantBit(i);
        System.out.println("Номер старшего значащего бита выпавшего числа i равен n = " + n);
        firstArray(i, n);
        secondArray(i, n);
    }

    static int randNum() {
        return new Random().nextInt(2001);
    } // решение задачи 1

    static int mostSignificantBit(int i) {
        return Integer.toBinaryString(i).length();
    } // решение задачи 2

    static void firstArray(int i, int n) {
        int max = Short.MAX_VALUE;
        int[] m1 = new int[0];
        while (i <= max){
            if (i % n == 0){
                int[] temp = new int[m1.length + 1];
                for (int g = 0; g < m1.length; g++){
                    temp[g] = m1[g];
                }
                m1 = temp;
                m1[m1.length - 1] = i;
            }
            i++;
        }
        System.out.println("Массив кратных n чисел в диапазоне от i до константы Short.MAX_VALUE = 32767 равен: \n"+ Arrays.toString(m1));
    } // решение задачи 3

    static void secondArray(int i, int n) {
        int min = Short.MIN_VALUE;
        int[] m2 = new int[0];
        while (min <= i){
            if (min % n != 0){
                int[] temp = new int[m2.length + 1];
                for (int g = 0; g < m2.length; g++){
                    temp[g] = m2[g];
                }
                m2 = temp;
                m2[m2.length - 1] = min;
            }
            min++;
        }
        System.out.println("Массив кратных n чисел в диапазоне от i до константы Short.MIN_VALUE = -32767 равен: \n"+ Arrays.toString(m2));

    }
}

