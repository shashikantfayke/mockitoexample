package domain;

public class Customer {

    private String firstName;
    private String lastName;
    private Integer customerId;

    public Customer(){};

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

    public Customer(String firstName, String lastName, Integer customerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
    }
}
