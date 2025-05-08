Enunciado - CRUD de Cadastro de Clientes com Banco de Dados e Data de Nascimento 
Desenvolva um sistema de cadastro de clientes utilizando Java e conectar ao SGBD MySQL. O sistema 
deve implementar as operações CRUD (Create, Read, Update, Delete) para o gerenciamento de dados dos 
clientes e armazená-los no banco de dados.

Requisitos do Sistema: 
1. Cadastro de Cliente (Create): 
o O sistema deve permitir o cadastro de um cliente, armazenando as seguintes informações: 
▪ Nome (String) 
▪ CPF (String) - Deve ser validado no formato correto. 
▪ E-mail (String) - Deve ter formato válido. 
▪ Telefone (String) - Deve ser validado no formato correto. 
▪ Endereço (String) 
▪ Data de Nascimento (Date) - Deve ser armazenada no formato YYYY-MM-DD. 
o Garantir que o CPF seja único. Ou seja, não pode existir um cliente com o mesmo CPF. 
2. Visualização de Cliente (Read): 
o O sistema deve permitir que o usuário visualize todos os clientes cadastrados. 
o O usuário pode buscar um cliente pelo CPF ou nome e visualizar suas informações 
detalhadas, incluindo a data de nascimento. 
3. Alteração de Cliente (Update): 
o O sistema deve permitir a edição dos dados de um cliente, exceto o CPF (que deve ser 
imutável). 
o O sistema deve permitir a atualização de todos os outros campos, incluindo a data de 
nascimento. 
4. Exclusão de Cliente (Delete): 
o O sistema deve permitir que um cliente seja removido do banco de dados pelo CPF. 
5. Validação e Tratamento de Erros: 
o O sistema deve validar os dados de entrada, como o formato do CPF, telefone, e-mail e data 
de nascimento, e garantir que não haja cadastro de clientes com dados obrigatórios em 
branco. 
o Mensagens de erro adequadas devem ser apresentadas, como tentativas de cadastrar um CPF 
duplicado, excluir um cliente inexistente, ou editar um cliente com CPF inválido.


Requisitos Técnicos: 
• O sistema deve ser desenvolvido em Java. 
• O CRUD deve ser implementado utilizando Orientação a Objetos. 
• Para armazenar os dados,  o MySQL. 
• Utilize JDBC (Java Database Connectivity) para interação com o banco de dados. 
• Crie uma tabela clientes no banco de dados com os seguintes campos: 

Trabalho realizado Por Uanderson Leonardo e Gabriel Sarubi

Uanderson Leonardo         |     [![Linkedin Badge](https://img.shields.io/badge/Linkedin-blue?style=flat-square&logo=Linkedin&logoColor=white)](https://www.linkedin.com/in/uanderson-leonardo-1aaa722a0/) [![GitHub Badge](https://img.shields.io/badge/GitHub-111217?style=flat-square&logo=github&logoColor=white)](https://github.com/uandleon)              |


Gabriel Sarubi |      [![Linkedin Badge](https://img.shields.io/badge/Linkedin-blue?style=flat-square&logo=Linkedin&logoColor=white)]([https://www.linkedin.com/in/gustavo-felipe-morais-a6517b327/](https://www.linkedin.com/in/gabriel-sarubi-3050442b4/)) [![GitHub Badge](https://img.shields.io/badge/GitHub-111217?style=flat-square&logo=github&logoColor=white)](https://github.com/GabrielSarubi-7)     |
