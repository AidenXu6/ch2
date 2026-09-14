public class dateandtime{
	
	public static void main(String[] args){
			String day = "Monday";
			int date = 14;
			String month = "September";
			int year = 2026;
			int hours=14;
			int minutes=42;
			int secmid=(hours*3600)+(minutes*60);
			System.out.println("The date of today is: " + day + ", " + month  +" "+  date + ", " + year);
			System.out.println("");
			System.out.print("Seconds since midnight at 2:42pm: "+secmid);
		
		}
}
