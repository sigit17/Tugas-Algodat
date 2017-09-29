package nomor1;
import java.lang.reflect.Array;
//soal no 3
public class ChangeArrayLength {
    public static Object [][] changeLength2d(Object [][] a, int n, int m, int newLength, int newLength2){
        if(n > newLength){
            throw new IllegalArgumentException("new Length is too small");
        }
        if(m > newLength2){
            throw new IllegalArgumentException("new Length 2 is too small");
        }
        Object [][] newArray = (Object [][]) Array.newInstance(a.getClass().getComponentType(),newLength,newLength2);
        newArray = (Object[][])a.clone();
        return newArray;
    }
    static Object[][] changeLength2d(Object[][] a, int newLength, int newLength2) {
        return changeLength2d(a, a.length, a[0].length, newLength, newLength2);        
    }
}

