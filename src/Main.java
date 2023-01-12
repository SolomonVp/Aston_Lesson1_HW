//        Необходимо написать свою реализацию коллекции на выбор LinkedList или ArrayList.
//        Должны быть основные методы add, get, remove, addAll, остальное на ваше усмотрение
//        Плюс написать реализацию сортировки пузырьком с флагом, который прекращает сортировку,
//        если коллекция уже отсортирована (если arrayList - сортировка в нем, если linked - в отдельном месте)

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OwnList <Integer> ownList = new OwnList<>();

        // + add
        for (int i = 0; i < 22; i++) {
            ownList.add(i*2);
            System.out.print(ownList.get(i) + " ");
        }

        // + size
        System.out.println("\n" + ownList.size() + " - длина");

        // + get
        System.out.println(ownList.get(4) + " - эдемент под индексом");

        // + delete
        ownList.delete(4);
        for (int i = 0; i < ownList.size(); i++) {
            System.out.print(ownList.get(i) + " ");
        }
        System.out.println("\n" + ownList.size() + " - длина");
        System.out.println(ownList.get(4) + " - эдемент под индексом");

        // sort

        // ownList.bubbleSort();

        OwnList <Integer> ownList2 = new OwnList<>();
        ownList2.add(34);
        ownList2.add(45);
        ownList.addAll(ownList2);
        for (int i = 0; i < ownList.size(); i++) {
            System.out.print(ownList.get(i) + " ");
        }
        System.out.println("\n" + ownList.size() + " - длина");
    }
}

