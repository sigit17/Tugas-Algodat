package nomor4_5_6_8;
public class Driver {
    public static void main(String [] args){
        ArrayLinearList x = new ArrayLinearList1();
        x.add(0,"a");
        x.add(1,"w");
        x.add(2,"e");
        x.add(3,"g");
        x.add(4,"d");
        System.out.println(x.toString());
        System.out.println("panjang array : "+x.size());
        System.out.println("panjang elemen sebelum di trim : "+x.capacity);
        x.trimToSize();
        System.out.println("panjang elemen setelah di trim : "+x.capacity);
        x.setSize(5);
        System.out.println("ukuran elemen di set menjadi: " +x.element2.length);
        x.remove(1);
        System.out.println("Tampilan setelah indek 1 dihapus :");
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.element[i]);
        }
    }
}

