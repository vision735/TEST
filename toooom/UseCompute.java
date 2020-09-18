package toooom;

import java.util.List;

public class UseCompute {
	
	List<String> num =new LinkedList<>();
	Compute compute;
	
	public void useCom(Compute com,int one,int two) {
		this.compute =com;
		System.out.println(compute.computer(one, two));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
