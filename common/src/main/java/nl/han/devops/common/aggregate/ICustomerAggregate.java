package nl.han.devops.common.aggregate;

public interface ICustomerAggregate {

    String getName();
    String getAddress();
    String getPhoneNumber();
    String getEmail();

    void registerVehicle(IVehicleAggregate vehicle);
}
