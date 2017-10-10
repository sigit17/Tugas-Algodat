package no25dan39;

public class Main {
    public static void main(String[] args) {
        ChainDouble c = new ChainDouble();
        c.add(0, 1);
        c.add(1, 2);
        c.add(2, 3);
        c.add(3, 4);
        c.add(4, 5);
        c.remove(1);
        
        System.out.println(c.toString());
        
        ChainCircular cc = new ChainCircular();
        
        cc.add(0, "a");
        cc.add(1, "b");
        cc.add(2, "c");
        cc.add(3, "d");
        cc.add(4, "e");
        cc.remove(1);
        
        System.out.println(c.toString());
    }
    
}
