package application;

import java.util.Locale;

import entities.ConcretePrinter;
import entities.ConcreteScanner;
import entities.ComboDevice;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		ConcretePrinter p = new ConcretePrinter("1010");
		p.processDoc("My letter");
		p.print("My letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());

		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		s.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + s.scan());
	}
}