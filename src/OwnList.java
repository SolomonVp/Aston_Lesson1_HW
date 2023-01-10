
public class OwnList<T> {
    private final int capacity = 10;
    int up = 2;
    int count = 0;
    Object [] objectList = new Object[capacity];

    public void add(T value) {
        if (objectList.length-1 == count) {
            overwrite();
        }
        objectList[count++] = value;
    }
    public void delete(int index) {
        objectList[index] = null;
    }

    public void update() {

    }

    public T get(int index) {
        return (T) objectList[index];
    }

    private void overwrite() {
        Object [] newObjectList = new Object[objectList.length * 2];
//        System.arrayCopy(from, fromIndex, to, toIndex, count) - copy array;
        System.arraycopy(objectList, 0, newObjectList, 0, count - 1);
        objectList = newObjectList;
    }
}
