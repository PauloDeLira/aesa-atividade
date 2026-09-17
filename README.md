# 🚀 Desafio Prático: CRUD com Estruturas de Dados em Java

Bem-vindo(a) ao desafio prático de **Estrutura de Dados**! O objetivo desta atividade é consolidar os conhecimentos teóricos por meio da escolha e aplicação de uma estrutura de dados, construção de uma classe com operações de CRUD (*Create, Read, Update, Delete*), desenvolvimento de uma mini aplicação funcional em Java e apresentação explicativa em vídeo.

---

## 📌 Sumário
1. [Objetivos do Desafio](#-objetivos-do-desafio)
2. [Estrutura do Desafio](#-estrutura-do-desafio)
   - [Parte 1: Escolha da Estrutura & Operações CRUD](#parte-1-escolha-da-estrutura--operações-crud)
   - [Parte 2: A Mini Aplicação](#parte-2-a-mini-aplicação)
   - [Parte 3: Apresentação em Vídeo](#parte-3-apresentação-em-vídeo)
3. [Sugestões de Temas](#-sugestões-de-temas-para-a-aplicação)
4. [Estrutura de Pastas Recomendada](#-estrutura-de-pastas-recomendada)
5. [Roteiro Obrigatório para o Vídeo](#-roteiro-obrigatório-para-o-vídeo)
6. [Critérios de Avaliação](#-critérios-de-avaliação)
7. [Instruções de Entrega](#-instruções-de-entrega)

---

## 🎯 Objetivos do Desafio

- **Selecionar e justificar a estrutura de dados** mais adequada para o domínio escolhido (analisando complexidade de tempo, consumo de memória e comportamento das operações).
- **Implementar uma classe de serviço/repositório** com as 4 operações de CRUD (*Create, Read, Update, Delete*) encapsulando a estrutura de dados escolhida.
- **Desenvolver uma mini aplicação interativa** que utilize essa classe para manipular registros de forma consistente.
- **Gravar um vídeo demonstrativo** explicando as decisões arquiteturais, o porquê da estrutura adotada e exibindo o sistema funcionando ao vivo.

---

## 🛠️ Estrutura do Desafio

O desafio está dividido em **três partes interdependentes**:

### Parte 1: Escolha da Estrutura & Operações CRUD
Neste desafio, **é permitido o uso das estruturas de dados nativas do Java** (do pacote `java.util` ou arrays primitivos), como:
- `ArrayList`
- `LinkedList`
- `HashMap` / `TreeMap` / `LinkedHashMap`
- `HashSet` / `TreeSet`
- `ArrayDeque` / `PriorityQueue`
- *Ou, caso prefira, você também pode implementar sua própria estrutura customizada.*

#### O que deve ser feito:
Crie uma classe dedicada (ex: `GerenciadorTarefas`, `ProdutoRepository`, `CatalogoLivros`) responsável por encapsular a estrutura de dados e fornecer os métodos de manipulação.

#### Métodos Obrigatórios do CRUD:
| Operação | Método Recomendado | Descrição |
| :--- | :--- | :--- |
| **Create** | `cadastrar(T elemento)` | Adiciona um novo elemento na estrutura, validando identificadores únicos (IDs) para evitar duplicidades indevidas. |
| **Read** | `buscarPorId(ID id)` e `listarTodos()` | Recupera um registro específico pelo seu identificador e fornece a listagem de todos os elementos armazenados. |
| **Update** | `atualizar(ID id, T novosDados)` | Localiza o elemento pelo identificador e atualiza seus dados, tratando o caso em que o registro não seja encontrado. |
| **Delete** | `remover(ID id)` | Remove o elemento da estrutura pelo seu ID, tratando a remoção e informando o sucesso ou falha da operação. |

> ⚠️ **Importante:** Trate os casos de borda: estrutura vazia, tentativa de exclusão ou busca de ID inexistente, validação de entradas inválidas, etc.

---

### Parte 2: A Mini Aplicação
Crie uma interface de console/terminal (utilizando `Scanner`) para interagir com o usuário e consumir a classe criada na Parte 1.

#### Requisitos da Aplicação:
1. **Classe de Modelo (Entidade):** Crie uma classe que represente a informação manipulada (ex: `Produto`, `Aluno`, `Tarefa`, `Contato`, `Livro`) contendo atributos relevantes e um identificador único (`id`, `codigo`, `matricula`, etc.).
2. **Menu Interativo:** Um menu em loop que ofereça ao usuário as seguintes opções:
   - `[1]` Cadastrar novo registro
   - `[2]` Listar todos os registros
   - `[3]` Buscar registro por ID
   - `[4]` Atualizar registro
   - `[5]` Remover registro
   - `[0]` Sair do programa
3. **Feedback ao Usuário:** Mensagens claras informando se a operação foi bem-sucedida ou apontando eventuais erros (ex: *"Registro cadastrado com sucesso!"*, *"Nenhum item encontrado com o ID informado."*).

---

### Parte 3: Apresentação em Vídeo
Você deve gravar a tela do seu computador com áudio nítido demonstrando o trabalho desenvolvido.

- **Duração recomendada:** Entre **5 e 10 minutos**.
- **Qualidade mínima:** **720p**, áudio limpo e boa legibilidade da tela/código.
- **Ferramentas sugeridas:** OBS Studio, Loom, Clipchamp ou gravador nativo do sistema operacional.

---

## 💡 Sugestões de Temas para a Aplicação

Sinta-se livre para escolher o tema que preferir:
- 📋 **Gerenciador de Tarefas:** Tarefas com título, prioridade, prazo e status.
- 📦 **Controle de Estoque:** Produtos com código, nome, categoria, preço e quantidade.
- 🎓 **Sistema Escolar/Acadêmico:** Alunos com matrícula, nome, curso e notas.
- 📚 **Catálogo de Livros:** Livros com ISBN, título, autor e ano de publicação.
- 🚗 **Gerenciador de Veículos:** Veículos com placa, modelo, marca e ano.

---

## 📂 Estrutura de Pastas Recomendada

Organize seu projeto em pacotes para manter o código limpo e modular:

```text
aesa-atividades/
├── README.md
└── src/
    └── br/edu/aesa/
        ├── model/              # Classes de modelo (ex: Produto.java, Tarefa.java)
        ├── service/            # Classe do CRUD encapsulando a estrutura de dados (ex: EstoqueService.java)
        └── app/                # Classe principal com o menu interativo (Main.java)
```

---

## 🎥 Roteiro Obrigatório para o Vídeo

O vídeo deve cobrir as seguintes etapas organizadas:

1. **Abertura e Identificação (aprox. 1 min):**
   - Nome completo do estudante, curso e disciplina.
   - Breve introdução do tema escolhido para a aplicação.

2. **Por que você escolheu essa estrutura de dados? (aprox. 1 a 2 min):**
   - Qual estrutura de dados foi utilizada (ex: `ArrayList`, `HashMap`, `LinkedList`, etc.)?
   - **Por que ela foi a melhor escolha para o seu cenário?** (ex: necessidade de busca rápida por ID $O(1)$ com `HashMap`, facilidade de ordenação ou iteração sequencial com `ArrayList`/`LinkedList`, etc.).
   - Quais as vantagens e eventuais desvantagens dessa escolha?

3. **Explicação do Código-Fonte (aprox. 2 a 3 min):**
   - Mostrar a classe de entidade (`Model`) e seus atributos.
   - Mostrar a classe responsável pelo CRUD e explicar como cada método manipula a estrutura de dados:
     - Como é feita a inserção e validação de duplicidade;
     - Como a busca e a listagem são executadas;
     - Como os dados são atualizados;
     - Como o item é localizado e excluído da estrutura.

4. **Demonstração Prática da Aplicação (aprox. 2 a 3 min):**
   - Executar o programa ao vivo.
   - **Cadastrar** ao menos 3 registros diferentes.
   - **Listar** todos os registros para confirmar que foram salvos.
   - **Buscar** um registro existente por ID e demonstrar o que acontece ao buscar um ID inexistente.
   - **Atualizar** um registro existente e listar novamente para comprovar a alteração.
   - **Remover** um registro e listar novamente para comprovar a exclusão.
   - Encerrar o programa utilizando a opção de saída do menu.

---

## 📊 Critérios de Avaliação

| Critério | Peso | O que será avaliado |
| :--- | :---: | :--- |
| **Domínio da Estrutura de Dados** | 15% | Escolha coerente da estrutura e clareza ao justificar o porquê de seu uso em relação ao problema. |
| **Implementação e Lógica do CRUD** | 25% | Funcionamento robusto das 4 operações, validações de ID e tratamento de casos limites (vazio, inexistente). |
| **Mini Aplicação e Usabilidade** | 15% | Menu interativo organizado, feedback claro nas operações e experiência no terminal. |
| **Qualidade da Apresentação em Vídeo** | 40% | Clareza na explicação técnica do código, boa didática e demonstração completa de todos os fluxos ao vivo. |
| **Organização do Código** | 5% | Boas práticas de orientação a objetos, separação de responsabilidades em pacotes e nomenclatura clara. |

---

## 📤 Instruções de Entrega

1. **Repositório Git:**
   - Realize commits durante o desenvolvimento do projeto.
   - Suba todo o código-fonte necessário para compilação e execução.

2. **Link do Vídeo:**
   - Publique o vídeo em uma plataforma acessível:
     - **YouTube** (como vídeo *Não Listado*);
     - **Google Drive** (com acesso liberado para *"Qualquer pessoa com o link"*);
     - **Loom** ou serviço similar.
   - Insira o link do vídeo gravado no topo deste `README.md` (no campo indicado abaixo) ou conforme orientação do professor no AVA:

```markdown
> 🔗 **Link da Apresentação em Vídeo:** [Insira o link aqui]
```

---

> 💡 *"Mais importante do que apenas fazer o código funcionar é saber explicar o porquê de cada escolha técnica feita durante o projeto."* **Bom trabalho!**
