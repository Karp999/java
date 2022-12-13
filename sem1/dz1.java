/* Практическое задание №1. Задачи связаны между собой.
Задача 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i.
Задача 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа.
Задача 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1.
Задача 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

package sem1;
import java.util.Random;
public class dz1 {
    // первоначально у меня пойдёт метод main
    public static void main(String[] args) {
        int i = randNum();
        System.out.println("Случайное целое число в диапазоне от 0 до 2000 равняется: " + i);
        int n = mostSignificantBit(i);
        System.out.println("Номер старшего значащего бита выпавшего числа i: "+ n);

//        firstArray();
//        secondArray();
    }
    static int randNum(){
        return new Random().nextInt(2001);
    }
    static int mostSignificantBit(int i){
        return Integer.toBinaryString(i).length();
    }
//    static void firstArray() {
//
//    }
//
//    static void secondArray() {

//    }
//




}


