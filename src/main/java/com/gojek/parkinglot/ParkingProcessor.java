package com.gojek.parkinglot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.gojek.parkinglot.model.Car;
import com.gojek.parkinglot.model.ParkingLot;
import com.gojek.parkinglot.model.Vehicle;

public class ParkingProcessor {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] str = bufferedReader.readLine().split(" ");
        
        ParkingLot parkingLot = new ParkingLot(Integer.parseInt(str[1]));
        
        while(!str[0].equalsIgnoreCase("exit")) {
        	str = bufferedReader.readLine().split(" ");
        	
        	if(str[0].equalsIgnoreCase("park")) {
        		Vehicle vehicle = new Car(str[1], str[2]);
        		parkingLot.parkVehicle(vehicle);
        	}
        	else if(str[0].equalsIgnoreCase("leave")) {
        		parkingLot.makeSlotEmpty(Integer.parseInt(str[1]));
        	}
        	else if(str[0].equalsIgnoreCase("registration_numbers_for_cars_with_colour")) {
        		parkingLot.getRegistrationNumOfAllVehicleWithColor(str[1]);
        	}
        	else if(str[0].equalsIgnoreCase("slot_numbers_for_cars_with_colour")) {
        		parkingLot.getSlotNumOfAllVehicleWithColor(str[1]);
        	}
        	else if(str[0].equalsIgnoreCase("slot_number_for_registration_number")) {
        		parkingLot.getSlotNumOfLicencePlate(str[1]);
        	}
        }
	}

}
