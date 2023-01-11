import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

public class OwnList<T>{
    private final int capacity = 10;
    private int count = 0;
    Object [] objectList = new Object[capacity];

    public void add(T value) {
        if (objectList.length == count) {
            overwrite();
        }
        objectList[count++] = value;
    }
    public T get(int index) {
        return (T) objectList[index];
    }
    public int size() {
        return count;
    }
    private void overwrite() {
        Object [] newObjectList = new Object[objectList.length * 2];
//        System.arrayCopy(from, fromIndex, to, toIndex, count) - copy array;
        System.arraycopy(objectList, 0, newObjectList, 0, count - 1);
        objectList = newObjectList;
    }

    public void delete(int index) {
        objectList[index] = null;
//        if (objectList.length < capacity && count < objectList.length) {
//            overwrite(objectList.length/2);
//        }
        count--;
    }

    public void addAll() {

    }






}
