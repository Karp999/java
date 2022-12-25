package sem5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dz5 {

        public static void main(String[] args) {
//1. Создать словарь HashMap. Обобщение <Integer, String>.
                HashMap <Integer, String> writers = new HashMap<Integer, String>();

//2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
                writers.put(0,"Тургенев Иван Сергеевич 64 м");
                writers.put(1,"Булгаков Михаил Афанасьевич 48 м");
                writers.put(2,"Пастернак Борис Леонидович 70 м");
                writers.put(3,"Гоголь Николай Васильевич 42 м");
                writers.put(4,"Островский Александр Николаевич 63 м");
                writers.put(5,"Достоевский Фёдор Михайлович 59 м");
                writers.put(6,"Пушкин Александр Сергеевич 37 м");
                writers.put(7,"Чехов Антон Павлович 44 м");

                Set <Map.Entry<Integer,String>> allWriters = writers.entrySet();
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



        }
}
