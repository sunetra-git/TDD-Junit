import java.util.*;
class ARemoval{
	public static void main(String args[]){
		String alpha;
		String sub1="";
		String sub2="";
		String sub3="";
		String sub="";
		Scanner obj=new Scanner(System.in);
		alpha=obj.nextLine();
		sub=alpha.substring(0,2);
		char ch1=alpha.charAt(0);
		char ch2=alpha.charAt(1);
		if(sub.equals("AA")){
			sub1=alpha.replaceFirst("AA","");
			
			System.out.println(sub1);
		}
		else if(ch1=='A'){
			sub2=alpha.replaceFirst("A","");
			System.out.println(sub2);
		}
		else if(ch2=='A'){
			sub3=charRemoveAt(alpha,1);
			System.out.println(sub3);
		}
		else{
			System.out.println(alpha);
		}
	}
	public static String charRemoveAt(String str,int p){
			return str.substring(0,p)+str.substring(p+1);
	}
}