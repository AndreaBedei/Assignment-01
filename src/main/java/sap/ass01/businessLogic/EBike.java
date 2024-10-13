package sap.ass01.businessLogic;

public class EBike  {	

	private String id;
	public enum EBikeState { AVAILABLE, IN_USE, MAINTENANCE, DISMISSED }	
	private EBikeState state;
	private P2d loc;
	private V2d direction; 
	private double speed;
	private int batteryLevel;  /* 0..100 */
	
	public EBike(String id) {
		this.id = id;
		this.state = EBikeState.AVAILABLE;
		this.loc = new P2d(0,0);
		direction = new V2d(1,0);
		speed = 0;
	}

	public EBike(String id, P2d pos) {
		this.id = id;
		this.state = EBikeState.AVAILABLE;
		this.loc = pos;
		direction = new V2d(1,0);
		speed = 0;
	}

	public EBike(String id, EBikeState eState, P2d loc, V2d direction, double speed, int batteryLevel) {
		this.id = id;
		this.state = eState;
		this.loc = loc;
		this.direction = direction;
		this.speed = speed;
		this.batteryLevel = batteryLevel;
	}
	
	public String getId() {
		return id;
	}

	public EBikeState getState() {
		return state;
	}
	
	public void rechargeBattery() {
		batteryLevel = 100;
		state = EBikeState.AVAILABLE;
	}
	
	public int getBatteryLevel() {
		return batteryLevel;
	}
	
	public void decreaseBatteryLevel(int delta) {
		batteryLevel -= delta;
		if (batteryLevel < 0) {
			batteryLevel = 0;
			state = EBikeState.MAINTENANCE;
		}
	}
	
	public boolean isAvailable() {
		return state.equals(EBikeState.AVAILABLE);
	}

	public void updateState(EBikeState state) {
		this.state = state;
	}
	
	public void updateLocation(P2d newLoc) {
		loc = newLoc;
	}

	public void updateSpeed(double speed) {
		this.speed = speed;
	}
	
	public void updateDirection(V2d dir) {
		this.direction = dir;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	public V2d getDirection() {
		return direction;
	}
	
	public P2d getLocation(){
		return loc;
	}

	public EBikeInfo getInfo(){
		return new EBikeInfo(this.id, this.state, this.loc, this.direction, this.speed, this.batteryLevel);
	}
	
	public String toString() {
		return "{ id: " + id + ", loc: " + loc + ", batteryLevel: " + batteryLevel + ", state: " + state + " }";
	}
}
