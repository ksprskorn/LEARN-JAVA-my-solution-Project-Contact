class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        this.firstName = firstName == null ? "" : firstName;
    }

    public void setLastName(String lastName) {
        // write your code here
        this.lastName = lastName == null ? "" : lastName;
    }

    public String getFullName() {
        // write your code here
        String result = (firstName + " " + lastName).trim();
        if (result.length() == 0) {
            return "Unknown";
        }
        return result;
    }
}