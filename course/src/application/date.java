package application;

import java.util.Date;

public class date {

	public static void main(String[] args) {
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 456L);
		
			
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x1.getDate());
		System.out.println(x1.getHours());
		System.out.println(x1.getMinutes());
		System.out.println(x1.getSeconds());
		System.out.println(x1.getMonth()+1);
		System.out.println(x1.getYear());
		///
		
		
	}

}
