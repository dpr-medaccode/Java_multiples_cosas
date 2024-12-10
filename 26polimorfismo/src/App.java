public class App {
    public static void main(String[] args) throws Exception {
       
            SubclassOverload obj = new SubclassOverload();

            obj.demo(10);
            obj.demo(10, 20);
            obj.demo(5.5);

            Overload obj2 = new Overload();

            obj2.demo(10);
            obj2.demo(10, 10);
            // obj2.demo(5.5);

    }
}
