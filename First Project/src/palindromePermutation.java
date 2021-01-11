//Ignoring whitespaces and digits in this solution
import java.io.*;
public class palindromePermutation {
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		String ip=in.readLine();
		ip=ip.toLowerCase();
		boolean[] count = new boolean[26];
		int k=0;
		for (int i=0;i<ip.length();i++)
		{
			int val = (int)(ip.charAt(i));
			if(val<='z'&&val>='a') 
			{
				count[(val-'a')]=!count[(val-'a')];
			}
		}
		for(int i=0;i<26;i++) {
			if(count[i]==true) k++;
		}
		if(k<2)
			System.out.println("String Permutation of Palindrome");
		else
			System.out.println("String Not Permutation of Palindrome");
	}
}
