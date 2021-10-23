import acm.program.*;

public class Strings extends DialogProgram{
	public void run(){
		println(isWeekday(daye));



	}

	public enum Weekday{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
	private boolean isWeekDay(Weekday day){
		switch(day){
			case SATURDAY: case SUNDAY : return true;
			default:return false;
		}
	}
	Weekday daye = Weekday.SUNDAY;

	
}
