package day03;

public class BreakEx02 {
	public static void main(String[] args) {
		
//		//중첩 반복문의 탈출
//		
//		 for(char x = 'A'; x <= 'Z'; x++) {
//			 for(char y = 'a'; y <= 'z'; y++) {
//				 System.out.println(x + " - " + y);
//				 if( y == 'd') {
//					 break;
//				 }
//			 } //inner for
//			 
//			 System.out.println();
//		 }//outer for
//		
		
//		//중첩 반복문의 탈출
//		boolean flag = false;
//		 for(char x = 'A'; x <= 'Z'; x++) {
//			 for(char y = 'a'; y <= 'z'; y++) {
//				 System.out.println(x + " - " + y);
//				 if( y == 'd') {
//					 flag = true;
//					 break;
//				 }
//			 } //inner for
//			 if(flag) break;
//			 System.out.println();
//		 }//outer for
		
		//중첩 반복문의 탈출
		
	  end: for(char x = 'A'; x <= 'Z'; x++) {
			 for(char y = 'a'; y <= 'z'; y++) {
				 System.out.println(x + " - " + y);
				 if( y == 'd') {
					 break end;
				 }
			 } //inner for
			 
			 System.out.println();
		 }//outer for
		
		
		
	}
}
