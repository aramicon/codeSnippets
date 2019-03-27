
public class Car extends Vehicle{
	private int wheels;
	private int doors;

	
	public Car(int w, int d){
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
