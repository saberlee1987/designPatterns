package com.saber.builder1;

import java.util.Objects;

public class Customer {
    private Long id;
    private String customerNo;
    private String fullName;
    private String birthDate;
    private String createdDate;
    private String updatedDate;
    private String deletedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(String deletedDate) {
        this.deletedDate = deletedDate;
    }

//    private Customer(CustomerBuilder builder) {
//        this.setId(builder.id);
//        this.setCustomerNo(builder.customerNo);
//        this.setFullName(builder.fullName);
//        this.setBirthDate(builder.birthDate);
//        this.setCreatedDate(builder.createdDate);
//        this.setDeletedDate(builder.deletedDate);
//        this.setUpdatedDate(builder.updatedDate);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id)
                && Objects.equals(customerNo, customer.customerNo)
                && Objects.equals(fullName, customer.fullName)
                && Objects.equals(birthDate, customer.birthDate)
                && Objects.equals(createdDate, customer.createdDate)
                && Objects.equals(updatedDate, customer.updatedDate)
                && Objects.equals(deletedDate, customer.deletedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerNo, fullName
                , birthDate, createdDate, updatedDate, deletedDate);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerNo='" + customerNo + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", updatedDate='" + updatedDate + '\'' +
                ", deletedDate='" + deletedDate + '\'' +
                '}';
    }

    public static CustomerBuilder builder(){
        return new CustomerBuilder();
    }
    public static class CustomerBuilder {
        private final Customer customer;
//        private Long id;
//        private String customerNo;
//        private String fullName;
//        private String birthDate;
//        private String createdDate;
//        private String updatedDate;
//        private String deletedDate;


        public CustomerBuilder() {
            customer = new Customer();
        }

        public CustomerBuilder setId(Long id) {
            customer.id = id;
            return this;
        }

        public CustomerBuilder setCustomerNo(String customerNo) {
            customer.customerNo = customerNo;
            return this;
        }

        public CustomerBuilder setFullName(String fullName) {
            customer.fullName = fullName;
            return this;
        }

        public CustomerBuilder setBirthDate(String birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public CustomerBuilder setCreatedDate(String createdDate) {
            customer.createdDate = createdDate;
            return this;
        }

        public CustomerBuilder setUpdatedDate(String updatedDate) {
            customer.updatedDate = updatedDate;
            return this;
        }

        public CustomerBuilder setDeletedDate(String deletedDate) {
            customer.deletedDate = deletedDate;
            return this;
        }
        public Customer build(){
            return customer;
        }
    }
}
