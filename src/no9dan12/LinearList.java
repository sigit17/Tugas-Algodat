package no9dan12;
public abstract class LinearList{

    int modCount;
    public abstract int size();
    public abstract void add(int index, Object obj);
    @Override
    public abstract String toString();
    protected abstract void removeRange(int fromIndex, int toIndex);
    protected abstract Object clone(Object [] a);
}
