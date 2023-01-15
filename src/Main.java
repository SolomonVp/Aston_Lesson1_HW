//        Необходимо написать свою реализацию коллекции на выбор LinkedList или ArrayList.
//        Должны быть основные методы add, get, remove, addAll, остальное на ваше усмотрение
//        Плюс написать реализацию сортировки пузырьком с флагом, который прекращает сортировку,
//        если коллекция уже отсортирована (если arrayList - сортировка в нем, если linked - в отдельном месте)

public class Main {
    public static void main(String[] args) {
        OwnList<Integer> list = new OwnList<>();

        // + add -------------------------------------------------------------------------------------------------------
        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
            System.out.println(list.get(i));
        }
        // + get -------------------------------------------------------------------------------------------------------
        int testGet = 9;
        System.out.println("Число по индексу " + testGet + " is " + list.get(testGet));
        // + length ----------------------------------------------------------------------------------------------------
        System.out.println("\n" + list.length() + " - размер коллекции.");

        // + set -------------------------------------------------------------------------------------------------------
        int testIndex = 3;
        int testValue = 46;
        list.set(testIndex, testValue);
        System.out.println("Заменяем значение под индексом " + testIndex + " на значение: " + testValue);
        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));
        }

        // + delete ----------------------------------------------------------------------------------------------------
        list.delete(3);
        System.out.println("Удаляем значение под индексом " + testIndex + ". Значение равно: " + list.get(testIndex));
        for (int i = 0; i < list.length(); i++) {
            System.out.println(list.get(i));
        }

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

