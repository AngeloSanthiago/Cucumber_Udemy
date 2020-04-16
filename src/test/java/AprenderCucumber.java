import cucumber.api.PendingException;
import cucumber.api.java.pt.Dada;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {
	
	private int contador = 0;

	@Dado("^que criei o arquivo corretamente$")
	public void queCrieiOArquivoCorretamente() throws Throwable {
		System.out.println("Qualquer coisa");
	}

	@Quando("^executá-lo$")
	public void executáLo() throws Throwable {
	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
	}
	
	@Dada("^que o valor o valor do contador é (\\d+)$")
	public void queOValorOValorDoContadorÉ(int arg1) throws Throwable {
	    contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void euIncrementarEm(int arg1) throws Throwable {
	    contador = contador + arg1;
	}

	@Então("^o valor do contador será (\\d+)$")
	public void oValorDoContadorSerá(int arg1) throws Throwable {
	    System.out.println("arg1: "+arg1);
	    System.out.println("contador: "+contador);
	}

	
//	@Dado("^que criei o arquivo corretamente$")
//	public void que_criei_o_arquivo_corretamente() throws Throwable {
////	    System.out.println("Executou passo criei arquivo");
////	    throw new Exception();
////		throw new RuntimeException();
//	    throw new PendingException();
//	}
//
//	@Quando("^executá-lo$")
//	public void execut_lo() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
////	    throw new PendingException();
//	}
//
//	@Então("^a especificação deve finalizar com sucesso$")
//	public void a_Especifica_o_deve_finalizar_com_sucesso() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
//	}
	    
//	@Before(order=1)
//	public void pegaInformacoesScenario(Scenario cenario) {
//		
//		System.out.println( getClass().getName() +": "+ cenario.getId());
//		
//	}

}
