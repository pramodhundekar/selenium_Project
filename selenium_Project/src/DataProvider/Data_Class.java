package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Class {
	 @DataProvider(name="logindata")
	  public Object[][] sampledata(){
		  Object[][] data =new Object[4][2];
		  data[0][0]="pramod@gmail.com";
		  data[0][1]="pramod@1234";
		  data[1][0]="Akhil@gmail.com";
		  data[1][1]="ramana@1234";
		  data[2][0]="teja";
		  data[2][1]="teja@1234";
		  data[3][0]="jagadesh@gmail.com";
		  data[3][1]="jagadesh@123";
		  return data;
	 }
		  
		  @DataProvider(name="lndata")
		  public Object[][] seconddata(){
			  Object[][] data =new Object[1][2];
		  data[1][0]="Akhil@gmail.com";
		  data[1][1]="ramana@1234";
		  
		  return data;
		  }
		  
		  @DataProvider(name="dndata")
		  public Object[][] thirddata(){
			  Object[][] data =new Object[1][2];
		  data[2][0]="teja";
		  data[2][1]="teja@1234";
		  return data;
		  
  }
}
