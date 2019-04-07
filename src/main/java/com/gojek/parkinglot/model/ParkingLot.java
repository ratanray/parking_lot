package com.gojek.parkinglot.model;

public class ParkingLot {

	private ParkingSlot[] slots;
	private int size;

	public ParkingLot(int size) {
		super();
		this.size=size;
		this.slots = new ParkingSlot[size];
	}
		
	public void makeSlotEmpty(int slotNum) {
		slots[slotNum].removeVehicle();
	}
	
	public void getCurrentStatus() {
		System.out.println("Slot No. Registration No Colour");
		for(int i=0;i<size;i++) {
			if(slots[i].isAvailable())
			System.out.println(slots[i].getSlotNum() +" "+ slots[i].getVehicle());
		}
	}
	
	public void getRegistrationNumOfAllVehicleWithColor(String color){
		for(int i=0;i<size;i++) {
			if(slots[i].getVehicle().isSameColor(color)) {
				System.out.println(slots[i].getVehicle().getLicensePlate());
			}
		}
	}
	
	public void getSlotNumOfAllVehicleWithColor(String color){
		for(int i=0;i<size;i++) {
			if(slots[i].getVehicle().isSameColor(color)) {
				System.out.println(slots[i].getSlotNum());
			}
		}
	}
	
    public boolean parkVehicle(Vehicle vehicle){
        for (int i = 0; i < this.size; i++){
            if (slots[i].isAvailable()) {
            	slots[i].park(vehicle);
                return true;
            }
        }
        System.out.println("Sorry, parking lot is full");
        return false;
    }
    
    public boolean getSlotNumOfLicencePlate(String licensePlate) {
    	 for (int i = 0; i < this.size; i++){
             if (slots[i].getVehicle().haveLicencePlate(licensePlate)) {
              System.out.println(slots[i].getSlotNum());
                 return true;
             }
         }
         System.out.println("Not found");
         return false;
    }
}
