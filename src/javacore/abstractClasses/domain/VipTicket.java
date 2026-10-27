package javacore.abstractClasses.domain;

public class VipTicket extends Ticket {
    private String loungeName;

    public VipTicket(double basePrice, String eventName, String loungeName) {
        super(basePrice, eventName);
        setLoungeName(loungeName);
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + 40;
    }

    public String getLoungeName() {
        return loungeName;
    }

    public void setLoungeName(String loungeName) {
        this.loungeName = loungeName;
    }
}
