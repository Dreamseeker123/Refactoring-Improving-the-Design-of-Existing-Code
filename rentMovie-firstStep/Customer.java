import java.util.Enumeration;
import java.util.Vector;

public class Customer_reconstructed3 {
	private String _name;
	private Vector<Rental> rentalList = new Vector<>();
	
	public Customer_reconstructed3(String _name) {
		this._name = _name;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}
	
	public void addRental(Rental r) {
		rentalList.add(r);
	}
	
	
	public String statement() {
		Enumeration<Rental> _rentals = rentalList.elements();
		String result = "Rental Records for " + get_name() + "\n";
	     
		while (_rentals.hasMoreElements()) {
			
			Rental rental = (Rental) _rentals.nextElement();
			
			result += "\t" + rental.get_mMovie().get_title() + "\t" + String.valueOf(computeAmout(rental)) + "\n";
		}
		
		//add footer lines
		result += "Amout owed is" + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRentalPoins()) + "frequent rental points";
		
		return result;
	}

	private double getTotalFrequentRentalPoins() {
		double result = 0;
		Enumeration<Rental> rentals = rentalList.elements();
		while (rentals.hasMoreElements()) {
			Rental rental = (Rental) rentals.nextElement();
			result += rental.getFrequentRentalPoints();
		}
		return result;
	}

	private double computeAmout(Rental rental) {
		return rental.computeAmout();
	}
	
	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rentals = rentalList.elements();
		while (rentals.hasMoreElements()) {
			Rental rental = (Rental) rentals.nextElement();
			result += rental.computeAmout();
		}
		
		return result;
	}
}
