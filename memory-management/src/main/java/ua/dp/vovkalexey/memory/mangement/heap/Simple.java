package ua.dp.vovkalexey.memory.mangement.heap;

public class Simple {

    public static  void main(String[] args) {
        //(1)  add EMPTY args to Stack

        int value = 21;
        //(2)  add value = 21 to Stack

        String name = "Hello";
        //(3)  create [String "Hello"] object in Heap
        //(4)  add to Stack name with reference to the [String "Hello"] object
    }
    //(5)  clear 'name' from Stack
    //(6)  clear 'value' from Stack
    //(7)  clear 'args' from Stack
}
