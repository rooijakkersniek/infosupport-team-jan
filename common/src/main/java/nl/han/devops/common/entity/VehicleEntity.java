package nl.han.devops.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import nl.han.devops.common.aggregate.IVehicleAggregate;

@Entity
public class VehicleEntity implements IVehicleAggregate {

    public VehicleEntity(String kenteken, String merk, String model) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.model = model;
    }

    @Id private String kenteken;
    private String merk;
    private String model;
}
