public class OwnList<T> implements OwnListMethods{
    private final int CAPACITY = 10;
    private int count = 0;
    Object[] ownList = new Object[CAPACITY];

    @Override
    public void add(Object value) {
        if (ownList.length == count) {
            overWriteUpCapacity();
        }
        ownList[count++] = value;
    }

    @Override
    public void overWriteUpCapacity() {
        Object [] newList = new Object[ownList.length * 2];
        System.arraycopy(ownList, 0, newList, 0, ownList.length);
        ownList = newList;
        System.out.println("Capacity было увеличенно в два раза");
    }

    @Override
    public Object get(int index) {
        return ownList[index];
    }

    //    public Object get(int index) {
//        return (T) ownList[index];
//    }

//    public int size() {
//        return count;
//    }

//    public void delete(int index) {
//        for (int i = index; i < count; i++) {
//            ownList[i] = ownList[i + 1];
//        }
//        count--;
//    }

//    public void set(int index, int value) {
//        ownList[index] = value;
//    }

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

