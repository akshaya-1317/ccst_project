package util;



	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	public class csvreader {

	    public static Object[][] getTestData(String filePath) {
	        String line = "";
	        String csvSplitBy = ",";
	        List<Object[]> data = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            // Skip header line
	            br.readLine(); 

	            while ((line = br.readLine()) != null) {
	                // Split by comma
	                String[] loginCredentials = line.split(csvSplitBy);
	                data.add(loginCredentials);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return data.toArray(new Object[0][]);
	    }
	}

