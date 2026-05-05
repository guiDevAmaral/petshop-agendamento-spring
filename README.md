🐾 PetShop API - Sistema de Agendamento
Este é um sistema de backend desenvolvido em Java Spring Boot para gerenciar os agendamentos de banho e tosa de um Pet Shop. O projeto foca em uma arquitetura limpa, utilizando boas práticas de desenvolvimento REST.

🚀 Funcionalidades Construídas
Gestão de Clientes: Cadastro e listagem de proprietários (Nome, CPF, Telefone).

Gestão de Pets: Cadastro de animais vinculados a um dono específico (Raça, Porte).

Catálogo de Serviços: Definição de serviços oferecidos (Banho, Tosa) com preços e tempo de duração.

Relacionamentos: Implementação de mapeamento objeto-relacional (ORM) com tratamento de recursão infinita no JSON.

🛠️ Tecnologias Utilizadas
Java 17/21

Spring Boot 3

Spring Data JPA: Para persistência de dados.

H2 Database: Banco de dados em memória para desenvolvimento ágil.

Lombok: Para redução de código boilerplate.

Maven: Gerenciador de dependências.

📁 Estrutura do Projeto
Plaintext
src/main/java/com/petshop/agendamento/
├── controller/   # Portas de entrada da API (Endpoints)
├── model/        # Entidades do banco de dados
├── repository/   # Interfaces de comunicação com o banco
└── AgendamentoApplication.java # Classe principal
🚦 Como Rodar o Projeto
Clone o repositório:

Bash
git clone https://github.com/SEU_USUARIO/NOME_DO_REPO.git
Importe o projeto na sua IDE preferida (IntelliJ, NetBeans ou Eclipse) como um projeto Maven.

Execute a classe AgendamentoApplication.java.

A API estará disponível em http://localhost:8080.

🧪 Como Testar os Endpoints
Você pode utilizar o Postman ou Insomnia para enviar requisições:

Listar Clientes: GET /clientes

Cadastrar Pet: POST /pets (Enviando o ID do dono no corpo do JSON).

Console do Banco (H2): http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:petshopdb)

Projeto desenvolvido durante estudos de Spring Boot.