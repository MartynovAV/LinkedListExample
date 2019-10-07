package mcaeList;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        MLinkedList list=new MLinkedList();
        list.addTo(1);
        list.addTo(2);
        list.addTo(8);
        list.addTo(11);

        MLinkedList list2=new MLinkedList();
        list2.addTo(1);
        list2.addTo(2);
        list2.addTo(8);
        //list2.addTo(11);

        System.out.println(list);
        list.insertNodeAtPosition(45,1);
        System.out.println(list);








    }
}
