package syntax;

public class GuGuDan {

	public static void main(String[] args) {

		for(int i=9;i>0;i--) {
			
			for(int j=9;j>0;j--) {
				System.out.print(i + " X " + j + " = " + (i*j));
				
			if(j!=1) { 
				System.out.print(", ");
			}
		}
			System.out.println();
	}
}
}

