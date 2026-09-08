
## 1. INTRODUÇÃO E OBJETIVOS

Seja bem-vindo à base da sua jornada como desenvolvedor Java. Como Arquiteto de Currículo, estruturei este laboratório para reduzir a carga cognitiva, focando no que é essencial para construir sistemas robustos e profissionais. O domínio destes fundamentos é o que separa um codificador de um engenheiro de software capaz de aplicar **Encapsulamento** e lógica de negócio de alto nível.

Neste módulo, focaremos em quatro pilares:

- **🧩 Sintaxe Básica:** Regras de escrita e organização de código sob os padrões da JVM.
- **📦 Tipos Primitivos:** Gerenciamento eficiente de memória e capacidade de armazenamento.
- **⚖️ Tomada de Decisão:** Implementação de regras de negócio através de desvios lógicos manuais.
- **🔄 Automação:** Controle de fluxo e processamento de coleções através de laços de repetição.

Dominar esses conceitos é fundamental para entender como o Java transforma eletricidade em lógica. Antes de manipularmos grandes volumes de dados, precisamos compreender como o Java reserva cada byte de informação na memória.

## 2. DECLARAÇÃO DE VARIÁVEIS E TIPOS DE DADOS

Em Java, a tipagem é estática e forte. Isso significa que o computador reserva um espaço exato na memória para cada informação, garantindo segurança e performance.

|   |   |   |   |
|---|---|---|---|
|Tipo|Tamanho|Capacidade / Uso|Exemplo de Sintaxe|
|`int`|4 bytes|Inteiros de -2.147.483.648 a 2.147.483.647.|`int estoque = 50;`|
|`float`|4 bytes|Números reais (ponto flutuante) de precisão simples.|`float preco = 10.50f;`|
|`double`|8 bytes|Números reais de dupla precisão (padrão para decimais).|`double saldo = 1500.75;`|
|`String`|Variável|Classe (Objeto) que armazena sequências de texto.|`String titular = "João";`|

**⚠️ Alerta Técnico: O Sufixo 'f'** Por padrão, qualquer número decimal em Java é interpretado como `double` (8 bytes). Para armazenar um valor em uma variável `float` (4 bytes), você deve obrigatoriamente usar o sufixo **'f'** (ex: `2.5f`). Sem isso, o compilador impedirá a execução para evitar perda de precisão.

**Nota Didática:** Enquanto `int` e `float` são tipos primitivos que guardam valores diretamente, a `**String**` é uma Classe. Isso significa que variáveis do tipo String guardam uma **referência** (ponteiro) para o objeto na memória, um conceito essencial para o futuro estudo de **Encapsulamento**.

Uma vez que os dados estão armazenados, precisamos de operadores para transformá-los em informação útil.

## 3. OPERAÇÕES MATEMÁTICAS

Java utiliza operadores aritméticos padrão, seguindo a ordem de precedência matemática:

1. `**+**` **(Adição):** Soma valores ou concatena Strings.
2. `**-**` **(Subtração):** Diferença entre valores.
3. `*****` **(Multiplicação):** Produto de dois fatores.
4. `**/**` **(Divisão):** Quociente da operação.
5. `**%**` **(Resto):** Retorna o resíduo de uma divisão inteira (útil para verificar paridade).

### Atenção ao Truncamento e "Explicit Casting"

Se você dividir dois números inteiros (`int`), o Java descartará as casas decimais. Para evitar isso, utilizamos o **Casting Explícito**, forçando o compilador a promover um dos operandos.

```java
int totalItens = 5;
int divisores = 2;

// Errado: resultará em 2.0 (perda de informação)
float mediaErrada = totalItens / divisores; 

// Correto: Explicit Casting (Promoção de tipo)
float mediaCorreta = (float) totalItens / divisores; // Resultará em 2.5
```

Com os cálculos realizados, seu programa deve agora decidir qual caminho seguir com base nos resultados obtidos.

## 4. ESTRUTURAS CONDICIONAIS (TOMADA DE DECISÃO)

### 4.1 If-Else (Regras de Negócio Manuais)

O `if` avalia uma expressão booleana (`true` ou `false`). Em arquiteturas profissionais, evitamos funções de conveniência como `Math.abs()` para garantir que a lógica de validação seja explícita e manual.

```java
if (quantidadeDesejada <= quantidadeEstoque) {
    quantidadeEstoque -= quantidadeDesejada; //quantidadeEstoque = quantidadeEstoque - quantidadeDesejada;
    System.out.println("Venda realizada com sucesso!");
} else {
    System.out.println("Erro: Estoque insuficiente.");
}
```

### 4.2 Switch-Case (Seleção de Categorias)

Ideal para menus ou quando uma variável pode assumir valores discretos (como Enums ou códigos de categoria).

|   |   |
|---|---|
|Elemento|Função|
|`case`|Define o valor específico para comparação.|
|`break`|Interrompe a execução, evitando o efeito _falling-through_.|
|`default`|Bloco de segurança executado se nenhuma opção anterior coincidir.|

**Exemplo de Garantia:**

```java
switch (tipoProduto) {
    case 1: // Eletrônicos
        garantiaMeses = 24;
        break;
    case 2: // Vestuário
        garantiaMeses = 3;
        break;
    default:
        System.out.println("Categoria inválida.");
}
```

Além de decidir, o computador brilha na execução de tarefas repetitivas.

## 5. LAÇOS DE REPETIÇÃO (LOOPS)

Os loops permitem processar coleções de objetos ou manter sistemas ativos.

|   |   |   |   |
|---|---|---|---|
|Estrutura|Momento da Verificação|Melhor Uso|Exemplo de Projeto|
|`while`|Início (Pré-teste)|Fluxos sem fim definido.|Busca em base de dados.|
|`do-while`|Fim (Pós-teste)|Menus interativos (CLI).|Menu Principal do Sistema.|
|`for`|Início (Controle)|Iterar sobre Arrays/Listas.|Relatórios de Inventário.|

A estrutura do `for` é composta por: `(inicialização; condição; atualização)`. Já o `do-while` é a única estrutura que garante que o código rode **pelo menos uma vez** antes da primeira checagem.

## 6. EXEMPLO CONSOLIDADO (CÓDIGO COMPILÁVEL)

Este exemplo simula um sistema de controle de acesso simples, utilizando a classe `Scanner`.

```java
import java.util.Scanner;

public class LaboratorioIntroducao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n--- SISTEMA DE GESTÃO TECH ---");
            System.out.println("1. Validar Estoque");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt();
            
            /* 
             * PRO-TIP DIDÁTICO: Limpeza de Buffer
             * O método nextInt() lê apenas os dígitos, mas o caractere 'Enter' (\n) 
             * continua no buffer. Se não usarmos o nextLine() abaixo, o próximo 
             * input de texto seria "atropelado" pelo Enter residual.
             */
            leitor.nextLine(); 

            if (opcao == 1) {
                System.out.print("Quantidade atual em estoque: ");
                int estoque = leitor.nextInt();
                System.out.print("Quantidade para baixa: ");
                int pedido = leitor.nextInt();
                
                // Validação manual de regra de negócio
                if (pedido > 0 && pedido <= estoque) {
                    estoque -= pedido;
                    System.out.println("Baixa concluída. Novo estoque: " + estoque);
                } else {
                    System.out.println("Falha: Quantidade inválida ou insuficiente.");
                }
            }
        } while (opcao != 2);

        System.out.println("Encerrando sistema...");
        leitor.close();
    }
}
```

## 7. EXERCÍCIOS PRÁTICOS DE FIXAÇÃO

### Exercício 1: Gestão de Estoque (If-Else)

- **Entrada:** Receba o nome de um item e sua quantidade atual.
- **Processamento:** Solicite a quantidade de saída. Verifique manualmente (sem `Math.abs`) se há saldo suficiente.
- **Saída:** Exiba "Venda realizada" e o novo saldo, ou "Estoque insuficiente".

### Exercício 2: Calculadora de Garantia (Switch-Case)

- **Entrada:** Peça ao usuário para digitar o código do produto (1 para Eletrônicos, 2 para Vestuário, 3 para Móveis).
- **Processamento:** Use um `switch-case` para definir: 1 = 24 meses, 2 = 3 meses, 3 = 12 meses.
- **Saída:** Exiba o tempo de garantia correspondente. Envolva em um loop `do-while` para permitir várias consultas.

### Exercício 3: Relatório de Itens (Loop For)

- **Entrada:** Um número inteiro `N` que representa a quantidade de produtos a cadastrar.
- **Processamento:** Use um laço `for` para solicitar o preço de cada um dos `N` produtos.
- **Saída:** Ao final, exiba a soma total dos preços e a média aritmética (use **Explicit Casting** para o cálculo da média).

### 💡 Dicas de Sucesso

- **CamelCase:** Utilize `camelCase` para variáveis e métodos (ex: `saldoAtual`) e `UpperCamelCase` para classes (ex: `ContaBancaria`).
- **Indentação:** O código deve "respirar". Mantenha o alinhamento dentro das chaves para facilitar a manutenção.
- **Encapsulamento Próximo:** Lembre-se: em Java, protegemos nossos dados. Este é o primeiro passo para o Módulo de Objetos.