package com.example.martin.aplikasimodul2kel13.ui.addCar;


public interface AddView {

    String getName();

    String getMerk();

    String getModel();

    String getYear();

    void successAddCar();

    void failedAddCar();
}