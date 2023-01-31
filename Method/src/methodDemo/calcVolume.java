package methodDemo;

public class calcVolume {
	
	
	
	
	public double calcVolume1 () {
		int width = 0;
		int height = 0;
		int depth = 0;
		double volume = width * height * depth;
		return volume;
		
 	}
	
	public void calcVolume () {
		int width = 0;
		int height = 0;
		int depth = 0;
		double volume = width * height * depth;
		System.out.println(volume);
		
		//can not give return statement because method is void
	}

}
