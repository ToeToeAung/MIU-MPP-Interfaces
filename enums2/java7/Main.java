package Interfaces.enums2.java7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		Admin admin = new Admin();
//		DisplayItem[] items = admin.getAllDisplayItems();
//		for(DisplayItem item : items) {
//			System.out.println(item.displayInfo());
//		}

		List<Displayable> displayItems=new ArrayList<>();
		displayItems.add(new DisplayItem("Joeseph", LocalDate.of(2024, 1, 1)));
		displayItems.add(DinosaurStatue.INSTANCE);

		for(Displayable displayItem : displayItems){
			System.out.println(displayItem.displayInfo());
		}
	}
}
