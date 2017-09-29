package nomor1;
public class Driver2 {
    public static void main(String[] args) {
        Object [][] data = {
            {"Ronaldo", "Karyawan", "gaji 2.000.000"},{"Messi", "Guru", "gaji 10.000.000"},{"Doni", "Manager", "gaji 15.000.000"}}; 
    Object [][] ganti = ChangeArrayLength.changeLength2d(data, 6, 3);
        
    System.out.println("Panjang   : "+ganti.length);
    System.out.println("Panjang 2 : "+ganti[0].length);
    for(Object[] ganti2 : ganti){
        for(int i = 0; i < ganti[0].length; i++){
            System.out.println(ganti2[i]);
        }
        System.out.println();
    }    
    }
}

