// Classe principal para testar a funcionalidade da classe AtivoTI
package Techlab;
//import java.util.Scanner;

//Aula 02
/*public class Main {
    public static void main(String[] args) {
        // Criando a primeira instância de AtivoTI na memória RAM
        AtivoTI servidor = new AtivoTI(1, "PAT-2026-001", "Dell PowerEdge R740", "Ativo");

        // Exibindo atributos usando Getters
        System.out.println("=== Ativo Cadastrado ===");
        System.out.println("Patrimônio: " + servidor.getCodigoPatrimonio());
        System.out.println("Modelo: " + servidor.getModelo());
        System.out.println("Status Inicial: " + servidor.getStatus());

        // Alterando o estado do objeto usando Setter
        servidor.setStatus("Em Manutenção");
        System.out.println("Novo Status: " + servidor.getStatus());
    }
}*/

//Aula 03
/*public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Cadastro de AtivoTI ===");
        System.out.print("Digite o ID do ativo: ");
        int idAtivo = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer
        System.out.print("Digite o código de patrimônio: ");
        String codigoPatrimonio = leitor.nextLine();
        System.out.print("Informe o modelo do ativo: ");
        String modelo = leitor.nextLine();
        System.out.print("Informe o status do ativo: ");
        String status = leitor.nextLine();

        AtivoTI equipamento = new AtivoTI(idAtivo, codigoPatrimonio, modelo, status);

        System.out.println("\n=== Ativo Cadastrado Chamado ===");
        System.out.print("ID do Chamado de Suporte: ");
        int idChamado = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer
        System.out.print("Descrição do Chamado: ");
        String descricaoChamado = leitor.nextLine();
        
        ChamadoSuporte chamado = new ChamadoSuporte(idChamado, descricaoChamado, equipamento);

        System.out.println("\n=== Status inicial do Equipamento ===");
        System.out.println("Status do Equipamento: " + chamado.getAtivoRelacionado().getStatus());

        System.out.print("Digite o novo status para o equipamento (ex: Em Manutencao): ");
        String novoStatus = leitor.nextLine();

        chamado.getAtivoRelacionado().setStatus(novoStatus);

        System.out.println("\n=== Verificação de Integridade em RAM ===");
        System.out.println("Status no objeto 'equipamento': " + equipamento.getStatus());
        System.out.println("Status via objeto 'chamado': " + chamado.getAtivoRelacionado().getStatus());

        leitor.close();
    }
}*/

//Aula 04
/*public class Main{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== Cadastro de AtivoTI Simplificado ===");
        System.out.print("Digite o ID do ativo: ");
        int idAtivo = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer
        System.out.print("Digite o código de patrimônio: ");
        String codigoPatrimonio = leitor.nextLine();
        System.out.print("Informe o modelo do ativo: ");
        String modelo = leitor.nextLine();

        AtivoTI equipamento = new AtivoTI(idAtivo, codigoPatrimonio, modelo);

        System.out.println("\n=== Ativo Cadastrado Chamado ===");
        System.out.print("ID do Chamado de Suporte: ");
        int idChamado = leitor.nextInt();
        leitor.nextLine(); // Limpar o buffer
        System.out.print("Descrição do Chamado: ");
        String descricaoChamado = leitor.nextLine();
        System.out.print("Prioridade (Alta/Media/Baixa): ");
        String prioridade = leitor.nextLine();

        ChamadoSuporte chamado = new ChamadoSuporte(idChamado, descricaoChamado, prioridade, equipamento);

        System.out.println("\n=== Relatorio do Sistema ===");
        System.out.println(chamado);

        leitor.close();
    }
}*/

//Aula 05
/*public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   TECHLAB INVENTORY - TESTE DE HERANÇA (AULA 5)  ");
        System.out.println("==================================================\n");

        System.out.println("[RAM] Instanciando objetos especializados no Heap...");
        
        // 1. Instanciamos apenas objetos da subclasse Servidor (com dados diferentes) [cite: 64, 211]
        Servidor servidorWeb = new Servidor(
            1, 
            "PAT-2026-001", 
            "Dell PowerEdge R740", 
            "Ativo", 
            "192.168.1.100", 
            "Ubuntu Server 22.04 LTS"
        );

        Servidor servidorBanco = new Servidor(
            2, 
            "PAT-2026-003", 
            "HP ProLiant DL360", 
            "Em Manutenção", 
            "192.168.1.150", 
            "Windows Server 2022"
        );

       System.out.println(servidorWeb);
       System.out.println(servidorBanco);
    } 
}*/

//Aula 6
public class Main {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" TECHLAB INVENTORY - ABSTRAÇÃO E INTERFACES (AULA 6) ");
        System.out.println("==================================================\n");

        // ----------------------------------------------------------------- 
        // 1. DEMONSTRAÇÃO DE ABSTRAÇÃO (Tentativa de Instanciação Direta) 
        // ----------------------------------------------------------------- 
        // A linha abaixo causará um ERRO DE COMPILAÇÃO se descomprometida: 
        // AtivoTI ativoGenerico = new AtivoTI(0, "PAT-000", "Generico", "Ativo"); 
        // Motivo: 'AtivoTI' é abstrata e não pode ser instanciada diretamente no Heap! 
        System.out.println("[REGRA DE NEGÓCIO] 'AtivoTI' é uma classe abstrata e não pode usar 'new'.\n");

        // ----------------------------------------------------------------- 
        // 2. INSTANCIAÇÃO DE SUBCLASSES CONCRETAS 
        // ----------------------------------------------------------------- 
        System.out.println("[RAM] Instanciando objetos concretos especializados no Heap...");

        // Instanciamos objetos da subclasse concreta 'Servidor' 
        Servidor servidorWeb = new Servidor(
            1, 
            "PAT-2026-001", 
            "Dell PowerEdge R740", 
            "Ativo", 
            "192.168.1.100", 
            "Ubuntu Server 22.04 LTS",
            128
        );

        Servidor servidorBanco = new Servidor(
            2, 
            "PAT-2026-003", 
            "HP ProLiant DL360", 
            "Em Manutenção", 
            "192.168.1.150", 
            "Windows Server 2022",
            64
        );

        // ----------------------------------------------------------------- 
        // 3. RELATÓRIO POLIMÓRFICO DE CUSTOS (Usando Classe Abstrata) 
        // ----------------------------------------------------------------- 
        System.out.println("\n==================================================");
        System.out.println(" RELATÓRIO DE CUSTOS DE MANUTENÇÃO (ABSTRAÇÃO) ");
        System.out.println("==================================================");

        // Correção da inicialização do array para evitar erros de compilação
        AtivoTI[] inventario = new AtivoTI[2]; 
        inventario[0] = servidorWeb; 
        inventario[1] = servidorBanco;

        double custoTotalEmpresa = 0.0;

        for (AtivoTI ativo : inventario) {
            if (ativo != null) {
                // Impressão polimórfica (toString) 
                System.out.println(ativo);

                // Invocação do MÉTODOS ABSTRATO implementado obrigatoriamente na subclasse 
                double custoAtivo = ativo.calcularCustoManutencaoMensal();
                custoTotalEmpresa += custoAtivo;

                System.out.printf(" └─> Custo Estimado de Manutenção: R$ %.2f%n%n", custoAtivo);
            }
        }

        System.out.printf("CUSTO TOTAL DE MANUTENÇÃO MENSAL: R$ %.2f%n", custoTotalEmpresa);
        System.out.println("--------------------------------------------------");

        // ----------------------------------------------------------------- 
        // 4. USO DE INTERFACES E CONTRATOS (INotificavel) 
        // ----------------------------------------------------------------- 
        System.out.println("\n==================================================");
        System.out.println(" DISPARO DE ALERTAS (INTERFACE INotificavel) ");
        System.out.println("==================================================");

        // Instanciamos um ChamadoSuporte que se associa a um ativo 
        ChamadoSuporte chamadoCritico = new ChamadoSuporte(
            101, 
            "Falha de Hardware no Servidor de Banco de Dados", 
            "Alta",
            servidorBanco
        );

        // Polimorfismo de Interface: Tratamos o objeto pela capacidade da Interface INotificavel 
        INotificavel canalNotificacao = chamadoCritico;

        // Disparamos a mensagem garantida pelo contrato da interface 
        canalNotificacao.enviarAlerta("Superaquecimento detectado no processador do Servidor!");
        System.out.println("================================================--");
    }
}
