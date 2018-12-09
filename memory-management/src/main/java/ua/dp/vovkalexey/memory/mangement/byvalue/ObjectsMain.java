package ua.dp.vovkalexey.memory.mangement.byvalue;

public class ObjectsMain {

    public static void main(String[] args) {
        //(1)  add EMPTY args to Stack

        Customer c = new Customer("Sally");
        //(2)  create [String "Sally"] object in Heap
        //(3)  create [Customer] object in Heap and set field 'name' reference to [String "Sally"] object
        //(4)  add to Stack 'c' with reference to the [Customer] object

        renameCustomer(c);
        System.out.println(c.getName());
    }
    //(9)  clear 'c' from Stack
    //(10)  clear 'args' from Stack

    private static void renameCustomer(Customer cust) {
        //(5)  add to Stack 'cust' COPY reference to the [Customer] object

        cust.setName("Diane");
        //(6)  create [String "Diane"] object in Heap
        //(7)  reset [Customer] object field 'name' reference to [String "Sally"] object in Heap
    }
    //(8)  clear 'cust' from Stack

    private static class Customer {
        private String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
