
public class Movie2 {
	public static final int CHILDREN = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _title;
	
	private Price price;
	
	public Movie2(String title , int priceCode) {
		_title = title;
		set_priceCode(priceCode);
	}

	public String get_title() {
		return _title;
	}
	
	public int get_priceCode() {
		return price.getPriceCode();
	}

	public void set_priceCode(int _priceCode) {
		switch (_priceCode) {
		case REGULAR:
			price = new RegularPrice();
			break;
		case CHILDREN:
			price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("*Incorrect Price Code");
		}
	}
	//reconstruct4
	double computeAmout(int daysRented) {
		return price.getCharge(daysRented);
	}
	//reconstruct4
	int getFrequentRentalPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}
	
}
