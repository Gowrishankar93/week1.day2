package week1.day2;

public class TwoWheeler {
	
	public int noOfwheels() {
		return 20;
	}
	
	short noOfMirrors() {
		return 40;
	}
    public long chassisNumber() {
    	return 999090808;
    }
    boolean isPunctured() {
		return false;
    }
    private String bikeName() {
    	String name= "honda";
    	return name;
    }
    double runningKm() {
    	return 45.101;
    }
    
    
	public static void main(String[] args) {
		
		TwoWheeler obj= new TwoWheeler();
		int noOfwheels = obj.noOfwheels();
		System.out.println("Number of wheels:"    +noOfwheels);
		short noOfMirrors = obj.noOfMirrors();
		System.out.println("Number of mirrors:"   +noOfMirrors);
		long chassisNumber = obj.chassisNumber();
		System.out.println("chassis no :" +chassisNumber);
		boolean punctured = obj.isPunctured();
		System.out.println("is punctured:" +punctured);
		String bikeName = obj.bikeName();
		System.out.println(bikeName);
		double runningKm = obj.runningKm();
		System.out.println(runningKm);
		
		

	}

}
