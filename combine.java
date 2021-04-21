public class combine{
	
	public static void main (String[] args) {
		char grade = 'C';
		int loop;	
		String name="ZDSPJC";	
		loop=1;
		
		
		do{
			System.out.println(name + loop);
				
				switch(grade){
				
					case 'A':
					System.out.println("Grade = A");
					break;
					
					case 'C':
					System.out.println("Grade = B");
					break;
					
					case 'D':
					System.out.println("Grade = C");
					break;
					
						default:
					System.out.println("Grade = D");
					
			}
				
				
				loop++;
		}while(loop<=20);
		
		
		
		
		
		
    }
}