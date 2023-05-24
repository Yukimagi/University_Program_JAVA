package P4;

import java.util.*;
class Message {
	private String ans="";
	public String toString() {
		return ans;
	}
	public void encode(String s) {
		ans="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				continue;
			}
			else if(s.charAt(i)=='Z') {
				if(ans==null) {
					ans="A";
				}
				else {
				ans=ans+"A";
				}
			}
			else if(s.charAt(i)=='z') {
				if(ans==null) {
					ans="a";
				}
				else {
				ans=ans+"a";
				}
			}
			else {
				int g=s.charAt(i)+1;
				if(ans==null) {
					ans=(char)g+"";
				}
				else {
				ans=ans+(char)g+"";
				}
			}
		}
	}
	public void decode(String s) {
		ans="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				continue;
			}
			else if(s.charAt(i)=='A') {
				if(ans==null) {
					ans="Z";
				}
				else {
				ans=ans+"Z";
				}
			}
			else if(s.charAt(i)=='a') {
				if(ans==null) {
					ans="z";
				}
				else {
				ans=ans+"z";
				}
			}
			else {
				int g=s.charAt(i)-1;
				if(ans==null) {
					ans=(char)g+"";
				}
				else {
				ans=ans+(char)g+"";
				}
			}
		}
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Message MSG=new Message();
		String cmd;
		String []s;
		String s2="";
		String cmd2;
		int f=0;
		while(scan.hasNext()) {
			cmd=scan.nextLine();
			switch(cmd.charAt(1)) {
			case'n':{
				s=cmd.split("encode:");
				s2=s[1];
				MSG.encode(s[1]);
				f=1;
				break;
			}
			case'e':{
				s=cmd.split("decode:");
				s2=s[1];
				MSG.decode(s[1]);
				f=-1;
				break;
			}
			case'h':{
				if(f==1) {
					System.out.println("["+s2+"]encoded");
				}
				else if(f==-1) {
					
					System.out.println("["+s2+"]decoded");
				}
				System.out.println("MSG:"+MSG.toString());
				break;
			}
			case'x':{
				return;
			}
			}
		}

	}

}
