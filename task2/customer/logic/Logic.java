package by.training.homeWork.task2.customer.logic;

import by.training.homeWork.task2.customer.entity.Bank;
import by.training.homeWork.task2.customer.entity.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Logic {
    public Customer createCustomer(int id, String fullName, String address,
                                   int numberCreditCart, int numberAccount) {
        return new Customer(id, fullName, address, numberCreditCart, numberAccount);
    }

    public void sortFullName(Bank bank) {
        for (int i = bank.getCustomerList().size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (bank.getCustomerList().get(j).getFullName().compareTo(bank.getCustomerList()
                        .get(j + 1).getFullName()) > 0) ;
                {


                    swap(j, j + 1, bank);
                }
            }
        }
    }
    public  void swap(int a, int b, Bank bank){
        Customer tmp = bank.getCustomerList().get(a);
        bank.setCustomerList(a, bank.getCustomerList().get(b));
        bank.setCustomerList(a, tmp);
    }

    public List<Customer> fromToNumberCreditCart(Bank bank, int first, int second){
        List<Customer> customersNumberCart = new ArrayList<>();

        for (Customer tmp : bank.getCustomerList()){
            if (tmp.getNumberCreditCart() >= first && tmp.getNumberCreditCart() <= second) {
                customersNumberCart.add(tmp);
            }
        }
        return customersNumberCart;
    }


}
