package patronSingleton;

public class Client {

	public static void main(String[] args) {
		Singleton sing = Singleton.getInstance();
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		
		sing.Service();

		System.out.println(sing==sing1);
		System.out.println(sing1==sing2);


	}

}
