public class Hospital
{
	public static void main(String[] args) {
		String patientList[] = {"shanur", "Imtesaal"};
		String searchValue = "munna";
		Solution2(patientList, searchValue);
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
}
