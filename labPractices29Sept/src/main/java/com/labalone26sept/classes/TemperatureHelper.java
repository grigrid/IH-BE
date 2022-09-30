package com.labalone26sept.classes;

import java.util.Scanner;

public class TemperatureHelper {
    /*Using TDD create a TemperatureHelper class that allow you to convert temperatures from Fahrenheit,
    Celsius or Kelvin
    (FahrenheitToCelsius, FahrenheitToKelvin, CelsiusToFahrenheit, CelsiusToKelvin, KelvinToFahrenheit, KelvinToCelsius). Write all tests.*/

    private double fahrenheit;
    private double celcius;
    private double kelvin;


    public TemperatureHelper(double fahrenheit, double celcius, double kelvin) {
        setFahrenheit(fahrenheit);
        setCelcius(celcius);
        setKelvin(kelvin);
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;

    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
    /*----------------------------------------*/
    public static double  fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit -32) * 32 / 9;
    }
    public  double  fahrenheitToCelsiusI(double fahrenheit){
        return celcius = (fahrenheit -32) * 32 / 9;
    }
    /*----------------------------------------*/
    public  double fahrenheitToKelvin(double fahrenheit){
        return kelvin = (fahrenheit -32) * 5 / 9 + 273.15;
    }
    /*----------------------------------------*/
    public double celsiusToFahrenheit(double celcius) {
        return fahrenheit = (celcius * 9 / 5) + 32 ;
    }
    /*----------------------------------------*/
    public double celsiusToKelvin(double celcius) {
        return kelvin = celcius + 273.15;
    }
    /*----------------------------------------*/
    public double kelvinToFahrenheit(double kelvin) {
        return fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
    }

    public double kelvinToCelsius(double kelvin) {
        return  celcius = kelvin - 273.15;
    }












}
