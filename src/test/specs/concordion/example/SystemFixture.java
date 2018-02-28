package concordion.example;


import concordion.example.SSystem;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.Map;

@RunWith(ConcordionRunner.class)
public class SystemFixture {
	SSystem system = new SSystem();
	
	public String getGreeting(String userName)
	{
		return system.getGreeting(userName);
	}
	
	public int somme (int firstNumber, int secondNumber)
	{
		return system.somme(firstNumber, secondNumber);
	}
	
	public int soustraction (int firstNumber, int secondNumber)
	{
		return system.soustraction(firstNumber, secondNumber);
	}
	
	public Resultat split(String userName)
	{
		return system.split(userName);
	}

	public Map<String, String> split1(String UserName)
	{
		return system.split1(UserName);
	}
}
