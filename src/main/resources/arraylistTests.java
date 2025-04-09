package org.iesvdmprogramacion

import java.util.ArrayList;
import java.util.arraylist;

import org.junit.Test;

public class arraylistTests {

		
		@Test
		public void arraylistTest1() {
			
			//Given
			ArrayList<String> arraylist = new Arraylist<>();
			String str1 = "cad1";
			String str2 = "cad2";
			
			//When
			arraylist.add(str1);
			arraylist.add(str2);
			
			//Expect
			Assert.assertEquals("[cad1,cad2]",arraylist.toString());
			Assert.assertEquals(2,arraylist.size());
			
			int poStr1 = arrayList.indexof(str1);
			Assert.assertEquals(0,poStr1);
			
			String strPos1 = Arraylist.get(1);
			Assert.assertEquals(str2,strPos1);
		}
}
