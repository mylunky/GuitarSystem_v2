package com.guitar.domain;

import java.util.ArrayList;
import java.util.List;

import com.guitar.service.GuitarServiceDB;
public class Inventory {
	private List<Guitar> guitars;
	GuitarServiceDB service = new GuitarServiceDB();

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}
	public int addGuitar(String serialNumber,double price,GuitarSpec guitarSpec) {	
		int i = service.addGuitar(serialNumber, price,guitarSpec);
		return i;
	}
	public List<Guitar> searchGuitar(String serialNumber) {
		guitars = service.searchGuitar(serialNumber);
		return guitars;
	}
	public int delGuitar(String serialNumber) {
		int i = service.delGuitar(serialNumber);
		return i;
	}

}
