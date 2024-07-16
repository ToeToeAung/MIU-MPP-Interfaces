package Interfaces.enums2.java7;

import java.time.LocalDate;

/** How can we integrate this class with the other DisplayItems for processing?
    DinosaurStatue is one of a kind -- it should be implemented as a singleton 
 */
public enum DinosaurStatue implements Displayable {//extends DisplayItem {// -- compiler error
	INSTANCE;
	
	public static final String OWNER = "Tom Ripley";
	public static final LocalDate RETURN_DATE = LocalDate.of(2017, 11, 1);
	public static final String NAME = "Tyrannosaurus";
	
	@Override
	public String displayInfo(){
		return OWNER + ": " + NAME + ": " + RETURN_DATE;
	}
	
}
