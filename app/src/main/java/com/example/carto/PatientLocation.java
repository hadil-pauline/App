package com.example.carto;

public class PatientLocation {
    public String états;
    public double latitude;
    public double longitude;

    public PatientLocation(String états, double latitude, double longitude) {
        this.états = états;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    //Setters =====================

    public void setÉtats(String états) {
        this.états = états;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    //Getters =====================

    public String getÉtats() {
        return états;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }


    public PatientLocation() {
    }
}
