package Util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
public class WDUtil {
	//������      �����д����
	
	/*��ȡ�ļ�
	 * FilePath �ļ���·��
	 * ���� StringBuffer
	 */
	public StringBuffer fielRead(String FilePath) 
	{
		File file=new File(FilePath);
		StringBuffer sb=new StringBuffer();
	    try {
			FileInputStream fis=new FileInputStream(file);
			InputStreamReader reader = new InputStreamReader(fis, "UTF-8");
			
			while(reader.ready())
			{
				sb.append((char)reader.read());
			}
			reader.close();
			fis.close();
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
	    return sb;
	}
	
	/*
	 * FilePath �����ļ���·��
	 * txt ���������
	 */
	public void fileWrite(String FilePath,String txt)
	{
		File file=new File(FilePath);
		try {
			FileOutputStream fop=new FileOutputStream(file);
			OutputStreamWriter writer =new OutputStreamWriter(fop, "utf-8");
			writer.write(txt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
