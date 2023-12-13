package com.day4.composition.hosteller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Getter
@Setter

class Hosteller 
{
    public Hosteller(String hostelName, int roomNumber) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	private String hostelName;
    private int roomNumber;

}

