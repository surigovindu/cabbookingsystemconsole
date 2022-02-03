package com.project0.Model;
import java.util.Objects;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Cab {
	private final Integer cabNo;
//	private LocalTime sTiming;
//	private LocalTime eTiming;
	private Integer freeOrBooked;//0 means available, 1 means Booked
	
	public Cab(Integer cnum) {
		this.cabNo = cnum;
		this.freeOrBooked = 0;
		
	}
	public Cab(Integer cnum,Integer fOB) {
		this.cabNo = cnum;
		this.freeOrBooked = fOB;
		
	}
	
	public Integer getFreeOrBooked() {
		return freeOrBooked;
	}

	public void setFreeOrBooked(Integer freeOrBooked) {
		this.freeOrBooked = freeOrBooked;
	}


	public Integer getCabNo() {
		return cabNo;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(cabNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cab other = (Cab) obj;
		return Objects.equals(cabNo, other.cabNo);
	}
	
	

		

}

