package parameterList;

public class Box {
	
	double width;
	double height;
	double depth;
	double Volume() {
		return width * height * depth;
		
	}
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

}
