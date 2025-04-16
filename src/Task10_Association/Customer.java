package Task10_Association;
import java.util.regex.*;

public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;

    public Customer() {}

    public Customer(String customerId, String firstName, String lastName, String email, String phone, String address) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        setEmail(email);   // Email validation
        setPhone(phone);   // Phone validation
        this.address = address;
    }

    public String getCustomerId() { return customerId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }

    public void setEmail(String email) {
        if (email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$")) this.email = email;
        else throw new IllegalArgumentException("Invalid email address.");
    }

    public void setPhone(String phone) {
        if (phone.matches("\\d{10}")) this.phone = phone;
        else throw new IllegalArgumentException("Phone number must be 10 digits.");
    }

    public String toString() {
        return "Customer ID: " + customerId + "\nName: " + firstName + " " + lastName +
               "\nEmail: " + email + "\nPhone: " + phone + "\nAddress: " + address;
    }
}
