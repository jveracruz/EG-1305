
public class Fan {

	private int speed;
	private boolean fanStatus;
	private double radius;
	private String color = "blue";
	
	public Fan() {
		fanStatus = false;
		radius = 5;
		color = "blue";
		
	}

	public Fan(int speed, boolean fanStatus, double radius, String color) {
		super();
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fan [speed=" + speed + ", fanStatus=" + fanStatus + ", radius=" + radius + ", color=" + color + "]";
	}
	
	
	
}
