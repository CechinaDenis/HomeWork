package cars.models;

public class Car{
	int numberOfWheels;
	int numberOfDoors;
	String name;
	String subModel;
	boolean isStarted=true;;

	void startEngine(){
		isStarted=true;
	}
	void run(){
		consumeFuel();
	}

	void consumeFuel(){

	}
}