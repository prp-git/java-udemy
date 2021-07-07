package entities;

import java.util.Objects;

public class Student {
	
	private int number;
	private String course;
	public Student(int number, String course) {
		this.number = number;
		this.course = course;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", course=" + course + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return number == other.number;
	}
	
	
	
	
	

}
