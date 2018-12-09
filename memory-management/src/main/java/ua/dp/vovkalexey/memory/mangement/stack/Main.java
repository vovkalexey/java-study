package ua.dp.vovkalexey.memory.mangement.stack;

public class Main {

    public static  void main(String[] args) {
        //(1)  add EMPTY 'args' to Stack

        int value = 7;
        //(2)  add 'value' = 7 to Stack

        value = calculate(value);
        //(9)  change 'value' = 20 in Stack
    }
    //(10)  clear 'value' from Stack
    //(11)  clear 'args' from Stack


    private static int calculate(int data) {
        //(3)  add data = 7 to Stack

        int tempValue = data + 3;
        //(4)  add tempValue = 10 to Stack

        int newValue = tempValue * 2;
        //(5)  add newValue = 20 to Stack

        return newValue;
    }
    //(7)  clear 'newValue' from Stack
    //(8)  clear 'tempValue' from Stack
    //(9)  clear 'data' from Stack
}
