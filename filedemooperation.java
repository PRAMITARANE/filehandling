package collection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filedemooperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1= new File ("C:\\filedemo\\testing,txt");
if (f1.createNewFile()) {
	System.out.println("created the new file successfully:"+ f1.getAbsolutePath());
}
else {
	System.out.println("file already present at the location");
	System.out.println("file name:" +f1.getName());
	System.out.println("can read the file :" +f1.canRead());
	System.out.println("can write the file:" +f1.canWrite());
	
	System.out.println("##############");
	System.out.println("file write operation");
		
}

if (f1.exists()) {
	FileWriter fw = new FileWriter(f1);
	fw.write("i am Pramita");
	fw.close();
	}
else {
	System.out.println("file not present");
}

System.out.println("************");
System.out.println("file reAD OPERATION");
 Scanner sc = new Scanner (f1);
  while(sc.hasNextLine()) {
	  String pl = sc.nextLine();
	  System.out.println(pl);
	  
	  System.out.println("%%%%%%%%%%");
	  System.out.println("file delete operation");
	 if ( f1.delete() ){
		  System.out.println("file deleted");
	  }
	  else {
		  System.out.println("file not deleted");
	  }
  }
	}

}
