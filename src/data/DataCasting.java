package data;

public class DataCasting {
	
	public static void main(String[] args) {
		Byte b = new Byte((byte) 10); // byte
		Short s = new Short((short) 10); // short
		Integer i = new Integer(10); // int
		Long l = new Long(10); // long
		
		Float f = new Float(1.2f); // float
		Double d = new Double(1.2); // double
		
		Character c = new Character('c'); // char
		Boolean bl = new Boolean(true); // boolean
		
		String numStr = "123.5";
		d = Double.parseDouble(numStr);
				
		int num = d.intValue();
		System.out.println(num+1);
		
		double db = Double.parseDouble(numStr);
		System.out.println(db+1);
		
	}

}
