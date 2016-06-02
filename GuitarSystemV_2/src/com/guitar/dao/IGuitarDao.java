package com.guitar.dao;

import java.util.List;

import com.guitar.domain.Guitar;
import com.guitar.domain.GuitarSpec;

public interface IGuitarDao {
	public int addGuitar(String serialNumber, double price,
            GuitarSpec spec);
	public List<Guitar> searchGuitar(String serialNumber);
	public int delGuitar(String serialNumber);
}
