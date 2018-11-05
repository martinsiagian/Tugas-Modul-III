package com.example.martin.aplikasimodul2kel13.ui.home;

import com.example.martin.aplikasimodul2kel13.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}
