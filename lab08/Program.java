package lab08;

public class Program {

	public static void main(String[] args) {
		
//		Student student = new Student();
//		
//		student.setName("Bob");
//		student.setAge(29);
//		
//		System.out.printf("The students age is %d\n", student.getAge());
		
		
		
		//create an instance of class account
		Account bethAccount = new Account(123, "Beth", 1000);
		int bethID = bethAccount.getId();
		
		Account ralphAccount = new Account(456, "Ralph", 200);
		int ralphID = ralphAccount.getId();
		
		Account conorAccount = new Account(789, "Conor", 5000);
		int conorID = conorAccount.getId();
		
		bethAccount.withdraw(200);
		ralphAccount.deposit(800);
		conorAccount.withdraw(20);
		
		System.out.printf("Beth's account ID is %d and her balance is %.2f\n", bethID, bethAccount.getBalance());
		System.out.printf("Ralph's account ID is %d and his balance is %.2f\n", ralphID, ralphAccount.getBalance());
		System.out.printf("Conor's account ID is %d and his balance is %.2f", conorID, conorAccount.getBalance());


	}
	

}
