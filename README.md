# Kelps (Trabalho da A3)
Um cadastro de ferramentas  e de amigos:
- personalisável
- seguro
- automatizado

##

## Modelo de Dados:
### Tabelas no MySQL:
- ferramentas: armazena informações sobre as ferramentas (id, nome, marca, custo de aquisição).
- amigos: armazena informações sobre os amigos (id, nome, telefone).
- emprestimos: armazena informações sobre os empréstimos (id_emprestimo, id_ferramenta, id_amigo, data_emprestimo, data_devolucao, devolvido).
## Funcionalidades:
### Cadastro de Ferramentas e Amigos:

- Permitir adicionar, visualizar, editar e excluir ferramentas e amigos.
### Empréstimo de Ferramentas:

- Registrar empréstimos de uma ou mais ferramentas para um amigo, com data de empréstimo e data prevista de devolução.
- Validar se o amigo ainda tem itens não devolvidos antes de conceder um novo empréstimo.
### Relatórios:

Relatório de ferramentas e gastos totais.
Relatório de empréstimos ativos e histórico de empréstimos.
### Integração com Google Agenda:

- Integrar a agenda com o Google Calendar para registrar convites de amigos para eventos.
- Compartilhar lembretes de eventos via e-mail.
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
## Considerações Adicionais:
- Utilizar JDBC para interagir com o banco de dados MySQL.
-Implementar validações de entrada de dados para garantir a integridade dos dados.
-Criar uma estrutura de exceções para lidar com erros e exceções durante a execução do aplicativo.
-Testar exaustivamente todas as funcionalidades para garantir que o sistema esteja funcionando conforme o esperado.
