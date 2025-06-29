// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.LinkedList;

public class Algorithms_03_02 {
   public Algorithms_03_02() {
   }

   public static void main(String[] args) {
      LinkedList<String> listy = new LinkedList();
      listy.add("Sally");
      listy.add("Becky");
      listy.add("Nick");
      listy.add("Jack");
      listy.add("Rachel");
      System.out.println("Listy contains Becky: "+listy.contains("Becky"));
      System.out.println("Listy size: "+listy.size());
      listy.removeFirst();
      listy.forEach((x) -> {
         System.out.print(x + "->");
      });
      // one could print system messages for each add and any or all removes.
      
   }
}