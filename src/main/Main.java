package main;
import twitter4j.*;
import twitter4j.Status;
import java.io.File;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import java.util.Random;


//this is the main code of the bot that works once a twitter instance is received
public class Main {
	public static String ck = "nhmJ65HnIAgfodpTo7rNDPOk2";
	public static String cs = "5Zpv34iDWuCrKfs7YReC8odDpcyufcW87om9LCiNP8ecNkXxBO";

	//Most of the code is commented out because I no longer have access to this API. Twitter banned my account a long time ago.
	public static void main(String[] args) throws Exception {
		Twitter tw = Authorization.main();
		
		/*
		for(int i = 0; i < 50; i++){
			tw.sendDirectMessage("jcole111111", "This is a bot");
		}
		//these urls would be grabbed and posted
		String[] urls = {"http://img.wonkette.com/wp-content/uploads/2016/09/nbc-fires-donald-trump-after-he-calls-mexicans-rapists-and-drug-runners-1.jpg", "http://static2.politico.com/dims4/default/51bb439/2147483647/resize/1160x%3E/quality/90/?url=http%3A%2F%2Fstatic.politico.com%2F3a%2Fa4%2F5ab5c48043ac8a57c4ced8975872%2F160208-hillary-clinton-1160-gty.jpg", "http://i4.mirror.co.uk/incoming/article7496519.ece/ALTERNATES/s615/Donald-Trump.jpg", "http://media.brostrick.com/wp-content/uploads/2016/03/10075525/funny-political-memes-bill-clinton-2016.jpg"};
		String[] msgs = {"Debate1", "Trump vs. Hil 1", "That was stupid 1", "dd1"};
		tw.updateProfile("This is a bot", null, null, null);
		
		for(int i = 0; i < 2; i++){
			Random r = new Random()
					;
			//upper bound is 4 because there are 4 elements in each array, usually more than 4
			
			int i1 = r.nextInt(4 - 0) + 0; //random number between 0 and 4
			int i2 = r.nextInt(4 - 0) + 0;
			StatusUpdate sm = new StatusUpdate(msgs[i1]);
			
			
			URL url = new URL(urls[i2]);
			File file = new File("giphy.gif");
			.copyURLToFile(url, file);
			sm.setMedia(file);
			tw.updateStatus(sm);
			
			 
			Thread.sleep(1000);
			System.out.println("Updates Made");
		}
		*/
		
		

	}

}
