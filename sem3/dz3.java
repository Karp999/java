package sem3;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
import java.util.LinkedList;

public class dz3 {
    public static void main(String[] args) {

//1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> flowers = new ArrayList<String>();
        flowers.add("rose");
        flowers.add("lilac");
        flowers.add("iris");
        ;
        flowers.add("violet");
        flowers.add("carnation");
        flowers.add("forget-me-not");
        flowers.add("peony");
        System.out.println("\n1.Коллекция цветов: ");
        System.out.println(flowers);

//2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        System.out.println("\n2.Итерация: ");
        ListIterator<String> iteratorF = flowers.listIterator();
        while (iteratorF.hasNext()) {
            iteratorF.set(iteratorF.next().concat("!"));
        }
        System.out.println(flowers);

//3. Вставить элемент в список в первой позиции.
        System.out.println("\n3.Добавление элемента: ");
        flowers.add(0, "aster");
        System.out.println(flowers);

//4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("\n4.Извлечение элемента: ");
        System.out.println(flowers.get(0));

//5. Обновить определенный элемент списка по заданному индексу.
        System.out.println("\n5.Обновление элемента: ");
        flowers.set(0,"aster!");
        System.out.println(flowers.get(0));

//6. Удалить третий элемент из списка.
        System.out.println("\n6.Удаление элемента №3: "); //это "lilac" - индекс 2
        System.out.println("Список до удаления: ");
        System.out.println(flowers);
        System.out.println("Список после удаления: ");
        flowers.remove(2); //
        System.out.println(flowers);

//7. Поиска элемента в списке по строке.
        System.out.println("\n7.Поиск элемента: ");
        //пример для false через contains() и пример поиска индекса элемента indexOf()
        System.out.println(flowers.contains("lilac!"));
        System.out.println(flowers.indexOf("lilac!"));
        //пример для true через contains() и пример поиска индекса элемента indexOf()
        System.out.println(flowers.contains("forget-me-not!")); //пример для true
        System.out.println(flowers.indexOf("forget-me-not!"));

//8. Создать новый список и добавить в него несколько элементов первого списка.
        System.out.println("\n8.Новый список с добавлением нескольких элементов старого: ");
        ArrayList<String> flowersNew= new ArrayList<String>(flowers.subList(2, 6));
        System.out.println(flowersNew);

//9. Удалить из первого списка все элементы отсутствующие во втором списке.
        System.out.println("\n9.Удаление из старого списка элементов, отсутствующих во новом списке: ");
        flowers.retainAll(flowersNew);
        System.out.println(flowers);//вывод оставшихся позиций

//10. *Сортировка списка.
        System.out.println("\n10.Сортировка списка: ");
        System.out.println("До сортировки: "+ flowers);
        Collections.sort(flowers); // сортируется по алфавиту
        System.out.println("После сортировки:"+flowers);

//11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        System.out.println("\n10.Сравнение времени выполнения операции для ArrayList и LinkedList: ");

        System.out.println("\nArrayList(): ");
        ArrayList<String> flowersAL = new ArrayList<String>();
        long start = System.currentTimeMillis();
        System.out.println("Добавление 1000 элементов \"aster\": ");
        for (int i = 0; i < 1000; i++) { flowersAL.add("aster");}
        System.out.println(flowersAL);
        long end = System.currentTimeMillis();
        long res1 = end - start;
        System.out.println("Время выполнения добавления тысячи элементов \"aster\" для ArrayList: " + res1);

        System.out.println("\nLinkedList(): ");
        LinkedList<String> flowersLL = new LinkedList<String>();
        start = System.currentTimeMillis();
        System.out.println("Добавление 1000 элементов \"aster\": ");
        for (int i = 0; i < 1000; i++) { flowersLL.add("aster");}
        System.out.println(flowersLL);
        end = System.currentTimeMillis();
        long res2 = end - start;
        System.out.println("Время выполнения добавления тысячи элементов \"aster\" для ArrayList: " + res2);
        /* У меня вышло в IDEA:
        ArrayList(): 2
        LinkedList(): 1
        В IDEA у меня выводит список одной строкой, и я не уверена, что он формирует 1000 элементов (в отличие от VS Code)

        В VS Code:
        ArrayList(): 10
        LinkedList(): 9
        */
    }
}
