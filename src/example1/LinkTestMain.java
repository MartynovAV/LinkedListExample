package example1;

public class LinkTestMain {
    public static void main(String[] args) {
        MyLinkedList myList=new MyLinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(10);

        System.out.println(myList);
        System.out.println(myList.get(3));
        myList.remove(2);
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
    }
}
