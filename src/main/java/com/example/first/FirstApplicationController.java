package com.example.first;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FirstApplicationController {

    private List<Customer> getListOfCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ali", "Yilmaz", "+905457658123"));
        customers.add(new Customer("Oya", "Keser", "+905073254876"));
        customers.add(new Customer("Ayse", "Turk", "+905329827854"));
        customers.add(new Customer("Mehmet", "Gok", "+905317436501"));
        customers.add(new Customer("Deniz", "Gorkem", "+905314345014"));
        return customers;
    }
    @RequestMapping(value = "/getCustomers", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public CustomerListContainer  getCustomers() {
        List<Customer> customers = getListOfCustomers();
        CustomerListContainer  customerList = new CustomerListContainer();
        customerList.setCustomerList(customers);
        return customerList;
    }

}
