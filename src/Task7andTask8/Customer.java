package Task7andTask8;
class Customer {
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
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public String getCustomerId() {
    	return customerId; }
    public void setCustomerId(String customerId) { 
    	this.customerId = customerId; }

    public String getFirstName() {
    	return firstName; }
    public void setFirstName(String firstName) {
    	this.firstName = firstName; }

    public String getLastName() {
    	return lastName; }
    public void setLastName(String lastName) { 
    	this.lastName = lastName; }

    public String getEmail() { 
    	return email; }
    public void setEmail(String email) {
    	this.email = email; }

    public String getPhone() { 
    	return phone; }
    public void setPhone(String phone) {
    	this.phone = phone; }

    public String getAddress() { 
    	return address; }
    public void setAddress(String address) {
    	this.address = address; }
    
    
    public String toString() {
        return "Customer ID: " + customerId + "\n" +
               "Name: " + firstName + " " + lastName + "\n" +
               "Email: " + email + "\n" +
               "Phone: " + phone + "\n" +
               "Address: " + address;
    }
}
