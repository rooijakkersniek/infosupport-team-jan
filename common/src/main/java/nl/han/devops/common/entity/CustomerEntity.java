package nl.han.devops.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import nl.han.devops.common.aggregate.ICustomerAggregate;
import nl.han.devops.common.aggregate.IVehicleAggregate;

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
    @Id private String email;
    private List<IVehicleAggregate> vehicles;
}
