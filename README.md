<h2>Digital Innovation: acompanhamento da aula do Prof. Rodrigo Peleias no desenvolvimento de um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>

=> Sistema para o gerenciamento de pessoas através de uma API REST, criada com Spring Boot.

Tópicos observados:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (cadastro, leitura, atualização e remoção de pessoas de um sistema).
* Relação de cada uma das operações acima com o padrão arquitetural REST.
* Desenvolvimento de testes unitários para validação das funcionalidades.
* Implantação do sistema na nuvem através do Heroku.

Inclusões ao Projeto Original:

* Entidade 'CAR' vinculada a entidade mãe 'PERSON';
* 

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
http://localhost:8080/api/v1/people
```

Utilizadas as seguintes ferramentas-tecnologias no desenvolvimento e execução do projeto:

* Java 11.
* Maven 3.6.3.
* Intellj IDEA Community Edition.
* Controle de versão GIT instalado na máquina.
* Conta no Heroku para o deploy do projeto na nuvem.

Projeto original do Prof. Rodrigo Peleias: https://github.com/rpeleias/personapi_digital_innovation_one



