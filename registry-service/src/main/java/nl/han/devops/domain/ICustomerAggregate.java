package nl.han.devops.domain;

public interface ICustomerAggregate {

    String getName();
    String getAddress();
    String getPhoneNumber();
    String getEmail();

    void registerVehicle(IVehicleAggregate vehicle);
}
