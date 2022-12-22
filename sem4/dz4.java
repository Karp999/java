package sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class dz4 {

// 1. Написать приложение для ввода ФИО, возраста и пола пользователей. Данные хранить в разных списках.
    static ArrayList<String> listSurname = new ArrayList<>();
    static ArrayList<String> listName = new ArrayList<>();
    static ArrayList<String> listPatronymic = new ArrayList<>();
    static ArrayList<Integer> listAge = new ArrayList<>();
    static ArrayList<Boolean> listGender = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();
    public static void main(String[] args) {

        addition("Абрамов Абрам Александрович", "м", 46);
        addition("Абрамова Софья Ивановна", "ж", 50);
        addition("Бунин Сергей Викторович", "м", 32);
        addition("Бунина Анастасия Ивановна", "ж", 29);
        addition("Глазов Вячеслав Александрович", "м", 30);
        addition("Глазова Светлана Ивановна", "ж", 55);
        addition("Даниленко Артём Викторович", "м", 18);
        addition("Даниленко Веселина Владиславовна", "ж", 12);
        addition("Пушкина Анастасия Ильинична", "ж", 26);
        System.out.println("\nСписок пользователей: \n");
        linkedlist.forEach(i -> System.out.println(" ФИО: "+ listSurname.get(i) + " " + listName.get(i) + " " + listPatronymic.get(i)+ " , пол: " + listGender.get(i) + " , возраст: " + listAge.get(i)));

        Scanner scan = new Scanner(System.in);
        System.out.println("\nВыберите способ обработки списка пользователей:\n "+ "\n1 - сортировка по гендерному признаку, " + "\n2 - сортировка по возрасту," + "\n3 - сортировка по первой букве фамилии,"+ "\n0 - выход из программы");
        int numb = scan.nextInt();
        switch (numb) {
            case (1):
                sortGender();
                break;
            case (2):
                sortAge();
                break;
            case (3):
                firstLetterOfSurname(0);
                break;
            case (0):
                break;
            default:
                System.out.println("Ошибка! Перезапустите программу. ");
                break;
        }

    }
// 2. Добавить методы для сортировки пользователей по полу, возрасту и первой букве фамилии.

    static void addition(String fio, String gender, int age) {    //добавление пользователя
        String[] fio1 = fio.split(" ");
        listSurname.add(fio1[0]);
        listName.add(fio1[1]);
        listPatronymic.add(fio1[2]);
        if (gender.contains("ж")) {
            listGender.add(true);
        } else {
            listGender.add(false);
        }
        listAge.add(age);
        linkedlist.add(listAge.size() - 1);
    };

    static void sortGender() { //сортировка пользователей по полу
        System.out.println("\nСортировка пользователей по гендерному признаку: ");
        for (int i = 0; i < linkedlist.size(); i++) {
            if (listGender.get(linkedlist.get(i))) {
                int tmpGender = linkedlist.get(i);
                linkedlist.remove(i);
                linkedlist.add(0, tmpGender);
            }
        }
        System.out.println(linkedlist + "\n"); //отображение по номерам ссылок, а ниже отображение самих списков в последовательности этих номеров:
        linkedlist.forEach(i -> System.out.println(" ФИО: "+ listSurname.get(i) + " " + listName.get(i) + " " + listPatronymic.get(i)+ " , пол: " + listGender.get(i) + " , возраст: " + listAge.get(i)));
    }


    static void sortAge(){ //сортировка пользователей по возрасту
            int cnt = linkedlist.size() - 1;
            while (cnt > -1) {
                int max_age = listAge.get(linkedlist.get(cnt));
                int index = cnt;
                for (int i = 0; i < cnt; i++) {
                    if (max_age < listAge.get(linkedlist.get(i))) {
                        max_age = listAge.get(linkedlist.get(i));
                        index = i;
                    }
                }
                int tmp = linkedlist.get(cnt);
                linkedlist.set(cnt, linkedlist.get(index));
                linkedlist.set(index, tmp);
                cnt--;
            }
    }

    static void firstLetterOfSurname(int key){ //сортировка пользователей первой букве фамилии
        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            String LName = listSurname.get(linkedlist.get(cnt));
            Boolean MaleOrFemale = listGender.get(linkedlist.get(cnt));
            int varAge = listAge.get(linkedlist.get(cnt));
            int index = cnt;
            if (key == 0){
                for (int i = 0; i < cnt; i++){
                    if (LName.compareToIgnoreCase(listSurname.get(linkedlist.get(i))) < 0){
                        LName = listSurname.get(linkedlist.get(i));
                        index = i;
                    }
                }
            }
            else if (key == 1){
                for (int i = 0; i < cnt; i++){
                    if (LName.compareToIgnoreCase(listSurname.get(linkedlist.get(i))) < 0
                            && MaleOrFemale.equals(listGender.get(linkedlist.get(i)))
                            && varAge == listAge.get(linkedlist.get(i))){
                        LName = listSurname.get(linkedlist.get(i));
                        index = i;
                    }
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;

    }

// 3. *Добавить возможность одновременной сортировки по двум параметрам.
// 4. **Добавить возможность одновременной сортировки по трём параметрам.

}
}
