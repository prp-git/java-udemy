package entities3;

public class Aluno {
	public String Name;
	public double n1;
	public double n2;
	public double n3;

	public double finalGrade() {
		return n1 + n2 + n3;
	}

	public double Missing() {
		return 100 - finalGrade();
	}

	public String passed() {
		if (finalGrade() > 60) {
			return "PASS";
		}
		return "FAILED";
	}

	public String toString() {
		if ((n1 + n2 + n3) > 60) {
			return "FINAL GRADE = "
		+ finalGrade()
		+ String.format("%n%s", passed());
		}
		else {
			return "FINAL GRADE = "
					+ finalGrade()
					+ String.format("%n%s", passed())
					+ String.format("%n%s", "MISSING ")
					+ String.format("%.2f", ((60 - finalGrade())))
					+ " POINTS";
		}
	}
}
