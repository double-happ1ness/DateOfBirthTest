public class InputTest {
    public static void main(String[] args){
    	 
    	String nameOfDay = null;
    	String dayOfMonth;
    	String month;
    	String year;
        String userInput;
        nameOfDay=Input.getString("Day: ");
        System.out.println("the day you were born: "+nameOfDay);
        month=Input.getString("Month: ");
        System.out.println("the month you were born: "+month);
        year=Input.getString("Year: ");
        System.out.println("the year you were born: "+year);
        System.out.println("your date of birth is: "+nameOfDay+ " / " +month+ " / " +year);
    }
}