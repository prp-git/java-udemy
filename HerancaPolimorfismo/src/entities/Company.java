package entities;

public class Company extends TaxPayer{

		public Integer employeeNumber;
		
		public Company() {
			super();
		}
		
		public Company(String name, Double anualIncome, Integer employeeNumber) {
			super(name, anualIncome);
			this.employeeNumber = employeeNumber;
		}

		public Integer getEmployeeNumber() {
			return employeeNumber;
		}

		public void setEmployeeNumber(Integer employeeNumber) {
			this.employeeNumber = employeeNumber;
		}

		@Override
		public double taxesPaid() {
			if (getEmployeeNumber()<10) {
				return getAnualIncome() * 0.16;
			}
			else return getAnualIncome() * 0.14;
		}

		@Override
		public String toString() {
			return getName()
					+ ": $ "
					+ String.format("%.2f", taxesPaid());
		}

		
		
}
