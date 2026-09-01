// Classe principal para testar a funcionalidade da classe AtivoTI
package Techlab;
import java.util.Scanner;

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

public class Main{
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
}
