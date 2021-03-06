package com.ol.books;

public class Publisher extends Person implements PrettyPrinter {
    private String orgName;

    public Publisher(String name, Address address) {
        super(name, address);
    }

    public Publisher(String name, Address address, String orgName) {
        super(name, address);
        this.orgName = orgName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    @Override
    public void prettyPrint() {
        System.out.printf("Publisher [name=%s, address=%s, orgName=%s]%n", super.getName(), super.getAddress(), orgName);
    }

    @Override
    public String toString() {
        return super.toString() +
                "orgName='" + orgName + '\'' +
                '}';
    }
}
