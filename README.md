# Lista 08 - Java

## Modularização (Métodos) em Java

### Exercício 1 - Classe Pedido

Crie uma classe `Pedido` com um método para inserir produtos. Cada pedido pode armazenar vários produtos, e cada produto possui quantidade e preço.

**Requisitos:**
- Permitir a inserção de vários produtos.
- Solicitar ao usuário, pelo teclado, quantos produtos deseja informar.
- Implementar um método para calcular e retornar o valor total do pedido.
- Imprimir o total do pedido na tela pelo método `main`.

---

### Exercício 2 - Classe Calculadora

Crie uma classe `Calculadora` com métodos para realizar operações matemáticas básicas.

**Métodos:**

| Método | Descrição |
|---|---|
| `somar(double a, double b)` | Retorna a soma de `a` e `b`. |
| `subtrair(double a, double b)` | Retorna a subtração de `a` por `b`. |
| `multiplicar(double a, double b)` | Retorna o produto de `a` e `b`. |
| `dividir(double a, double b)` | Retorna a divisão de `a` por `b`, verificando se `b` é diferente de zero. |
| `potencia(double base, int expoente)` | Retorna a base elevada ao expoente. |

**Requisito adicional:**

Crie uma classe `Main` com o método `main` para testar os métodos da classe `Calculadora`.

---

### Exercício 3 - Classe Funcionario

Crie uma classe `Funcionario` com os seguintes atributos privados:

| Atributo | Tipo |
|---|---|
| `nome` | `String` |
| `cargo` | `String` |
| `salario` | `double` |

**Métodos:**

| Método | Descrição |
|---|---|
| `exibirInformacoes()` | Imprime os dados do funcionário. |
| `promover(String novoCargo, double aumento)` | Altera o cargo e aumenta o salário. |
| `reajustarSalario(double percentual)` | Aplica um reajuste percentual ao salário. |
| `demitir()` | Zera o salário e altera o cargo para `"Desligado"`. |

**Requisito adicional:**

Crie uma classe `Main` com o método `main` para instanciar objetos da classe `Funcionario` e testar seus métodos.
