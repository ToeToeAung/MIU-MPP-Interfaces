package Interfaces.enums2.java8;

import java.time.LocalDate;

public interface DisplayItem {
	abstract public String getOwner();
	abstract public LocalDate getDateToReturnToOwner();	 
	public default String displayInfo() {
		return getOwner() + ": " + this.getClass().getSimpleName() 
			+ ": " + getDateToReturnToOwner();
	}
	
	
}