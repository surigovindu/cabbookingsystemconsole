package com.project0.service;

import com.project0.Model.Cab;

public interface BookingSystem{
	
	void addCab(Cab newCab) throws Exception;
	Integer requestCab() throws Exception;
	Integer getNoOfAvailableCabs() throws Exception;
	}
