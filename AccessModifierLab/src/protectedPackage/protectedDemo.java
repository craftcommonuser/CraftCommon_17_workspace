package protectedPackage;

public class protectedDemo {
	
protected void msg() {
	System.out.println("Hello");
	
	//can access/create an object from here
	protectedDemo m3 = new protectedDemo(); //inorder to access from another package we would need to import/extend the other package
	m3.msg();                              
	
}

}
