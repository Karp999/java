package sem2;

import java.util.Arrays;
import java.util.Random;

public class dz2 {
    public static void main(String[] args) {



        findInputStr();
        reverseInput();
//        reverseStr();
//        strComposition();
        replCharSB();
        replCharAsterisk();
//        compareTime();
    }

/* 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).*/
    static void findInputStr(){
        String str1 = "В Каргополе белые ночи прекрасны!";
        String str2 = "белые ночи";
        int result1 = str1.indexOf(str2);
        System.out.println("Индекс вхождения строки -> " + result1);
        //если строка не входит в другую, выводится ошибка: "-1", это вшито в indexOf()
    };

/* 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга
(вхождение в обратном порядке).*/
    static void reverseInput(){
        String str1 = "asap";
        String str2 = "pasa";
        StringBuilder str3 = new StringBuilder();
        str3.append(str2); //вложим вторую строку в пустую третью для манипуляций
        str3.reverse(); //переворот строки
        str2 = str3.toString(); // возврат перевёрнутой строки в str2
        System.out.println("\nПереворот второй строки(вхождение в обратном порядке): "+ str2);

        if (str1.equals(str2)) { //сравнение строк 1 и 2
            System.out.println("Строки являются вращением друг друга.");
        } else {
            System.out.println("Строки не являются вращением друг друга.");
        }
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
        StringBuilder str = new StringBuilder();
        str.append("2 + 2 = 4");
        System.out.println("\nСтрока, в которой необходимо заменить символ '=' на слово 'равно': "+str);
        str.deleteCharAt(6); //удалила символ '='
        str.insert(6,"равно"); //вставила по индексу удалённого символа '=' слово 'равно'
        System.out.println("Замена символа '=' на слово 'равно': "+str);
    };

/* 6. *Замените символ “=” на слово “равно”. Используйте метод StringBuilder.replace().*/
    static void replCharAsterisk(){
        StringBuilder str = new StringBuilder();
        str.append("2 + 2 = 4");
        System.out.println("\nСтрока, в которой необходимо заменить символ '=' на слово 'равно': "+str);
        str.replace(6,7,"равно");
        System.out.println("Замена символа '=' на слово 'равно': "+str);
    };
/* 7. **Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов "="
средствами String и StringBuilder.
*/
    static void compareTime(){

    };

}
