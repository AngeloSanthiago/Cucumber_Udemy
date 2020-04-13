import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class TesteInfoCenario {
//	@Before(order=2)
	public void recebeInformacoes(Scenario cenario) {
		String id = cenario.getId();
		System.out.println(id);
	}
	
}
