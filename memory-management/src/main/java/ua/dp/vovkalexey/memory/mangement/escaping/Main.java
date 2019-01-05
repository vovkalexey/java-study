package ua.dp.vovkalexey.memory.mangement.escaping;

import ua.dp.vovkalexey.memory.mangement.utill.Customer;
import ua.dp.vovkalexey.memory.mangement.utill.CustomerReadOnly;

public class Main {

    public static void main(String[] args) {
        CustomRecords records = new CustomRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

/*        java.lang.UnsupportedOperationException */
//        records.getCustomers().clear();

//        for(Customer next : records.getCustomers().values()) {
        for(Customer next : records) {
            System.out.println(next);
        }

        CustomerReadOnly john = records.getCustomerByName("John");
        System.out.println(john.getName());
//        john.setName("Derek");
        System.out.println(john.getName());

        for(Customer next : records) {
            System.out.println(next);
        }

    }
}
