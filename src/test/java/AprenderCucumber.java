import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AprenderCucumber {
	@Given("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {
//	    System.out.println("Executou passo criei arquivo");
//	    throw new Exception();
//		throw new RuntimeException();
	    throw new PendingException();
	}

	@When("^executá-lo$")
	public void execut_lo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
	}

	@Then("^a especificação deve finalizar com sucesso$")
	public void a_Especifica_o_deve_finalizar_com_sucesso() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	    
//	@Before(order=1)
//	public void pegaInformacoesScenario(Scenario cenario) {
//		
//		System.out.println( getClass().getName() +": "+ cenario.getId());
//		
//	}

}
