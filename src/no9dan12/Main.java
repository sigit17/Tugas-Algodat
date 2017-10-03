package no9dan12;
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        ArrayLinearList x = new ArrayLinearList();
        x.add(0, "0");
        x.add(1, "1");
        x.add(2, "2");
        x.add(3, "3");
        Object[] y = new Object[20];

        System.out.println("panjang array : "+x.size);
        System.out.println("Panjang elemen : "+x.element.length);
        System.out.println("data dipanggil di variabel x : "+x.toString());
        x.removeRange(0, 3);
        System.out.println(x.toString());
        System.out.println("data dipanggil di variabel y : "+x.clone(y));
    }
}
