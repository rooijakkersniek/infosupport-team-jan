package nl.han.devops.domain;

import nl.han.devops.Entity;

public class VehicleEntity extends Entity implements IVehicleAggregate {

    public VehicleEntity(String kenteken, String merk, String model, short bouwJaar) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.model = model;
        this.bouwJaar = bouwJaar;
    }

    private String kenteken;
    private String merk;
    private String model;
    private short bouwJaar;
}
