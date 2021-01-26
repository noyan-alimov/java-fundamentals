package exceptionExample;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {
        if (phoneType == null || phoneNumber == null) {
            throw new IllegalArgumentException("The type and number can't be null");
        }

        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone type: " + this.phoneType + ", " + "Phone number: " + this.phoneNumber;
    }
}
