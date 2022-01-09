public class HospitalTrial {
    public static void main(String[] args) {
        String patientList[] = {"shanur", "Imtesaal"};
		String searchValue = "munna";
		Solution1(patientList, searchValue);
    }

    public static void Solution1(String patientList[], String searchValue) {
        boolean found = false;
        for(int i = 0;i<patientList.length; i++){
            if(searchValue==patientList[i]){
                found = true;
                break;
            }
        }

        if(found==true){
            System.out.println("old patient");
        } else{
            System.out.println("new patient");
        }
    }
}
