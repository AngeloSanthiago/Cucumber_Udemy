# language: pt
Funcionalidade: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  Para que eu possa automatizar critérios de aceitação
  
Scenario: Deve executar especificação
  Dado que criei o arquivo corretamente
  Quando executá-lo
  Entao a especificação deve finalizar com sucesso
  
# Os cinco Estatos de execução do Cucumber: 
# Passou(Passed) - Executou com sucesso;
# Falhou(Failed) - Lançou uma excessão Java;
# Ecapou(Skipped) - ;
# Pending - quando a excessão de pendencia de implementação foi lançada;
# Undefined - quando o passo não foi mapeado através do Gerkin para código java. Sempre é lançado independentemento dos outros status