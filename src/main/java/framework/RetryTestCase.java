package framework;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestCase implements IRetryAnalyzer{
	
	
	int count = 0;
	int maxCount = 2;

	@Override
	public boolean retry(ITestResult result) {
		if(!result.isSuccess()) {
			if(count<maxCount) {
				count++;
				result.setStatus(result.FAILURE);
				return true;
			}else {
				result.setStatus(result.SUCCESS);
			}
		}
		
		return false;
	}

}
