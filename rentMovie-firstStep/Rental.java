public class Rental {
	
	private Movie _mMovie;
	private int _daysRented;
	public Rental(Movie _mMovie, int _daysRented) {
		super();
		this._mMovie = _mMovie;
		this._daysRented = _daysRented;
	}
	public Movie get_mMovie() {
		return _mMovie;
	}
	
	public int get_daysRented() {
		return _daysRented;
	}

    double updateGetCharge() {
		return _mMovie.computeAmout(_daysRented);
	}
	int getFrequentRentalPoints_recontruct3() {
		return _mMovie.getFrequentRentalPoints(_daysRented);
	}
}
