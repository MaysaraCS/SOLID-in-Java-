package com.company.openclose;

// base class
// closed for modification
public abstract class Subscriber {

    protected Long subscriberId;

    protected String address;

    protected Long phoneNumber;

    protected int baseRate;

    public Long getSubscriberId() {
        return subscriberId;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    // extension
    public abstract double calculateBill();
}
