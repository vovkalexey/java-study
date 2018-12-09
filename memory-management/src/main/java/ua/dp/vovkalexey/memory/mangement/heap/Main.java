package ua.dp.vovkalexey.memory.mangement.heap;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static  void main(String[] args) {
        //(1)  add EMPTY args to Stack

        List<String> myList = new ArrayList<String>();
        //(2)  create [List] in Heap
        //(3)  add to Stack 'myList' with reference to the [List] object

        myList.add("One");
        //(4)  create [String "One"] object in Heap
        //(5)  add reference(in [List]) to [String "One"] object with INDEX '0'

        myList.add("Two");
        //(6)  create [String "Two"] object in Heap
        //(7)  add reference(in [List]) to [String "Two"] object with INDEX '1'

        myList.add("Three");
        //(8)  create [String "Three"] object in Heap
        //(9)  add reference(in [List]) to [String "Three"] object with INDEX '2'

        printList(myList);
    }
    //(12)  clear 'myList' from Stack
    //(12)  clear 'args' from Stack

    private static void printList(List<String> data) {
        //(10)  add to Stack 'data' with COPY reference to the [List] object
        System.out.println(data);
    }
    //(11)  clear 'data' from Stack

}
