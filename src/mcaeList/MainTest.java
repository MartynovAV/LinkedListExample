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
        System.out.println(list);

        list.insertHead(20);
        System.out.println(list);

        list.reverseListReccursion();
        System.out.println(list);

    }
}
