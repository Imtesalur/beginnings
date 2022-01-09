import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Hospital
{
	public static void main(String[] args) {
		String patientList[] = {"shanur", "Imtesaal"};
		String searchValue = "munna";
		// Solution1(patientList, searchValue);
		advancedRegistry(patientList);
	}
	
	public static void Solution1(String patientList[], String searchValue) {
	    boolean found = false;
		for(int line_number=0; line_number<patientList.length; line_number++) {
		    if(patientList[line_number] == searchValue) {
		       found = true;
		       break;
		    }
		}
		
		if(found) {
            System.out.println("old patient");
		} else {
		    System.out.println("new patient");
		}
	}
	
	public static void Solution2(String patientList[], String searchValue) {
	    int lastline_number = patientList.length;
	    int line_number = 0;
	    
	    boolean found = false;
	    while(line_number < lastline_number) {
	        if(patientList[line_number] == searchValue) {
	            found = true;
	            break;
	        }
	        line_number ++;
	    }
	    
	    if(found) {
	        System.out.println("Old patient");
	    }else {
	        System.out.println("New user");
	    }
	}



	public static void advancedRegistry(String patientList[]) {
		Scanner x = new Scanner(System.in);
		HashSet<String> registry = new HashSet<>(Arrays.asList(patientList));
		while(true) {
			System.out.println("Enter name of patient");
			String patient = x.next();

			if(registry.contains(patient)) {
				System.out.println("old patient");
			} else {
				registry.add(patient);
				System.out.println("New patient");
			}
		}
	}
}
