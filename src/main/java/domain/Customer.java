package domain;

public class Customer {

    private String firstName;
    private String lastName;
    private Integer customerId;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Customer(String customerName, Integer customerId) {
        this.firstName = customerName;
        this.customerId = customerId;
    }
}
