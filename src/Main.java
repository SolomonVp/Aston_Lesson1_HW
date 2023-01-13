//        Необходимо написать свою реализацию коллекции на выбор LinkedList или ArrayList.
//        Должны быть основные методы add, get, remove, addAll, остальное на ваше усмотрение
//        Плюс написать реализацию сортировки пузырьком с флагом, который прекращает сортировку,
//        если коллекция уже отсортирована (если arrayList - сортировка в нем, если linked - в отдельном месте)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OwnList<Integer> list = new OwnList<>();

        // + add -------------------------------------------------------------------------------------------------------
        for (int i = 0; i < 16; i++) {
            list.add(i);
            System.out.println(list.get(i));
        }


        // + size ------------------------------------------------------------------------------------------------------
//        System.out.println("\n" + list.size() + " - длина");

        // + get -------------------------------------------------------------------------------------------------------
//        System.out.println(list.get(4) + " - элемент под индексом");

        // + delete ----------------------------------------------------------------------------------------------------
//        list.delete(4);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }

        // + addAll ----------------------------------------------------------------------------------------------------
//        OwnList<Integer> ownList2 = new OwnList<>();
//        ownList2.add(10001);
//        ownList2.add(10002);
//
//        list.addAll(list, ownList2);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i) + "------------------------");
//        }

        // bubbleSort --------------------------------------------------------------------------------------------------
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 1; i < list.size(); i++) {
//                if (list.get(i) < list.get(i - 1)) {
//                    int s = list.get(i);
//                    list.set(list.get(i), list.get(i - 1));
//                    list.set(list.get(i - 1), s);
//                    isSorted = false;
//                }
//            }
//        }
    }
}

