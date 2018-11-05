package com.example.martin.aplikasimodul2kel13.ui.detailCar;

import java.util.List;

import com.example.martin.aplikasimodul2kel13.data.model.DataCar;

public interface DetailView {

    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}