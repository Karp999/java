package sem6;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;
import java.util.Comparator;
public class dz6 {

    public static void main(String[] args) {
//1. Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
        HashSet<String> NewYearHS = new HashSet<String>();
//2. Добавить пять элементов в множество.
        NewYearHS.add("Гирлянда");
        NewYearHS.add("Игрушка");
        NewYearHS.add("Ёлка");
        NewYearHS.add("Мандарин");
        NewYearHS.add("Оливье");
        System.out.println("\nМножество элементов NewYearHS: " + NewYearHS);

//3. Отсортировать значения используя итератор. +
    // 4. Отсортированный результат сохранить в LinkedHashSet.

        ArrayList<String> arrayNY = new ArrayList();
        LinkedHashSet<String> sortElementsOfNY = new LinkedHashSet<>();

        for (String elementsOfNY : NewYearHS) {
            arrayNY.add(elementsOfNY);
        }

        Collections.sort(arrayNY);
        for (String string : arrayNY) {
            sortElementsOfNY.add(string);
        }

        System.out.println("\nСортировка элементов NewYearHS: " + sortElementsOfNY);

//5. Создать TreeSet с компаратором. +
    // 6. Скопировать содержимое первого множества (HashSet) в TreeSet. +
        //7. *Скорректировать компаратор так, чтобы поля хранились в обратном порядке.
        TreeSet<String> NewYearTS = new TreeSet<>(new Comparator<String>(){
            @Override
            public int compare(String el1, String el2) {
                if (el1.equals(el2)) {
                    return 0;
                } if (el1.compareTo(el2) < 0) {
                    return 1;
                } else return -1;
            }
        });

        NewYearTS.addAll(NewYearHS);
        System.out.println("\nTreeSet с компаратором в обратном порядке (внутри копия множества HashSet): " + NewYearTS);

    }
}
