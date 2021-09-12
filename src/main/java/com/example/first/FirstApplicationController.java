package com.example.first;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@Controller
public class FirstApplicationController {

    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Order")  // 404
    public static class UnknownIdentifierException extends RuntimeException { }
    @GetMapping(value = "/getCustomers", produces = "application/json")
    @ResponseBody
    public Object  getCustomers() {
        if(!getListOfCustomers().isEmpty()) {
            return getListOfCustomers() ;
        }
        else
            throw new UnknownIdentifierException();
    }

    private ArrayList<Customer> getListOfCustomers() {

        ArrayList<Customer> customers = new ArrayList<>();
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        Customer c4 = new Customer();
        Customer c5 = new Customer();

        // Constructor ?//
        c1.setName("Ali");
        c1.setSurname("Yilmaz");
        c1.setPhonenumber("+905457658123");
        customers.add(c1);

        c2.setName("Oya");
        c2.setSurname("Keser");
        c2.setPhonenumber("+905073254876");
        customers.add(c2);

        c3.setName("Ayse");
        c3.setSurname("Turk");
        c3.setPhonenumber("+905329827854");
        customers.add(c3);

        c4.setName("Mehmet");
        c4.setSurname("Gok");
        c4.setPhonenumber("+905317436501");
        customers.add(c4);

        c5.setName("Deniz");
        c5.setSurname("Gorkem");
        c5.setPhonenumber("+905314345014");
        customers.add(c5);

        return customers;
    }

}
