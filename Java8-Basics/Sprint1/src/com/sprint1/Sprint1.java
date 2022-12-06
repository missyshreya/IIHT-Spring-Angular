package com.sprint1;

import java.util.ArrayList;
import java.util.Collections;


public class Sprint1 {

	public static void main(String[] args) {
		
		
		ArrayList<compExams> cExams= new ArrayList<compExams>();  //arraylist of the compettive xams 
		cExams.add(new compExams(1, "JEE", "Mrs Shah", 22, 40000));
		cExams.add(new compExams(2, "CAT", "Mr Rao", 12, 15000));
		cExams.add(new compExams(3, "MAT", "Mrs Gupta", 5, 22000));
		cExams.add(new compExams(4, "NEET", "Mr Das", 26, 60000));
		cExams.add(new compExams(5, "CMAT", "Ms Dutta", 10, 12000));
		cExams.add(new compExams(6, "GMAT", "Mrs Ahuja", 8, 8000));
		cExams.add(new compExams(7, "IBPS", "Mr Chakrabarty", 14, 14000));
		cExams.add(new compExams(8, "CTET", "Ms Fernandes", 19, 29000));
		cExams.add(new compExams(9, "NET", "Mr Sengupta", 14, 25000));
		cExams.add(new compExams(10, "RRB", "Mr Gupta", 6, 17000));
		cExams.add(new compExams(11, "ISSE", "Mr Patel", 24, 35000));
		cExams.add(new compExams(12, "CSE", "Ms Agarwal", 20, 30000));
		cExams.add(new compExams(13, "GATE", "Ms Roy", 27, 41000));
		cExams.add(new compExams(14, "XAT", "Mr Bandhopaddhya", 11, 19000));
		cExams.add(new compExams(15, "NABARD", "Mr Yusuf", 3, 5000));
		
		System.out.println("List of competetive exams we have:"); //before sorting
		System.out.println(cExams);
		
		//using Lmbda expression and compareto method
		Collections.sort(cExams, (cxam1,cxam2)-> cxam1.get_total_fees().compareTo(cxam2.get_total_fees()));
		System.out.println("Ascending order of the list of competetive exams based on price:");
		System.out.println(cExams);
		
		Collections.sort(cExams, (cxam1,cxam2)-> cxam2.get_total_fees().compareTo(cxam1.get_total_fees()));
		System.out.println("Descending order of the list of competetive exams based on price:");
		System.out.println(cExams);
		
		Collections.sort(cExams, (cxam1,cxam2)-> cxam1.get_course_duration().compareTo(cxam2.get_course_duration()));
		System.out.println("Ascending order of the list of competetive exams based on duration:");		
		System.out.println(cExams);
	}

	
}
