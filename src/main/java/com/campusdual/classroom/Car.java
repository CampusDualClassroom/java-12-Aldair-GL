package com.campusdual.classroom;

public class Car {
public String brand;
public String model;
public static final int MAX_SPEED= 120;
public String fuel;
public int speedometer=0;
public int tachometer=0;
public String gear = "N";
public boolean reverse=false;
public int wheelsAngle=0;

    public Car(){}

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
    }

public void start() {
        if (this.tachometer==0) {
            this.tachometer=1000;
            System.out.println("Vehículo encendido");
        } else {
            System.out.println("El vehículo ya está encendido");
        }
}

public void stop() {
        if (this.speedometer==0) {
            this.tachometer=0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("No se puede apagar, primero debe estar detenido.");
        }
}

public boolean isTachometerGreaterThanZero(){
    return this.tachometer > 0;
}

    public void accelerate(){
        if (this.speedometer<MAX_SPEED)
        {this.speedometer+=20;}
        else {
            System.out.println("Velocidad máxima alcanzada");
        }
    }

    public void brake(){
        if (this.speedometer>0)
        {this.speedometer-=20;}
        else {
            System.out.println("El coche ya ha frenado del todo");
        }
    }

    public void turnAngleOfWheels(int angle){
        if (angle < 45 && angle > -45)
        {wheelsAngle+=angle;
            System.out.println("El carro gira unos: "+angle);}
        else {
            System.out.println("No puedes girar más de 45 grados");
        }
    }

    public String showSteeringWheelDetail() {
        return ("El auto gira a unos: "+this.wheelsAngle+" grados el volante");
    }

    public boolean isReverse(){
        if (speedometer == 0) {
            reverse=true;
        } return reverse;
    }

    public void setReverse(boolean reverse){
if (reverse) {
    this.gear="N";
    } else {
    this.gear="R";
}
    }

    public void showDetails() {
        System.out.println("El auto de marca "+brand+" y modelo "+model+" va a una velocidad de : "+speedometer);
        System.out.println("usa "+fuel+" como combustible y gira a "+wheelsAngle+" grados aproximadamente");
    }

public boolean isTachometerEqualToZero(){
    return this.tachometer == 0;
    }















}
