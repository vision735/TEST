package ibm.com.employee;
import ibm.com.test.Cattle;
public class EmployeeTest {
	 public static void main(String[] args){
	      /* ʹ�ù����������������� */
	      Employee empOne = new Employee("RUNOOB1");
	      Employee empTwo = new Employee("RUNOOB2");
	 
	      // ��������������ĳ�Ա����
	      empOne.empAge(26);
	      empOne.empDesignation("�߼�����Ա");
	      empOne.empSalary(1000);
	      empOne.printEmployee();
	 
	      empTwo.empAge(21);
	      empTwo.empDesignation("�������Ա");
	      empTwo.empSalary(500);
	      empTwo.printEmployee();
	      
	      
	      Cattle myCattleName=new Cattle("import�������");
	      System.out.println("����importԭ��:" + myCattleName);
	   }

}