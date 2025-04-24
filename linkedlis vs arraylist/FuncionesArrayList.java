import java.util.ArrayList;

public class FuncionesArrayList {
    public static void main(String[] args) {
        
         ArrayList<String> arrayList = new ArrayList<>();
         arrayList.add("A");
         arrayList.add(0, "B");
         System.out.println(arrayList.get(0));
         System.out.println(arrayList);

         System.out.println("/////////////////////////////////////");

         arrayList.set(1, "B");
         System.out.println(arrayList);

         System.out.println("/////////////////////////////////////");

         arrayList.remove(0);
         System.out.println(arrayList);

         System.out.println("/////////////////////////////////////");

         arrayList.add(0,"A");
        arrayList.add(2, "A");
        System.out.println(arrayList);
        arrayList.remove("A");
        System.out.println(arrayList);

        System.out.println("/////////////////////////////////////");

        System.out.println(arrayList.indexOf("A"));
        System.out.println(arrayList.contains("B"));




    }
    
}
