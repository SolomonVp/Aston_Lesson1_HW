public class OwnList<T>{
    private final int capacity = 10;
    private int count = 0;
    Object [] arr = new Object[capacity];

    public void add(T value) {
        if (arr.length == count) {
            overwrite();
        }
        arr[count++] = value;
    }
    public T get(int index) {
        return (T) arr[index];
    }
    public int size() {
        return count;
    }
    private void overwrite() {
        Object [] newObjectList = new Object[arr.length * 2];
//        System.arrayCopy(from, fromIndex, to, toIndex, count) - copy array;
        System.arraycopy(arr, 0, newObjectList, 0, arr.length);
        arr = newObjectList;
    }

    public void delete(int index) {
        for (int i = index; i < count; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public void addAll(OwnList<T> ownList2) {
        Object [] l = new Object[arr.length + ownList2.size()];
//        if (arr.length + ownList2.size() > count) {
//            overwrite();
//        }
        System.arraycopy(arr, 0, l, arr.length, ownList2.size());
        arr = l;
    }


//    public void bubbleSort(int [] arr) {
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 1; i < arr.length; i++) {
//                if (arr[i] < arr[i - 1]) {
//                    int s = arr[i];
//                    arr[i] = arr[i - 1];
//                    arr[i - 1] = s;
//                    isSorted = false;
//                }
//            }
//        }
//    }
}
