package test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    boolean isSunday=true;
    boolean isMonday=true;
    boolean isTuesday=true;

    public void addingToTheList( List <String> list) {
        if(isSunday) {
            list.add("Pray today");
           // return;
        }
        if(isMonday) {
            list.add("Work today");
           //return;
        }
        if(isTuesday) {
            list.add("Tr today");
            //return;
        }
    }

    public static void main(String[] args) {
           List <String> list =  new ArrayList<>();
            Test1 test1=new Test1();
            test1.addingToTheList(list);
            System.out.println(list);
    }
}
