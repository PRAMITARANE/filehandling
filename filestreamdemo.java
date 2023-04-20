package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filestreamdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileOutputStream fos = new FileOutputStream ("C:\\fileoutinstream\\fileoutputstream.txt");
String str = "I am jobito batch";
byte bstr[] = str.getBytes();
fos.write(bstr);
fos.close();

FileInputStream fis = new FileInputStream ("C:\\fileoutinstream\\fileoutputstream.txt");
int endoffile=0;
while ((endoffile=fis.read())!=-1) {
	System.out.println((char)endoffile);
	
}
}







	}


