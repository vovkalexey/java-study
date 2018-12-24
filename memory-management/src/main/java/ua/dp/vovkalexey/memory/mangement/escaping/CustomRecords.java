package ua.dp.vovkalexey.memory.mangement.escaping;

import ua.dp.vovkalexey.memory.mangement.utill.Customer;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomRecords implements Iterable<Customer> {

    private Map<String, Customer> records;


    public CustomRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomers() {
//        return this.records;
//        return new HashMap<String, Customer>(this.records);
        return Collections.unmodifiableMap(this.records);
    }

    public Iterator<Customer> iterator() {
        return this.records.values().iterator();
    }
}
