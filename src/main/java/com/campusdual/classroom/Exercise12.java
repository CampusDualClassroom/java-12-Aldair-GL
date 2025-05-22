package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
Car myCar=new Car("Citroën", "Xsara", "Diésel");

    myCar.start();
    myCar.isTachometerEqualToZero();
    myCar.isTachometerGreaterThanZero();
myCar.accelerate();
myCar.stop();
myCar.isReverse();
myCar.setReverse(myCar.isReverse());

myCar.start();
myCar.turnAngleOfWheels(20);
myCar.turnAngleOfWheels(200);
myCar.turnAngleOfWheels(-200);

myCar.accelerate();
myCar.showDetails();
myCar.showSteeringWheelDetail();







    }

}