package sem4;

import java.util.ArrayList;
public class dz4 {

// 1. Написать приложение для ввода ФИО, возраста и пола пользователей. Данные хранить в разных списках.
    ArrayList<String> listSurname = new ArrayList<>();
    ArrayList<String> listName = new ArrayList<>();
    ArrayList<String> listPatronymic = new ArrayList<>();
    ArrayList<Integer> listAge = new ArrayList<>();
    ArrayList<Boolean> listGender = new ArrayList<>();
    public static void main(String[] args) {
// 2. Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.
        sortAge();
        sortGender();
        firstLetterOfSurname();

    }



    static void sortAge(){

    }

    static void sortGender(){

    }

    static void firstLetterOfSurname(){

    }
// 3. *Добавить возможность одновременной сортировки по двум параметрам.
// 4. **Добавить возможность одновременной сортировки по трём параметрам.

}
