package bg.elsys.ip.rest;

import java.util.ArrayList;
import java.util.List;

public class Items {
	private static Items instance = new Items();
	private List<Laptop> items = new ArrayList<>();
	
	private Items() {
		items.add(new Laptop("Acer Aspire F5", "Intel Core i5", 2.50, "LCD LED", "1366x768", 8, "GeForce GTX 940M", 2));
		items.add(new Laptop("Lenovo", "Intel Core i5", 3.50, "LCD LED", "1366x768", 8, "GeForce GTX 940M", 2));
		items.add(new Laptop("Lanovo", "Intel Core i5", 4.20, "LCD LED", "1366x768", 8, "GeForce GTX 940M", 2));
		items.add(new Laptop("Nz", "Intel Core i5", 4.70, "LCD LED", "1366x768", 8, "GeForce GTX 940M", 2));
	}

	public static Items getInstance () {
		return instance;
	}

	public List<Laptop> getItems() {
		return items;
	}
	
	public void setItems(List<Laptop> items) {
		this.items = items;
	}
}
