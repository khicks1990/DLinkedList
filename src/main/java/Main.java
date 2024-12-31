
public class Main {
  public static void main(String [] args)
  {
      DLinkedList ll = new DLinkedList();
      ll.add("Amy");
      ll.add("Bob");
      ll.add(0, "Al");
      ll.add(2, "Beth");
      ll.add(4, "Carol");
      System.out.println("The elements of the list are:");
      System.out.println(ll);
  }
}