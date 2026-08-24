// Classe que representa um ativo de tecnologia da informação
package Techlab;

public class AtivoTI {
    // Atributos privados (Encapsulamento)
    private int id;
    private String codigoPatrimonio;
    private String modelo;
    private String status;

    // Construtor
    public AtivoTI(int id, String codigoPatrimonio, String modelo, String status) {
        this.id = id;
        this.codigoPatrimonio = codigoPatrimonio;
        this.modelo = modelo;
        this.status = status;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoPatrimonio() {
        return codigoPatrimonio;
    }

    public void setCodigoPatrimonio(String codigoPatrimonio) {
        this.codigoPatrimonio = codigoPatrimonio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}