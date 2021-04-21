package by.training.homeWork.task2.customer.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;

    private List<Customer> customerList;

    public Bank() {
        customerList = new ArrayList<>();
    }
    public Bank(List<Customer> customerList){
        this.customerList = customerList;
    }
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void setCustomerList(int a, Customer customer){
        customerList.set(a, customer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bank bank = (Bank) o;

        if (!getBankName().equals(bank.getBankName())) return false;
        return getCustomerList().equals(bank.getCustomerList());
    }

    @Override
    public int hashCode() {
        int result = getBankName().hashCode();
        result = 31 * result + getCustomerList().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", customerList=" + customerList +
                '}';
    }
}
