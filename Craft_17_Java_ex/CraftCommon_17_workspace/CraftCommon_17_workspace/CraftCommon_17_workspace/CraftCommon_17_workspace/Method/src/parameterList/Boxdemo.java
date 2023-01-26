package parameterList;

public class Boxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double vol;
		Box mybox1 = new Box();
		mybox1.setDim(10, 20, 5);
		vol = mybox1.Volume();

		System.out.println(vol);
	}

}
