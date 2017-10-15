public class LabTask{
	
	private void extractInfo(String from, String to){
		System.out.println("day :"+from.substring(0,2));
		System.out.println("month :"+from.substring(3,5));
		System.out.println("day :"+from.substring(6,10));
		
		System.out.println("day :"+to.substring(0,2));
		System.out.println("month :"+to.substring(3,5));
		System.out.println("day :"+to.substring(6,10));
		
		int day=Integer.parseInt(from.substring(0,2));
		int day1=Integer.parseInt(to.substring(0,2));
		
		int interval=30-(day-day1);
		
		//System.out.println("interval :"+interval);
		
		int year=Integer.parseInt(from.substring(6,10));
		int year1=Integer.parseInt(to.substring(6,10));
		
		int interval2=(year1-year)*365;
		System.out.println("interval between DAY:"+interval+" Year:"+interval2);
		
		int Yearint=interval+interval2;
		System.out.println("total Day:"+Yearint);
		
		
	}
	

public static void main(String[] args){
	LabTask ob=new LabTask();
	ob.extractInfo("15.10.2016","10.10.2017");
}
}