package kevin1;

public class rektangle {
	int length;
	int width;
	
	public rektangle (int l, int w) {
		length = l;
		width = w;
	}
	
	public int omkrets()
	{
		return (2 * length) + (2 * width);
	
	}
	
	public int area(){
		return length * width;
	
	
	}


}
