package mmt;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_MMT implements IRetryAnalyzer
{
    int count=0;
    int noofretry=3;
	@Override
	public boolean retry(ITestResult result) 
	{
	   if(count<noofretry)
	   {
		   count++;
		   return true;   
	   }
		return false;
	}

}
