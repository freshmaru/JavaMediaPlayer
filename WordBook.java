WordBook.java
 * 단어장의 기능을 구현한 Class
 * 
 * 작성자 오기탁
 * WordBook(): 생성자를 통해서 WordBook.txt 백업파일을 불러온다.
 * save(): 단어장리스트를 WordBook.txt파일에 백업.
 
 package llplayer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WordBook {
	private ArrayList<String> wordList = new ArrayList<String>();
	
	public WordBook() {
		File file = new File("WordBook.txt");
		if(!file.exists()) return;
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				wordList.add(line);
			}
			
			fis.close();
			isr.close();
			br.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
  	public ArrayList<String> getList(){
		return wordList;
	}
}
