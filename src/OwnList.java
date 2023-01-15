public class OwnList<T> implements OwnListMethods {
    private final int CAPACITY = 16;
    private int countOfCapacity = 0;
    Object[] ownList = new Object[CAPACITY];

    @Override
    public void add(Object value) {
        if (ownList.length == countOfCapacity) {
            overWriteUpCapacity();
        }
        ownList[countOfCapacity++] = value;
    }

    @Override
    public void overWriteUpCapacity() {
        Object[] newList = new Object[ownList.length * 2];
        System.arraycopy(ownList, 0, newList, 0, ownList.length);
        ownList = newList;
        System.out.println("Capacity было увеличенно в два раза");
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return ownList[index];
    }

    @Override
    public void checkIndex(int index) {
        if (index < 0 || index > ownList.length) {
            System.out.println("Бро, you are talking nonsense");
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int length() {
        return countOfCapacity;
    }

    @Override
    public void delete(int index) {
        checkIndex(index);
        for (int i = index; i < countOfCapacity; i++) {
            ownList[i] = ownList[i + 1];
        }
        countOfCapacity--;
    }

    @Override
    public <T> void set(int index, T value) {
        checkIndex(index);
        ownList[index] = value;
    }



//    public void addAll(OwnList<T> list, OwnList<T> ownList2) {
//        Object[] o = new Object[list.size() + ownList2.size()];
//        System.out.println(o.length);
//
//        int num = 0;
//        for (int i = 0; i < list.size(); i++) {
//            o[i] = list.get(i);
//            num++;
//        }
//        for (int j = 0; j < ownList2.size(); j++) {
//            o[num] = ownList2.get(j);
//            num++;
//        }
//        for (int i = 0; i < o.length; i++) {
//            if (o[i] == null) {
//                continue;
//            }
//            list.set(i, (int)o[i]);
//        }
//    }
}

