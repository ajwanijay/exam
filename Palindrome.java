package exam;

public class Palindrome {

	public static void main(String args[]){
		
		Palindrome p = new Palindrome();
		System.out.println(p.longestPalindrome("asdgardabadfdwtehaaaaaaa"));
		
	}
	
	
	public int longestPalindrome(String s){
		
		int right = s.length()-1, left;
		int max = 1, temp_max, temp_left, temp_right;
		
		while(right>=0){
			
			
			//even
;			left = right - 1;
			temp_max = 0;
			temp_left = left;
			temp_right = right;
			while(temp_right<s.length()&&temp_left>=0){
				
				if(s.charAt(temp_left)==s.charAt(temp_right)){
					--temp_left;
					++temp_right;
					temp_max+=2;	
				}else{
					break;
				}			
			}
			
			if(temp_max>max)
				max = temp_max;
			
			//odd
			left = right - 2;
			temp_max = 1;
			temp_left = left;
			temp_right = right;
			while(temp_right<s.length()&&temp_left>=0){
				
				if(s.charAt(temp_left)==s.charAt(temp_right)){
					--temp_left;
					++temp_right;
					temp_max+=2;	
				}else{
					break;
				}			
			}
			
			if(temp_max>max)
				max = temp_max;
			
			--right;	
			
		}
		return max;
		
	}
	
	
}
