package kevin1;

public class MyMainClass {
	static public void main (String []args) {

		rektangle rek_1 = new rektangle(10, 5);
		rektangle rek_2 = new rektangle(1000, 10);
		
		
		int omkrets_1 = rek_1.omkrets();		
		System.out.println ("Rekt_1 omkrest är = " + omkrets_1);

		
		int omkrets_2 = rek_2.omkrets();	
		System.out.println ("Rekt_2 omkrest är = " + omkrets_2);
		
		int area_1 = rek_1.area();
		System.out.println ("Rekt_1 area är = " + area_1);
		
		int area_2 = rek_2.area();
		System.out.println ("Rekt_2 area är = " + area_2);
		
		
	}

}
