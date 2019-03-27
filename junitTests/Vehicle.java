
public class Vehicle {
	private int wheels;
	private int doors;

	public Vehicle(){
		this.wheels = 0;
		this.doors = 0;
	}
	public Vehicle(int w, int d){
		this.wheels = w;
		this.doors = d;
	}

	public void setWheels(int w){
		this.wheels = w;
	}
	public int getWheels(){
		return this.wheels;
	}
	public void setDoors(int d){
		this.doors = d;
	}
	public int getDoors(){
		return this.doors;
	}
}
