//        Необходимо написать свою реализацию коллекции на выбор LinkedList или ArrayList.
//        Должны быть основные методы add, get, remove, addAll, остальное на ваше усмотрение
//        Плюс написать реализацию сортировки пузырьком с флагом, который прекращает сортировку,
//        если коллекция уже отсортирована (если arrayList - сортировка в нем, если linked - в отдельном месте)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OwnList<Integer> ownList = new OwnList<>();

        // + add -------------------------------------------------------------------------------------------------------
        for (int i = 0; i < 22; i++) {
            ownList.add(i * 2);
            System.out.print(ownList.get(i) + " ");
        }

        // + size ------------------------------------------------------------------------------------------------------
        System.out.println("\n" + ownList.size() + " - длина");

        // + get -------------------------------------------------------------------------------------------------------
        System.out.println(ownList.get(4) + " - эдемент под индексом");

        // + delete ----------------------------------------------------------------------------------------------------
        ownList.delete(4);
        for (int i = 0; i < ownList.size(); i++) {
            System.out.print(ownList.get(i) + " ");
        }
        System.out.println("\n" + ownList.size() + " - длина");
        System.out.println(ownList.get(4) + " - эдемент под индексом");

        // sort --------------------------------------------------------------------------------------------------------

        // ownList.bubbleSort(); ---------------------------------------------------------------------------------------

        OwnList<Integer> ownList2 = new OwnList<>();
        ownList2.add(34);
        ownList2.add(45);

//        ownList.addAll(ownList2);

        for (int i = 0; i < ownList.size(); i++) {
            System.out.print(ownList.get(i) + " ");
        }
        System.out.println("\n" + ownList.size() + " - длина");

//        ArrayList <Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(5);
//        ArrayList <Integer> list2 = new ArrayList<>();
//        list2.add(0);
//        list2.add(7);
//        list2.add(4);
//        list1.addAll(list2);
//        System.out.println(list1);

        // + bubbleSort ------------------------------------------------------------------------------------------------
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < ownList.size(); i++) {
                if (ownList.get(i) < ownList.get(i - 1)) {
                    int s = ownList.get(i);
                    ownList.set(ownList.get(i), ownList.get(i - 1));
                    ownList.set(ownList.get(i - 1), s);
                    isSorted = false;
                }
            }
        }
    }
}

