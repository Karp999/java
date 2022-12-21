package sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        addition("Даниленко Артём  Викторович", "м", 18);
        addition("Даниленко Веселина Владиславовна", "ж", 12);
        addition("Пушкина Анастасия Ильинична", "ж", 26);
    }
// 2. Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.

    static void addition(String fio, String gender, int age) {
        String[] fio1 = fio.split(" ");
        listSurname.add(fio1[1]);
        listName.add(fio1[0]);
        listPatronymic.add(fio1[2]);
        if (gender.contains("ж")) {listGender.add(true);} else  {listGender.add(false);}
        listAge.add(age);
        linkedlist.add(listAge.size() - 1);
    };




        static void sortAge(String fio, String gender, int age){
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
                    linkedlist.forEach(i -> System.out.println(listSurname.get(i) + " " + listName.get(i).toUpperCase().charAt(0) + "." + listPatronymic.get(i) + listGender.get(i) + listAge.get(i)));
                }
            }
        static void sortGender(){

         }

        static void firstLetterOfSurname(){

        }

// 3. *Добавить возможность одновременной сортировки по двум параметрам.
// 4. **Добавить возможность одновременной сортировки по трём параметрам.

}
