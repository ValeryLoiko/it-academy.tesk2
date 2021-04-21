package by.training.homeWork.task2.customer.start;

import by.training.homeWork.task2.customer.entity.Bank;
import by.training.homeWork.task2.customer.entity.Customer;
import by.training.homeWork.task2.customer.logic.Logic;
import by.training.homeWork.task2.customer.view.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Logic logic = new Logic();
        List<Customer> customerList = new ArrayList<>();
        bank.setCustomerList(customerList);

        Customer client1 = logic.createCustomer(123, "Boris Borisovich Borisov",
                "Mosty ul. Mira6",1111,123123);
        Customer client2 = logic.createCustomer(234,"Petr Petrovich Petrov",
                "Mosty, ul. Mostovaja 2", 2222,234234);
          Customer client3 = logic.createCustomer(345,"Ivan Ivanovich Ivanov",
                  "Mosty ul Mira 12",3333,345345);
          Customer client4 = logic.createCustomer(456, "Artiom Artiomovich Artiokov",
                  "Grodno ul. Voli 11", 4444, 456456 );

          bank.addCustomer(client1);
          bank.addCustomer(client2);
          bank.addCustomer(client3);
          bank.addCustomer(client4);

        View view = new View();
        view.printBank(bank);
        System.out.println("////////////");


        logic.sortFullName(bank);
        view.printBank(bank);
        System.out.println("/////////////");


        List<Customer> fromToCustomer = logic.fromToNumberCreditCart(bank,1121, 3444);
        view.printCustomer((ArrayList<Customer>) fromToCustomer);


    }
}
