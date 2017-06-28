package Assignment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {




			public static void main(String args[]) throws IOException { 
				
			    // we take FileInputStream to read the line from the file   
				FileInputStream in = null;
				FileOutputStream out = null;
				//we take FileOutStream to write the line from the file 

				      try { // here we are applying try to handling the exception 
				    	  
				         in = new FileInputStream("E:/File In Java/BBB.txt"); // Input file location.
				         out = new FileOutputStream("E:/File In Java/CCC/DDD.txt"); //Output file location.
				         
				         int F;
				         while ((F = in.read()) != -1) { // 
				            out.write(F);
				         }
				         
				         System.out.println("File copid successfully");// console window
				         
				      }finally { 
				         if (in != null) {
				            in.close();
				         }
				         if (out != null) {
				            out.close();
				         }
				      }
			}
}
				   

