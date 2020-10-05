
public class SingletonPat {
	private static SingletonPat single;
	private SingletonPat() {
		
	}

	public static synchronized SingletonPat getInstanz() {
		if (SingletonPat.single == null) {
			System.out.println("Yeah i bin einzigartig");
			SingletonPat.single = new SingletonPat(); 
		}
		else {
			System.out.println("Es gibt schon den einzig wahren!!!");
		}
		return SingletonPat.single;
	}
}
