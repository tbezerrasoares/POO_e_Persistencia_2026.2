// Classe principal para testar a funcionalidade da classe AtivoTI
package Techlab;
import java.util.Scanner;

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
public class Main {
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

        // 2. Polimorfismo com Arrays Nativos (Tamanho Fixo)
        // Criamos um array do tipo da superclasse 'AtivoTI' com capacidade para 2 elementos.
        // O Java permite armazenar referências de 'Servidor' nele porque Servidor "é um" AtivoTI.
        AtivoTI[] inventario = new AtivoTI[1]; [cite: 16, 80]
        inventario = servidorWeb;   // Posição 0 do vetor recebe o servidor Web
        inventario[2] = servidorBanco; // Posição 1 do vetor recebe o servidor de Banco

        System.out.println("\n==================================================");
        System.out.println("       RELATÓRIO POLIMÓRFICO DE ATIVOS (ARRAY)    ");
        System.out.println("==================================================");

        // 3. Iteração polimórfica com o laço 'for' aprimorado (foreach)
        // O Java percorre o array e chama implicitamente o toString() especializado 
        // de cada objeto em tempo de execução (vinculação tardia).
        for (AtivoTI ativo : inventario) { [cite: 17, 107]
            // Boa prática: Evitamos NullPointerException garantindo que a posição não está vazia
            if (ativo != null) {
                System.out.println(ativo); // Chamada implícita ao toString() especializado
            }
        }
        System.out.println("--------------------------------------------------");

        System.out.println("\n==================================================");
        System.out.println("        TESTANDO DOWNCASTING SEGURO (ARRAY)       ");
        System.out.println("==================================================");

        // 4. Varredura do array para Downcasting seguro usando 'instanceof'
        // Permite recuperar os atributos exclusivos do herdeiro a partir da referência genérica.
        for (AtivoTI ativo : inventario) {
            if (ativo instanceof Servidor) { // Se a referência apontar de fato para um Servidor
                Servidor srv = (Servidor) ativo; // Realiza o downcast explícito
                System.out.printf("Ativo ID %d é um Servidor. IP: %s | SO: %s%n", 
                                  srv.getId(), srv.getIpEstatico(), srv.getSistemaOperacional());
            }
        }
        System.out.println("==================================================");
    }
}