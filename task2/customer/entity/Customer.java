package by.training.homeWork.task2.customer.entity;

import java.util.Objects;

public class Customer {
    private int id;
    private String fullName;
    private String address;
    private int numberCreditCart;
    private int numberAccount;

    public Customer(int id, String fullName, String address, int numberCreditCart, int numberAccount) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.numberCreditCart = numberCreditCart;
        this.numberAccount = numberAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberCreditCart() {
        return numberCreditCart;
    }

    public void setNumberCreditCart(int numberCreditCart) {
        this.numberCreditCart = numberCreditCart;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (getId() != customer.getId()) return false;
        if (getNumberCreditCart() != customer.getNumberCreditCart()) return false;
        if (getNumberAccount() != customer.getNumberAccount()) return false;
        if (getFullName() != null ? !getFullName().equals(customer.getFullName()) : customer.getFullName() != null)
            return false;
        return getAddress() != null ? getAddress().equals(customer.getAddress()) : customer.getAddress() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFullName() != null ? getFullName().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + getNumberCreditCart();
        result = 31 * result + getNumberAccount();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", numberCreditCart=" + numberCreditCart +
                ", numberAccount=" + numberAccount +
                '}';
    }
}
