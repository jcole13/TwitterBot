package main;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;



public class Authorization {
	
	  //this methods returns an instance of twitter connected to an account
	  public static Twitter main() throws Exception{
		    // The factory instance is re-useable and thread safe.
		    Twitter twitter = TwitterFactory.getSingleton(); //twitter instance without authorization
		    twitter.setOAuthConsumer(Main.ck, Main.cs); //key and secret obtained from twitter developer page
		    RequestToken requestToken = twitter.getOAuthRequestToken();
		    AccessToken accessToken = null;
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    while (null == accessToken) {
		      System.out.println("Open the following URL and grant access to your account:");
		      String auth = requestToken.getAuthorizationURL(); //opens up a webpage to begin authorzation steps
		      if(Desktop.isDesktopSupported()) Desktop.getDesktop().browse(new URI(auth)); 
		      System.out.println(auth);
		      System.out.print("Please enter the pin confirmation and then hit enter:");
		      String pin = br.readLine(); //read in the pin
		      try{
		         if(pin.length() > 0){ //check if anything was typed
		           accessToken = twitter.getOAuthAccessToken(requestToken, pin);
		         }else{
		           accessToken = twitter.getOAuthAccessToken();
		         }
		      } catch (TwitterException te) {
		        if(401 == te.getStatusCode()){ //nothing to be found
		          System.out.println("Unable to get the access token.");
		          return null;
		        }else{
		          te.printStackTrace();
		        }
		      }
		    }
		    return twitter;
		  }
}