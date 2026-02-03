package util;



	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	public class csvreader {

		//STATIC METHOD THAT TAKES FILE PATH
	    public static Object[][] getTestData(String filePath) {
	        String line = "";
	        String csvSplitBy = ",";
	        //LIST TO HOLD ROWS
	        List<Object[]> data = new ArrayList<>();

	        //TRY WITH RESOURCES
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            // Skip header line
	            br.readLine(); 

	            while ((line = br.readLine()) != null) {
	                // SPLITS LINE INTO ARRAY
	                String[] loginCredentials = line.split(csvSplitBy);
	                data.add(loginCredentials);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        //CONVERTS LIST INTO ARRAY
	        return data.toArray(new Object[0][]);
	    }
	}

