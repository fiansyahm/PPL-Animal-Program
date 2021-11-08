public class PizzaBusiness {
    public static void main(String[] args) {
        Pizza custom = new Pizza();
        custom = new WithGarlic(custom);
        custom = new WithOnions(custom);
        custom = new WithPepperonis(custom);
        // We could add 10 times onions for onion lovers 
        // .... 
        System.out.println("Pizza ini harganya "+custom);
    }
}
