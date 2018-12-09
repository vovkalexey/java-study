package ua.dp.vovkalexey.memory.mangement.finalkeyword;

import ua.dp.vovkalexey.memory.mangement.utill.Customer;

public class Simple {

    public static  void main(String[] args) {
        //(1)  add EMPTY args to Stack

        final Customer c1 = new Customer("John");
        //(2)  create [String "John"] object in Heap
        //(3)  create [Customer] object in Heap and set field 'name' reference to [String "John"] object
        //(4)  add to Stack final 'c1' with reference to the [Customer] object
        System.out.println(c1);

        final Customer c2;
        c2= new Customer("John");
        //(3)  create [Customer] object in Heap and set field 'name' reference to [String "John"] object
        //(4)  add to Stack final 'c2' with reference to the [Customer] object
        //  c2= new Customer("Susan");
        //  NOT POSSIBLE when c2 is final
        System.out.println(c2);

        Customer c3;
        c3= new Customer("John");
        //(3)  create [Customer] object in Heap and set field 'name' reference to [String "John"] object
        //(4)  add to Stack 'c3' with reference to the [Customer] object
        c3= new Customer("Susan");
        //(2)  create [String "Susan"] object in Heap
        //(3)  create [Customer2] object in Heap and set field 'name' reference to [String "Susan"] object
        //(4)  reset in Stack 'c3' with reference to the [Customer2] object
        System.out.println(c3);
    }
    // remove variables from Stack
}
