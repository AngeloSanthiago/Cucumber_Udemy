# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação
  
Cenário: Deve executar especificação
  Dado que criei o arquivo corretamente
  Quando executá-lo
  Entao a especificação deve finalizar com sucesso
  
Cenário: Deve incrementar contador
	Dado que o valor o valor do contador é 15
	Quando eu incrementar em 5
	Então o valor do contador será 18  
# Os cinco Estatos de execução do Cucumber: 
# Passou(Passed) - Executou com sucesso;
# Falhou(Failed) - Lançou uma excessão Java;
# Ecapou(Skipped) - O passo está implementado mas, não foi executado;
# Pending - quando a excessão de pendencia de implementação foi lançada;
# Undefined - quando o passo não foi mapeado através do Gerkin para código java. Sempre é lançado independentemento dos outros status