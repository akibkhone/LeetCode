package LeetCode.Easy;

public class DefangingAnIPAddress
{

	public static void main(String[] args)
	{
		System.out.println(defangIPaddr("1.3.2.1.1"));
	}

	 public static String defangIPaddr(String address) {
     StringBuilder defangedIp = new StringBuilder();
     for (char c : address.toCharArray()) {
         if (c != '.') {
             defangedIp.append(c);
             continue;
         }
         defangedIp.append("[.]");
     }
     return defangedIp.toString();
 }
}
