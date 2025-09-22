package nl.han.devops.common;

import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CustomerEntity implements ICustomerAggregate {

    public CustomerEntity(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.vehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void registerVehicle(IVehicleAggregate vehicle) {
        vehicles.add(vehicle);
    }

    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private List<IVehicleAggregate> vehicles;
}
