import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DolphinConversation {
	
	 public static void main(String args[]) 
	    { 
		 
	        // create hash map
	        Map<String, String> newHashMap = new HashMap<String, String>();
	        newHashMap.put( "eeeehk!","hello" ); 
	        newHashMap.put( "eeeehk?" ,"are you sure?" ); 
	        newHashMap.put( "ehhhk" ,"there" ); 
	        newHashMap.put( "ekhhh" ,"fish" ); 
	        
	        //String[] dolphinStringArray = new String[]{"eeeehk!","eeeehk?","ehhhk","ekhhh"};
	   
	        // input by user
	        Scanner scan = new Scanner(System.in);  
	        System.out.println("Enter dolphin sound language:");  
	        
	        String dolphinSoundText = scan.nextLine(); 
	        
        
        	//String replaceString = "";
	    	for (Map.Entry<String, String> entry : newHashMap.entrySet()) {
	    		
	    		String key = entry.getKey();
	    		String value = "<<" + entry.getValue() + ">>";
	    		dolphinSoundText = dolphinSoundText.replace(key, value);
	    	}
       
            System.out.println("dolphinSoundText: "+ dolphinSoundText);  
            
            String pattern = "<<(.*?)>>";
            
            // create a pattern object
            Pattern r = Pattern.compile(pattern);
            
            // Now create matcher object
            Matcher m = r.matcher(dolphinSoundText);
            System.out.println("Matcher: "+ m);
            while (m.find()) {
            	System.out.print(m.group(1)+" ");
            }
  	
	    	
	    } 
}
