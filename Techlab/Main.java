// Classe principal para testar a funcionalidade da classe AtivoTI
package Techlab;

public class Main {
    public static void main(String[] args) {
        // Criando a primeira instância de AtivoTI na memória RAM
        AtivoTI servidor = new AtivoTI("1", "PAT-2026-001", "Dell PowerEdge R740", "Ativo");

        // Exibindo atributos usando Getters
        System.out.println("=== Ativo Cadastrado ===");
        System.out.println("Patrimônio: " + servidor.getCodigoPatrimonio());
        System.out.println("Modelo: " + servidor.getModelo());
        System.out.println("Status Inicial: " + servidor.getStatus());

        // Alterando o estado do objeto usando Setter
        servidor.setStatus("Em Manutenção");
        System.out.println("Novo Status: " + servidor.getStatus());
    }
}
