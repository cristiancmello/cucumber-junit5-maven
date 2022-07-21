Feature: Hello World feature

  Scenario: uma mensagem 'Hello World' deve aparecer na tela
    Given system output
    When enviada mensagem para System output 'Hello World'
    Then a mensagem deve aparecer na tela