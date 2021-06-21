package entities;

public class Individual extends TaxPayer {
	
	private Double HealthExpenditures;
	
	public Individual () {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		HealthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return HealthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		HealthExpenditures = healthExpenditures;
	}

	@Override	
	public double taxesPaid() {
		if (getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - HealthExpenditures * 0.5;
		}
		else return getAnualIncome() * 0.25 - HealthExpenditures * 0.5;
	}

	@Override
	public String toString() {
		return getName()
				+ ": $ "
				+ String.format("%.2f", taxesPaid());
		}
	}
	
	
