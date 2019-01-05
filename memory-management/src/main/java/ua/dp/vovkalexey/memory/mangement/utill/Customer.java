package ua.dp.vovkalexey.memory.mangement.utill;

public class Customer implements CustomerReadOnly {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(Customer oldCustomer) {
        this.name = oldCustomer.name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
