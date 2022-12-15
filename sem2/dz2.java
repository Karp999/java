package sem2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {
        findInputStr();
        reverseInput();
        strComposition();
        replCharSB();
        replCharAsterisk();
        compareTime();
    }

/* 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).*/
    static void findInputStr(){
        String str1 = "В Каргополе белые ночи прекрасны!";
        String str2 = "белые ночи";
        int result1 = str1.indexOf(str2);
        System.out.println("\nИндекс вхождения строки -> " + result1);
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
//    static String reverseStr(String str, int lengthS){
//        str = "партиципаторный";
//        int lengths = str.length();
//        System.out.println(str);
//
//        if (lengthS == 0){
//            return str.charAt(lengthS) + "";
//        }
//        else {
//            return (str.charAt(lengthS) + reverseStr(str, lengthS - 1));
//            str = reverseStr(str, lengths - 1);
//            System.out.println(str);
//    };

/* 4. Дано два числа, например 3 и 56, необходимо составить следующие строки:
3 + 56 = 59
3 – 56 = -53
3 * 56 = 168
Используем метод StringBuilder.append().*/
    static void strComposition(){
        StringBuilder str = new StringBuilder();
        Scanner scanS = new Scanner(System.in);
        System.out.println("\nВведите два целых числа: ");
        int userNum1 = scanS.nextInt();
        int userNum2 = scanS.nextInt();
        int result = 0;
        System.out.println("Введите одну из операций:  * , / , + , - .");
        String sign = scanS.next();
        if (sign.equals("/") & userNum2 == 0){
            System.out.println("Ошибка: на ноль делить нельзя!");
            System.exit(0);
        } else if (sign.equals("*")){
            result = userNum1 * userNum2;
        } else if (sign.equals("/")) {
            result = userNum1 / userNum2;
        } else if (sign.equals("+")){
            result = userNum1 + userNum2;
        } else if (sign.equals("-")){
            result = userNum1 - userNum2;
        } else {
            System.out.println("Ошибка: ввести можно одну из предложенных операций:  * , / , + , - .");
        }
        str.append(userNum1 + " ").append(sign).append(" " + userNum2).append(" = ").append(result);
        System.out.println("Составленное выражение его результат: " + str);
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

        System.out.println("\nSTR1: ");
        String str1 = "";
        long start = System.currentTimeMillis();
        for (int g = 0; g < 10000; g++) {
            str1 += "=";
        };
        System.out.println(str1);
        long end = System.currentTimeMillis();
        long res1 = end-start;
        System.out.println("Время выполнения строки 1, содержащей 10000 символов \"=\" классом String: "+ res1);

        System.out.println("\nSTR2 :");
        StringBuilder str2 = new StringBuilder();
        start = System.currentTimeMillis();
        for (int g = 0; g < 10000; g++) {
            str2.append("=");
        }
        System.out.println(str2);
        end = System.currentTimeMillis();
        long res2 = end-start;
        System.out.println("Время выполнения строки 2, содержащей 10000 символов \"=\" классом StringBuilder: "+ res2);

        System.out.println("\nSTR3: ");
        String str3 = "2 + 2 = 4";
        start = System.currentTimeMillis();
        str3 = str3.replaceAll("=","равно");
        System.out.println("Замена символа '=' на слово 'равно': "+ str3);
        end = System.currentTimeMillis();
        long res3 = end-start;
        System.out.println("Время выполнения строки 3, содержащей 10000 символов \"=\" классом String: "+ res3);


        System.out.println("\nSTR4: ");
        StringBuilder str4 = new StringBuilder();
        start = System.currentTimeMillis();
        str4.append("2 + 2 = 4");
        System.out.println("Строка, в которой необходимо заменить символ '=' на слово 'равно': "+ str4);
        str4.replace(6,7,"равно");
        System.out.println("Замена символа '=' на слово 'равно': "+ str4);
        end = System.currentTimeMillis();
        long res4 = end-start;
        System.out.println("Время выполнения строки 4, в которой необходимо заменить символ “=” на слово “равно”, используя метод StringBuilder.replace(): "+ res4);
        /* У меня вышло в IDEA:
        STR1: 22
        STR2: 0
        STR3: 0
        STR4: 0

        В VS Code:
        STR1: 38
        STR2: 8
        STR3: 4
        STR4: 1
        * */
    };
}