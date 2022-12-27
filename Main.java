public class Main {
    public static void main(String[] args) {
        
        DDL list = new DDL();
        
        list.addKey(8);
        list.addKey(12);
        list.addKey(99);
        list.addKey(16);

        list.printDDL();
        list.revert();
        System.out.println("------");
        list.printDDL();
    }

}
