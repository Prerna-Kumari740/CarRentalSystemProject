package com.jts.crs;

public class CRSEntry {
	public static void main(String[] args) {
		Car toyota = new Car();
		toyota.setCarId("CAR-1");
		toyota.setBrand("Toyota");
		toyota.setModel("Fortuner");
		toyota.setNoOfAvailableCar(1);
		toyota.setPricePerDay(3000);
		
		Car TataCar = new Car();
		TataCar.setCarId("CAR-2");
		TataCar.setBrand("Tata");
		TataCar.setModel("Harier");
		TataCar.setNoOfAvailableCar(2);
		TataCar.setPricePerDay(2500);
		

		Car MahindraCar = new Car();
		MahindraCar.setCarId("CAR-3");
		MahindraCar.setBrand("Mahindra");
		MahindraCar.setModel("XUV 700");
		MahindraCar.setNoOfAvailableCar(2);
		MahindraCar.setPricePerDay(3500);
		
		CarRentalService carRentalService = new CarRentalService();
		carRentalService.addCars(toyota);
		carRentalService.addCars(TataCar);
		carRentalService.addCars(MahindraCar);
		
	}
}
 