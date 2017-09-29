package nomor4_5_6_8;
public class ArrayLinearList1 extends ArrayLinearList{
    //soal no 4
    @Override
    public void add(int index, Object theElement){   
        for(int i = size - 1; i >= index; i--)
            element[i + 1] = element[i];
        element[index] = theElement;
        size++;
    }
    @Override
    public String toString(){
        StringBuffer s = new StringBuffer("[");
        for(int i  = 0; i < size; i++)
            if(element[i] == null)
                s.append("null, ");
        else
                s.append(element[i].toString() + ", ");
        if(size > 0)
            s.delete(s.length() - 2, s.length());
        s.append("]");
        return new String(s);
    }
    //soal no 5
    @Override
    public void trimToSize() {
    if (size() < capacity) {
        Object[] element2 = new Object[size];
        System.arraycopy(element, 0, element2, 0, size);
        element = element2;
        capacity = size;
        }
    }
    //soal no 8
    @Override
    public Object remove(int index){
        checkIndex(index);
        Object removeElement = element[index];
        for(int i = index + 1; i < size; i++)
            element[i-1] = element[i];
        element[--size] = null;
        return removeElement;
    }
    //soal no 6
    @Override
    public Object setSize(int newSize){
        if(size > newSize){
            int index = size - newSize;
            Object removeElement = element[index];
            for(int i=0; i < index; i++){
            for(int j = index + 1; j < size; j++)
                element[j-1] = element[j];
            element[--size] = null;
            }
            return removeElement;
        }
        else{
            element2  = new Object[newSize];
            System.arraycopy(element, 0, element2,0, size);
            element = element2;
        }
        return size;
    }
}



