package sem3;
import java.util.ArrayList;
import java.util.ListIterator;
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


    }


//6. Удалить третий элемент из списка.
//7. Поиска элемента в списке по строке.
//8. Создать новый список и добавить в него несколько элементов первого списка.
//9. Удалить из первого списка все элементы отсутствующие во втором списке.
//10. *Сортировка списка.
//11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.




}
