package es01.com.naver;

import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class navertext {

	public static void main(String[] args) throws IOException {
		int pages=5;
		
		
		String url="https://news.naver.com/main/list.naver?mode=LS2D&mid=shm&sid2=249&sid1=102&date=20220502&page=2";
		Document doc= Jsoup.connect(url).get();
	//	System.out.println(doc);
		Elements emlements =doc.getElementsByAttributeValue("class","list_body newsflash_body");
		System.out.println(emlements);
		//Element emlement = emlements.get(0);
	
		
	}

}
