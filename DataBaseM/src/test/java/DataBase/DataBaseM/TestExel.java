package DataBase.DataBaseM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import DataBase.DataBaseM.ExcelDriver;


import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static DataBase.DataBaseM.ConfigData.getCfgValue;

public class TestExel {
	  private ExcelDriver excelDriver;
	  
	  static Logger log = Logger.getLogger(TestExel.class);
	  @Before
	  public void setUp() throws Exception {
		excelDriver = new ExcelDriver();
		log.info("--------- TEST STARTED -------------");
	  }
	  @Test
	  public void test6() throws Exception {
	
		 Map dataTestList1= excelDriver.getData(getCfgValue("DATA_FILE"), "List1");
		 
		 System.out.println("Data " + dataTestList1);
//		    String qqq;
//		  String submenu1[] = new String[dataTestList1.size()];
//		  for (Integer y = 1;y < dataTestList1.size();y++){
//			  qqq = "KursItem" + y.toString();
//			  log.info(qqq);
//			  submenu1[y]=dataTestList1.get(qqq).toString();
//			  log.info(" Массив " + y + submenu1[y] );
			   
		  }
	
		  
		  @After
		  public void tearDown() throws Exception {
	
		    log.info("--------- TEST END  -------------");
		  }
}
