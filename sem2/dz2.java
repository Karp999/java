package sem2;

import java.util.Random;

public class dz2 {
    public static void main(String[] args) {

        findInputStr();
//        reverseInput();
//        reverseStr();
//        strComposition();
//        replCharSB();
//        replCharAsterisk();
//        compareTime();
    }

/* 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).*/
    static void findInputStr(){
        String str1 = "В Каргополе белые ночи прекрасны!";
        String str2 = "белые ночи";
        int result = str1.indexOf(str2);
        System.out.println(result);
    };

/* 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
(вхождение в обратном порядке).*/
    static void reverseInput(){

    };
/* 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.*/
    static void reverseStr(){

    };
/* 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
    3 + 56 = 59
    3 – 56 = -53
    3 * 56 = 168
Используем метод StringBuilder.append().*/
    static void strComposition(){

    };
/* 5. Замените символ “=” на слово “равно”.
Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().*/
    static void replCharSB(){

    };
/* 6. *Замените символ “=” на слово “равно”. Используйте метод StringBuilder.replace().*/
    static void replCharAsterisk(){

    };
/* 7. **Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов "="
средствами String и StringBuilder.
*/
    static void compareTime(){

    };

}
