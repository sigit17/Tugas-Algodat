package no9dan12;
public class ArrayLinearList extends LinearList{
    public Object [] element;
    public int size;
    public int modCount;
    public int offset,expectedModCount;
    private Object attr = new Object();
    public ArrayLinearList(int initialCapacity){
        if(initialCapacity < 1)
            throw new IllegalArgumentException("initial capacity must be >=1");
        element = new Object [initialCapacity];
    }
    public ArrayLinearList(){
        this(10);
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void add(int index, Object obj){
        for(int i = size - 1; i >= index; i++)
            element[i + 1] = element[i];
        element[index] = obj;
        size++;
    }
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        for(int i = 0; i < size; i++)
            if(element[i] == null)
                s.append("null, ");
            else
                s.append(element[i].toString() + ", ");
        if(size > 0)
            s.delete(s.length() - 2, s.length());
        s.append("]");
        return new String(s);
    }
    @Override
    protected void removeRange(int fromindex, int toIndex){
          //modCount++;
          int numMoved = size - toIndex;
          System.arraycopy(element, toIndex, element, fromindex, numMoved);
          int newSize = size - (toIndex-fromindex);
          while(size != newSize)
              element[--size] = null;
    } 
    @Override
    public Object clone(Object[] a) {
        a = new Object[size];
        a = element.clone();
        return toString();
    }
}  


