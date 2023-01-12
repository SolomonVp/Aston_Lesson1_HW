public class OwnList<T>{
    private final int CAPACITY = 10;
    private int count = 0;
    Object[] ownList = new Object[CAPACITY];

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
        Object[] newObjectList = new Object[ownList.length * 2];
        System.arraycopy(ownList, 0, newObjectList, 0, ownList.length);
        ownList = newObjectList;
    }

    public void delete(int index) {
        for (int i = index; i < count; i++) {
            ownList[i] = ownList[i + 1];
        }
        count--;
    }

    public void set(int index, int value) {
        ownList[index] = value;
    }

    public OwnList<T> addAll(OwnList<T> ownList, OwnList<T> ownList2) {
        Object[] o = new Object[ownList.size() + ownList2.size()];
        System.out.println(o.length);

        int num = 0;
        for (int i = 0; i < ownList.size(); i++) {
            o[i] = ownList.get(i);
            num++;
        }
        for (int j = 0; j < ownList2.size(); j++) {
            o[num] = ownList2.get(j);
            num++;
        }
        for (int i = 0; i < o.length; i++) {
            if (o[i] == null) {
                continue;
            }
            ownList.set(i, (int)o[i]);
        }
        return ownList;
    }
}

