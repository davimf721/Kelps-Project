# Kelps (Trabalho da A3)
Um cadastro de ferramentas  e de amigos:
- personalisável
- seguro
- automatizado

## Desenvolvedores
- Davi Moreira fuzatto (davimf721,Unisul ADM)
- João Manuel pires escouto (João Manuel)
- Marlos Samuel Herneck do Carmo (MarlosSamuel)
- Bento Biral Foerster (4kbento)
- Julio Cesar Loch Stupp (lochjulio)

## Modelo de Dados:
### Tabelas no MySQL:
- ferramentas: armazena informações sobre as ferramentas (id, nome, marca, custo de aquisição).
- amigos: armazena informações sobre os amigos (id, nome, telefone).
- emprestimos: armazena informações sobre os empréstimos (id_emprestimo, id_ferramenta, id_amigo, data_emprestimo, data_devolucao, devolvido).
## Requisitos Funcionais:
### Cadastro de Ferramentas:
- RF001 - O sistema deve permitir o cadastro de novas ferramentas com informações como nome, marca e custo de aquisição.
- RF002 - Deve ser possível editar e excluir ferramentas já cadastradas.
### Cadastro de Amigos:
- RF003 - Deve ser possível cadastrar novos amigos com informações como nome e telefone.
- RF004 - O sistema deve permitir editar e excluir amigos já cadastrados.
### Registro de Empréstimos:
- RF005 - Deve ser possível registrar empréstimos de uma ou mais ferramentas a um amigo específico.
- RF006 - O sistema deve registrar a data em que o empréstimo ocorreu e a data de devolução prevista.
- RF007 - Deve ser possível visualizar empréstimos ativos (não devolvidos) e histórico de todos os empréstimos realizados.
- RF008 - Ao registrar um novo empréstimo, o sistema deve verificar se o amigo já possui alguma ferramenta emprestada e informar ao usuário.
### Relatórios:
- RFO09 -  sistema deve gerar um relatório de ferramentas disponíveis, mostrando o nome, marca e custo de aquisição de cada ferramenta, juntamente com o valor total gasto.
- RF010 - Deve ser possível visualizar um relatório de empréstimos ativos, mostrando quais ferramentas foram emprestadas, para quem e a data de devolução prevista.
- RF011 - Deve ser possível visualizar um relatório de todos os empréstimos realizados, mostrando quais ferramentas foram emprestadas, para quem, a data de empréstimo e a data de devolução.
- RF012 - O sistema deve ser capaz de identificar quem fez mais empréstimos e se há alguém que nunca devolveu ferramentas.
## Requisitos Não Funcionais:
### Localização:
- RNF001 - O sistema deve ser executado localmente no computador do usuário, sem a necessidade de acesso à internet.
### Usabilidade:
- RNF002 - A interface do usuário deve ser intuitiva e de fácil utilização, especialmente para um público não técnico..
### Desempenho:
- RNF003 - O sistema deve ser responsivo e executar de forma rápida, mesmo com uma grande quantidade de dados cadastrados.
### Segurança:
- RNF004 - Deve haver proteção dos dados sensíveis dos amigos e das ferramentas, garantindo que apenas usuários autorizados possam acessá-los.
### Manutenção:
- RNF005 - O sistema deve ser facilmente mantido e atualizado, permitindo futuras correções de bugs e implementações de novas funcionalidades, se necessário.
### Tecnologias:
- RNF006 - O sistema deve rodar em java 21
- RNF007 - O sistem deve rodar utilizando o MySQL 8.0.36



## Tecnologias Utilizadas:
### Java 21:

- Para desenvolver a lógica do aplicativo.
### MySQL 8.0.36:

- Para armazenar os dados do aplicativo.
### Google Calendar API:

- Para integração com o Google Agenda.

## Arquitetura:
### Camada de Apresentação:

- Interface de usuário para interagir com o sistema (pode ser uma interface gráfica ou linha de comando).
### Camada de Lógica de Negócios:

-Implementação das regras de negócio (gerenciamento de empréstimos, relatórios, integração com o Google Agenda).
### Camada de Acesso a Dados:

-Lógica para acessar e manipular os dados no banco de dados MySQL.

## Informações do banco de dados
- `url=jdbc:mysql://localhost:3306`
- `database=kelps`
- `user=root`
- `password=root`


                        
## Stargazers over time
[![Stargazers over time](https://starchart.cc/davimf721/Kelps-Project.svg?variant=adaptive)](https://starchart.cc/davimf721/Kelps-Project)


                    
