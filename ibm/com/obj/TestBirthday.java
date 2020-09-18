package ibm.com.obj;

public class TestBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBirthday test = new TestBirthday();
		int date =9;
		Birthday d1 = new Birthday(7, 7, 1970);
		Birthday d2 = new Birthday(1, 1, 2000);
		test.change1(date);
		test.change2(d1);
		System.out.println("date1=" + d1.getDay());
		test.change3(d2);
		System.out.println("date2=" + d2.getDay());
		System.out.println("date=" + date);
		d1.toString();
		d2.toString();
	}
	
	public void change1(int i) {
		i = 1234;
		}
	public void change2(Birthday b) {
		b.setDay(22);
		}
	public void change3(Birthday b) {
		b.setDay(22);
		}
	

}
