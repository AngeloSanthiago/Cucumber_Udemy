Feature: Aprender Cucumber
  Como um aluno
  Eu quero aprender a utilizar Cucumber
  para que eu possa automatizar critérios de aceitação
  
Scenario: Deve executar especificação
  Given que criei o arquivo corretamente
  When executá-lo
  Then a especificação deve finalizar com sucesso
  
#Os cinco Estatos de execução do Cucumber: Passou, Falhou, Skipped, pending e undefined