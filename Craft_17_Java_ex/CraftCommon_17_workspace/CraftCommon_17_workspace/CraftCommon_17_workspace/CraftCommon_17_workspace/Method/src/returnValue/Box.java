package returnValue;

public class Box {
	double volume () {
		
		int width = 0;
		int height = 0;
		int depth = 0;
		
//		int resultVal = width * height * depth;
//		return resultVal;  // wrong because the result should be in double.
		
		double resultVal =  width * height * depth;
		return resultVal;//correct return type of double
		
	}

}
