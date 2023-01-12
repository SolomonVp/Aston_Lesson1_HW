import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class OwnList<T>{
    private final int capacity = 10;
    private int count = 0;
    Object [] ownList = new Object[capacity];

    public void add(T value) {
        if (ownList.length == count) {
            overwrite();
        }
        ownList[count++] = value;
    }
    public T get(int index) {
        return (T) ownList[index];
    }
    public int size() {
        return count;
    }
    private void overwrite() {
        Object [] newObjectList = new Object[ownList.length * 2];
        System.arraycopy(ownList, 0, newObjectList, 0, ownList.length);
        ownList = newObjectList;
    }
    public void delete(int index) {
        for (int i = index; i < count; i++) {
            ownList[i] = ownList[i + 1];
        }
    }

    public void set(int index, int value) {
        ownList[index] = value;
    }

//    public void addAll(OwnList<? extends T> ownList, OwnList<? extends T> ownList2) {
//        OwnList <? extends T> ownList3 = new OwnList<>();
//
////        for (int i = 0; i < ownList.size(); i++ ) {
////            ownList3[i] = ownList[i];
////        }
//
//
//        int [] arr1 = new int[ownList.size()];
//        int [] arr2 = new int[ownList2.size()];
//        int [] arr3 = new int[ownList.size() + ownList2.size()];
//        for (int i = 0; i < ownList.size(); i++) {
//            arr1[i] = (int) ownList.get(i);
//        }
//        for (int i = 0; i < ownList2.size(); i++) {
//            arr2[i] = (int) ownList2.get(i);
//        }
//
//        System.arraycopy(arr3, 0, arr1, 0, arr1.length);
//        System.arraycopy(arr3, arr1.length, arr2, 0, arr2.length);
//        System.out.println(Arrays.toString(arr3));
//
//        for (int i = 0; i < arr3.length; i++) {
//            ownList3.add(arr3[i]);
//        }
//    }
}
