# POO_e_Persistencia_2026.2

<h1>Calendario</h1>

| Semana | Período (Semana de) | Etapa / Conteúdo | Conteúdo & Evolução no Projeto (TechLab Inventory) | Entregável no GitHub |
| :--- | :--- | :--- | :--- | :--- |
| **01** | 10/Ago – 14/Ago | Aula 01 | Setup & Git/GitHub: Introdução à POO e fluxo Git em máquinas compartilhadas. | Repositório techlab-inventory com README.md. |
| **02** | 17/Ago – 21/Ago | Aula 02 | Modelagem Inicial: Classes, Objetos, Encapsulamento (Getters/Setters). | Classes AtivoTI e ChamadoSuporte criadas. |
| **03** | 24/Ago – 28/Ago | Aula 03 | Ciclo de Vida & Memória: Alocação de memória, referências e passagem por valor/referência. | Métodos para vinculação direta de objetos na memória RAM. |
| **04** | 31/Ago – 04/Set | Aula 04 | Padronização: Sobrecarga de construtores/métodos e representação em texto. | Construtores flexíveis e formatação para exibição. |
| **05** | 07/Set – 11/Set | Aula 05 | Herança & Especialização: Subclasses de ativos (Servidor, EstacaoTrabalho). (Feriado 07/09) | Hierarquia de ativos implementada. |
| **06** | 14/Set – 18/Set | Aula 06 | Abstração & Interfaces: Contratos de software e desacoplamento (INotificavel, IPersistencia). | Interfaces do sistema definidas. |
| **07** | 21/Set – 25/Set | Aula 07 | Tratamento de Exceções: Robustez do sistema com try/catch e exceções personalizadas. | Lançamento e captura de exceções nos métodos. |
| **08** | 28/Set – 02/Out | Revisão / Mentoria | Revisão Geral do Módulo em Memória: Suporte individualizado aos alunos para alinhar os códigos e os repositórios. | Limpeza de bugs e push consolidado no GitHub. |
| **09** | 05/Out – 09/Out | AVALIAÇÃO 1 | 1ª Avaliação Prática / Entrega Parcial: Validação da POO completa em memória (Herança, Interfaces, Exceções). | Release v0.5-alpha taguado no GitHub. |
| **10** | 12/Out – 16/Out | Recesso / Ajuste | Semana de Ajuste do Calendário / Recesso escolar: (Sintonizado com Feriado de 12/10). | Tempo de consolidação para os alunos. |
| **11** | 19/Out – 23/Out | Aula 08 | Mapeamento de Dados & Casts: Conversão de tipos, casting seguro e Data Transfer Objects (DTO). | Mapeadores de objetos e conversão de tipos. |
| **12** | 26/Out – 30/Out | Aula 09 | Coleções & Genéricos: Gerenciamento de listas de dados, iteradores, buscas e filtros em memória. | Gerenciador de ativos/chamados via Coleções/Listas. |
| **13** | 02/Nov – 06/Nov | Aula 10 | Persistência I (Arquivos): Escrita e leitura de dados em arquivos .txt, .csv ou .json. (Feriado 02/11) | Módulo de leitura/gravação em arquivo local. |
| **14** | 09/Nov – 13/Nov | Aula 11 | Persistência II (Banco de Dados): Conexão com BD real (SQLite/MySQL), Padrão DAO/Repository e SQL Injection. | AtivoRepository / AtivoDAO funcional com CRUD. |
| **15** | 16/Nov – 20/Nov | Integração do BD | Integração BD + Interface: Conexão final do projeto com a base de dados. (Feriado 20/11) | CRUD completo e testado na aplicação. |
| **16** | 23/Nov – 27/Nov | Polimento e Testes | Homologação Final: Refatoração de código, testes de borda e documentação final do README.md. | Código-fonte congelado no GitHub. |
| **17** | 30/Nov – 04/Dez | AVALIAÇÃO 2 | 2ª Avaliação (Apresentação Final / Exame): Defesa prática do projeto TechLab Inventory rodando com Banco de Dados. | Release v1.0-final taguado e encerramento. |

<h1>Projeto de Sala de Aula</h1>
TechLab Inventory & Service Desk: O Nosso Projeto do Semestre

Bem-vindos à disciplina de Programação Orientada a Objetos! Ao longo do semestre, vocês construirão de maneira incremental o TechLab Inventory & Service Desk, uma aplicação prática voltada para a gestão de ativos de TI (hardware, servidores, estações de trabalho) e gerenciamento de chamados de suporte técnico. O projeto foi desenhado para simular um cenário real do mercado de tecnologia e poderá ser implementado na linguagem de programação orientada a objetos de sua escolha (como Python, Java, C#, C++, TypeScript, entre outras).

Requisitos do Sistema e Estrutura do Domínio

Para garantir uma arquitetura de software sólida e alinhada às boas práticas do mercado, a aplicação deverá atender aos seguintes requisitos funcionais e estruturais:

    Classe Base Abstrata (AtivoTI): Implementação da classe base contendo os atributos privados id, codigoPatrimonio, modelo, dataAquisicao e status (com os estados Ativo, EmManutencao e Descartado), utilizando encapsulamento com métodos getters e setters.

    Especialização de Ativos (Herança): Criação de subclasses especializadas para representar os equipamentos da infraestrutura de TI:

        Servidor: contendo os atributos ipEstatico, sistemaOperacional e capacidadeRAM.

        EstacaoTrabalho: contendo os atributos departamento e usuarioAlocado.

        DispositivoRede: contendo o atributo para indicar a quantidade de portas.

    Gestão de Chamados (ChamadoSuporte): Entidade de negócio responsável por registrar os chamados contendo id, titulo, descricao, prioridade (Baixa, Media, Alta), dataAbertura e a associação direta com a referência do ativoRelacionado.

    Contratos de Software (Interfaces): Definição e implementação das interfaces IConexaoBD (com os métodos conectar() e executarQuery()), INotificavel para emissão de alertas de chamados e IPersistencia.

    Tratamento de Exceções Personalizadas: Lançamento e captura de exceções customizadas para garantir resiliência contra falhas de regra de negócio e ambiente, tais como EquipamentoNaoEncontradoException e FalhaConexaoBDException.

    Coleções e Mapeamento em Memória: Utilização de coleções genéricas (Listas e Mapas) e iteradores para listar, buscar e filtrar chamados por prioridade/status em memória RAM, além do uso de DTOs e conversores para mapeamento de dados.

    Persistência em Arquivo e Banco de Dados: Manipulação inicial de arquivos locais (.txt ou .csv). Na etapa final, integração real com um banco de dados relacional (SQLite, MySQL ou PostgreSQL) aplicando o padrão DAO/Repository (AtivoRepository / ChamadoRepository) com suporte completo às operações de CRUD (salvar(), buscarPorId(), listarTodos(), atualizar() e deletar()) e prevenção contra SQL Injection.

A Evolução do Projeto no Semestre

O sistema será desenvolvido gradualmente durante as aulas:

    Modelagem Inicial e Memória RAM: Iniciaremos definindo a estrutura de atributos, construtores flexíveis, relatórios formatados e vinculação de objetos em memória RAM.

    Especialização e Abstração: Aplicaremos herança para especializar os ativos, criaremos contratos via interfaces e protegeremos a aplicação com blocos try/catch e exceções personalizadas.

    Gerenciamento e Persistência: Organizaremos os objetos usando coleções e genéricos. Nas aulas finais, realizaremos testes de gravação em arquivos locais antes de conectar o sistema ao banco de dados relacional real.

Workflow no Laboratório e Uso do GitHub

Como os notebooks do laboratório são compartilhados e rotativos, o Git e o GitHub serão nossas ferramentas obrigatórias de persistência contínua:

    No início de cada aula: Você ligará a máquina e baixará a versão mais recente do seu projeto com git clone ou git pull a partir do seu repositório techlab-inventory.

    Ao final de cada aula: Você salvará seu progresso executando a sequência git add ., git commit -m "..." e git push origin main.

Ao término do semestre, você terá no seu portfólio uma aplicação completa, robusta em arquitetura de software, conectada a um banco de dados e totalmente versionada no GitHub!