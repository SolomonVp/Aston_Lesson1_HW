public interface OwnListMethods {
    public void add(Object value);
    public void overWriteUpCapacity();
    public Object get(int index);
    public void checkIndex(int index);
    public int length();
    public void delete(int index);
    public <T> void set(int index, T value);    // !!!! ВНИМАНИЕ!!! Проверить на капасити при вставке!!!! Не забыть!!!

//    public void clearOfNull();
//    public void addAll();
//    public void bubbleSort();
}
