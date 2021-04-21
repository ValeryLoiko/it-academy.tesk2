package by.training.homeWork.task2.customer.view;

import by.training.homeWork.task2.customer.entity.Bank;
import by.training.homeWork.task2.customer.entity.Customer;

import java.util.ArrayList;

public class View {

    public void printBank(Bank bank){
        for (Customer tmp : bank.getCustomerList()){
            System.out.println(tmp);
        }
    }

    public void printCustomer(ArrayList<Customer> print){
        for (Customer tmp : print){
            System.out.println(tmp.toString());
        }
    }
}
