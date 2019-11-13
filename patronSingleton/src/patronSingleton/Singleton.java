package patronSingleton;

public class Singleton {
	
	public static  Singleton instance = new Singleton();
	
	private Singleton() {
		super();
		
	}

	private Singleton(Singleton instance) {
		super();
		this.instance = instance;
	}
	
	public synchronized static Singleton getInstance(){
		
		return instance;
		
	}
	public void Service() {
		System.out.println("hello");
	}

}
