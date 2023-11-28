package iRetryAnalyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer
{
     int count=0;
     int noofretry=2;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<noofretry)
		{
			count ++;
			return true;
		}
		return false;
	}

}
