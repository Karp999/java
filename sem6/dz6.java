package sem6;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
public class dz6 {

    public static void main(String[] args) {
//1. Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
        HashSet<String> NewYear = new HashSet<String>();
//2. Добавить пять элементов в множество.
        NewYear.add("Гирлянда");
        NewYear.add("Игрушка");
        NewYear.add("Ёлка");
        NewYear.add("Мандарин");
        NewYear.add("Оливье");
        System.out.println("\nМножество элементов NewYear: ");
        System.out.println(NewYear);
//3. Отсортировать значения используя итератор. + //4. Отсортированный результат сохранить в LinkedHashSet.
        System.out.println("\nСортировка элементов NewYear: ");
        ArrayList<String> arrayNY = new ArrayList();
        LinkedHashSet<String> sortElementsOfNY = new LinkedHashSet<>();

        for (String elementsOfNY : NewYear) {
            arrayNY.add(elementsOfNY);
        }

        Collections.sort(arrayNY);
        for (String string : arrayNY) {
            sortElementsOfNY.add(string);
        }

        System.out.println(sortElementsOfNY);

//5. Создать TreeSet с компаратором.
//6. Скопировать содержимое первого множества (HashSet) в TreeSet.
//7. *Скорректировать компаратор так, чтобы поля хранились в обратном порядке.

    }
}
