package com.gojek.parkinglot.model;

public class ParkingSlot {

	private Vehicle vehicle;
	private int slotNum;

	public ParkingSlot(Vehicle vehicle, int slotNum) {
		super();
		this.vehicle = vehicle;
		this.slotNum = slotNum;
	}
	public int getSlotNum() {
		return slotNum;
	}
	public void setSlotNum(int slotNum) {
		this.slotNum = slotNum;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
    public boolean isAvailable() {
        return vehicle == null;
    }
    
    public boolean park(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Allocated slot number: "+this.slotNum);
        return true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        System.out.println("Slot number "+this.slotNum+" is free");
    }
}
