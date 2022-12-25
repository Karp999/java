package sem5;

import java.util.*;

public class dz5 {
        public static void main(String[] args) {
//1. Создать словарь HashMap. Обобщение <Integer, String>.
                HashMap<Integer, String> writers = new HashMap<Integer, String>();

//2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
                writers.put(0, "Тургенев Иван Сергеевич 64 м");
                writers.put(1, "Булгаков Михаил Афанасьевич 48 м");
                writers.put(2, "Пастернак Борис Леонидович 70 м");
                writers.put(3, "Гоголь Николай Васильевич 42 м");
                writers.put(4, "Островский Александр Николаевич 63 м");
                writers.put(5, "Достоевский Фёдор Михайлович 59 м");
                writers.put(6, "Пушкин Александр Сергеевич 37 м");
                writers.put(7, "Чехов Антон Павлович 44 м");

                Set<Map.Entry<Integer, String>> allWriters = writers.entrySet();
                System.out.println("\nСписок писателей (ключ+значение): ");
                System.out.println(allWriters);

//3. Изменить значения сделав пол большой буквой.
                Set<Integer> keysWriters = writers.keySet();
                for (int i = 0; i < writers.size(); i++) {
                        int a = (int) keysWriters.toArray()[i];
                        String[] strW = writers.get(a).split(" ");
                        String str1 = strW[0] + " " + strW[1] + " " + strW[2] + " " + strW[3] + " " + strW[4].toUpperCase();
                        writers.replace(a, str1);
                }
                System.out.println("\nЗаменили у гендера значения с маленькой буквы на большую: ");
                System.out.println(allWriters);

//4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
                System.out.println("\nВывод значений в формате \"Иванов И.И.\": ");
                for (Integer keys : keysWriters) {
                        String temp = writers.get(keys).split(" ")[0];
                        String initialsOfWriters = temp.toUpperCase().charAt(0) + temp.toLowerCase().substring(1, temp.length());
                        temp = writers.get(keys).split(" ")[1].toUpperCase().charAt(0) + ".";
                        initialsOfWriters = initialsOfWriters + " " + temp;
                        temp = writers.get(keys).split(" ")[2].toUpperCase().charAt(0) + ".";
                        initialsOfWriters = initialsOfWriters + temp;
                        System.out.println(initialsOfWriters);
                }

//5. *Сортировать значения по возрасту и вывести отсортированную коллекцию как в четвёртом пункте.
                ArrayList<String> listSurname = new ArrayList<>();
                ArrayList<String> listName = new ArrayList<>();
                ArrayList<String> listPatronymic = new ArrayList<>();
                ArrayList<Integer> listAge = new ArrayList<>();
                ArrayList<String> listGender = new ArrayList<>();
                List <Integer> linkedlist = new LinkedList<>();
                for (Integer keys : writers.keySet()) {
                        String[] valuesSeparately = writers.get(keys).split(" ");
                        listSurname.add(valuesSeparately[0]);
                        listName.add(valuesSeparately[1]);
                        listPatronymic.add(valuesSeparately[2]);
                        listAge.add(Integer.parseInt(valuesSeparately[3]));
                        listGender.add(valuesSeparately[4]);
                        linkedlist.add(listAge.size() - 1);
                }
                System.out.println("\nСортировка писателей по возрасту: ");
                int positionLink = linkedlist.size() - 1;
                while (positionLink > -1) {
                        int maxAge = listAge.get(linkedlist.get(positionLink));
                        int index = positionLink;
                        for (int i = 0; i < positionLink; i++) {
                                if (maxAge < listAge.get(linkedlist.get(i))) {
                                        maxAge = listAge.get(linkedlist.get(i));
                                        index = i;
                                }
                        }
                        int tempVar = linkedlist.get(positionLink);
                        linkedlist.set(positionLink, linkedlist.get(index));
                        linkedlist.set(index, tempVar);
                        positionLink--;
                }

                linkedlist.forEach(i -> System.out.println(" ФИО: "+ listSurname.get(i) + " " + listName.get(i) + " " + listPatronymic.get(i)+ " , пол: " + listGender.get(i) + " , возраст: " + listAge.get(i)));
                HashMap<Integer, String> writersNewSorted = new HashMap<Integer, String>();

                for (int i = 0; i < writersNewSorted.size(); i++) {
                        writersNewSorted.put(0, String.valueOf(listSurname.get(i)));
                        writersNewSorted.put(1, String.valueOf(listName.get(i)));
                        writersNewSorted.put(2, String.valueOf(listPatronymic.get(i)));
                        writersNewSorted.put(3, String.valueOf(listGender.get(i)));
                        writersNewSorted.put(4, String.valueOf(listAge.get(i)));
                }


                Set<Map.Entry<Integer, String>> writersNewSorted2 = writersNewSorted.entrySet();
                System.out.println("\nСписок писателей (ключ+значение): ");
                System.out.println(writersNewSorted2);

                //хотела сортировать в linkedlist, а потом вернуть в таком виде в HashMap и вывести кодом из 4 задачи, но пока не получилось.


//                for (Integer keys : keysWriters) {
//                        String temp = writers.get(keys).split(" ")[0];
//                        String initialsOfWriters = temp.toUpperCase().charAt(0) + temp.toLowerCase().substring(1, temp.length());
//                        temp = writers.get(keys).split(" ")[1].toUpperCase().charAt(0) + ".";
//                        initialsOfWriters = initialsOfWriters + " " + temp;
//                        temp = writers.get(keys).split(" ")[2].toUpperCase().charAt(0) + ".";
//                        initialsOfWriters = initialsOfWriters + temp;
//                        System.out.println(initialsOfWriters);
//                }
        }
}
