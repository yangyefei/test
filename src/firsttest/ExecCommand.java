package firsttest;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class ExecCommand {
	public void execCommand(String command){
	       String ls_str;
	       Process ls_proc = null;
	       try 
	        {
	          System.out.println(">> 执行命令: " + command);
	            ls_proc = Runtime.getRuntime().exec(command);
	           DataInputStream ls_in = new DataInputStream(ls_proc.getInputStream());
	           BufferedReader br = new BufferedReader(new InputStreamReader(ls_in));
	           while ((ls_str = br.readLine()) != null) {
	                System.out.println(ls_str);
	          }
	        } 
	        catch (IOException e) {
	            e.printStackTrace();
	       }

	     }


	}

