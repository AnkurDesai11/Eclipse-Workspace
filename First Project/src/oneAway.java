/*
import java.io.*;//Runtime of this algorithm is O(a+B) where a,b are string lengths
public class oneAway {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String i1="";String i2="";
		while(true) {
			System.out.println("Enter 2 Strings, enter both strings 0 to exit");
			i1=in.readLine();
			i2=in.readLine();
			if(i1=="0"&&i2=="0")break;
			int l1=i1.length();
			int l2=i2.length();
			if(Math.abs(l1-l2)<=1) {
				int[] i1count = returnCount(i1.toLowerCase());
				int[] i2count = returnCount(i2.toLowerCase());
				int k=0;
				for (int i=0;i<26;i++){//considering only alphabetic strings as input
					if(i1count[i]!=i2count[i]) k++;
					if(k>=3) {
						//System.out.println("False");
						break;
					}
				}	
				if(k==2 && Math.abs(l1-l2)==0) {
					System.out.println("True");
				}
				else if(k==1 && Math.abs(l1-l2)==1) {
					System.out.println("True");
		    	}
				else {
					System.out.println("False");
				}
			}
			else System.out.println("False");
		}
	}
	public static int[] returnCount(String s) {
		int[] chars = new int[26];
		for(int i=0;i<s.length();i++) {
			int c = (int)(s.charAt(i)-'a');
			chars[c]++;
		}
		return chars;
	}
}
*/
import java.io.*;//Runtime of this algorithm is O(a) where a is length of smaller string 
public class oneAway {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Enter 2 Strings, press enter twice to exit");
			String i1=in.readLine();
			String i2=in.readLine();
			if(i1.equals("")&&i2.equals(""))break;
			check(i1.toLowerCase(),i2.toLowerCase());
		}
	}
	public static void check(String s1,String s2) {
		String i1,i2;
		int k=0;
		if(s1.equals(s2)) {
			System.out.println("False");
			return;
		}
		if(Math.abs(s1.length()-s2.length())>=2) {
			System.out.println("False");
			return;
		}
		//assign i1 as bigger string
		if(s1.length()>s2.length()) {
			i1=s1;i2=s2;
		}
		else {
			i1=s2;i2=s1;
		}
		
		for (int i=0;i<i2.length();i++) {
			if(i1.charAt(i)!=i2.charAt(i) && k==0) {
				k++;
			}
			if( i1.length()!=i2.length()) {
				if(i1.charAt(i+k)!=i2.charAt(i) && k==1) {
					if(i1.charAt(i)!=i2.charAt(i)) {
					System.out.println("False");
					return;
					}
				}
			}
		}
		System.out.println("True");
		return;
	}
}