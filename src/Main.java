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
        for (int i = 0; i < 16; i++) {
            ownList.add(i);
        }

        // + size ------------------------------------------------------------------------------------------------------
        System.out.println("\n" + ownList.size() + " - длина");

        // + get -------------------------------------------------------------------------------------------------------
        System.out.println(ownList.get(4) + " - элемент под индексом");

        // + delete ----------------------------------------------------------------------------------------------------
        ownList.delete(4);
        for (int i = 0; i < ownList.size(); i++) {
            System.out.print(ownList.get(i) + " ");
        }

        // + addAll ----------------------------------------------------------------------------------------------------
        OwnList<Integer> ownList2 = new OwnList<>();
        ownList2.add(10001);
        ownList2.add(10002);


        ownList.addAll(ownList, ownList2);
        for (int i = 0; i < ownList.size(); i++) {
            System.out.println(ownList.get(i) + " Ихаааа");
        }

        // bubbleSort --------------------------------------------------------------------------------------------------
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

