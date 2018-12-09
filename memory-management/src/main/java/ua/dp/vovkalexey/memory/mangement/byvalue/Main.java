package ua.dp.vovkalexey.memory.mangement.byvalue;

public class Main {

    public static void main(String[] args) {
        //(1)  add EMPTY args to Stack

        int localValue = 5;
        //(2)  add 'localValue' = 5 to Stack

        calculate(localValue);

        System.out.println("localValue: " + localValue);
    }
    //(6)  clear 'localValue' from Stack
    //(7)  clear 'args' from Stack

    //    private static void calculate(byref int calcValue) {
    //    NOT POSIBLE!
    private static void calculate(int calcValue) {
        //(3)  add 'calcValue' = 5 to Stack (COPY of 'localValue')

        calcValue = calcValue * 100;
        //(4)  change 'calcValue' = 500 in Stack

        System.out.println("calcValue: " + calcValue);
    }
    //(5)  clear 'calcValue' from Stack
}
