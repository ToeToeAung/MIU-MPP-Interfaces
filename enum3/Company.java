package Interfaces.enum3;

public enum Company {
    COMPANY("Microsoft");
    String companyName;
    Company(String companyName) {
        this.companyName = companyName;
    }
    public String Company() {
        return this.companyName;
    }

}
