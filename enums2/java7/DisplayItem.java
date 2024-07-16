package Interfaces.enums2.java7;

import java.time.LocalDate;

public class DisplayItem implements Displayable{
	private String owner;
	private LocalDate dateToReturnToOwner;
	public DisplayItem(String owner, LocalDate date) {
		this.owner = owner;
		this.dateToReturnToOwner = date;
	}
	@Override
	public String displayInfo() {
		return owner + ": " + this.getClass().getSimpleName() 
				+ ": " + dateToReturnToOwner;
	}
	
}
