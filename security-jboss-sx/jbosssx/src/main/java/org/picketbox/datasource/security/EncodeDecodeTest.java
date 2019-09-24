package org.picketbox.datasource.security;

/***
 * Entry point for encoding or decoding a passphrase
 * using the default encryption algorithm and default passphrase
 * 
 * usage:
 * 
 *   java -cp picketbox.jar org.picketbox.datasource.security.EncodeDecodeTest encode|decode passphrase
 *   
 * @author khancock
 *
 */
public class EncodeDecodeTest extends SecureIdentityLoginModule {
	
	   public static void main(String[] args) throws Exception
	   {
		   String cmd = args[0];
		   String password = args[1];
		   if ("encode".equals(cmd)) {
			   String encode = encode(password);
			   System.out.println("Encoded password: " + encode);
			   
		   } else if ("decode".equals(cmd)) {
			   String decode = new String(decode(password));
			   System.out.println("Decoded password: " + decode);
		   } else {
			   System.out.println("First argument must be either encode or decode.");
		   }
	   }

}
