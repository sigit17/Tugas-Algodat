package nomor4_5_6_8;
public class ArrayLinearList {
    protected Object [] element,element2;
    protected int size;
    protected int capacity;
    int index;
    public ArrayLinearList(int capacity) {
        this.capacity = capacity;
        element = new Object[capacity];

        index = 0;
    }
    public ArrayLinearList(){
        this(10);
    }
    public boolean isEmpty(){
        return size == 0;
    } 
    public int size(){
        return size;
    }
    void checkIndex(int index){
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index = " + index + "size = " + size);
    }
    public void add(int index, Object theElement){            
    }
    public void trimToSize() {
        
    }
    public Object remove(int i) {
        return null;
    }
    public Object setSize(int newArray) {
        return null;
    }
    @Override
    public String toString(){
        return null;  
    }
}
