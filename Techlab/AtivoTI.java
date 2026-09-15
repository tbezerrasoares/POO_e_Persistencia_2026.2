// Classe que representa um ativo de tecnologia da informação
package Techlab;

//Aula 02
/*public class AtivoTI {
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
}*/

//Aul04
/*public class AtivoTI{
    private int id;
    private String patrimonio;
    private String modelo;
    private String status;

    //Construtor Completo
    public AtivoTI(int id, String patrimonio, String modelo, String status){
        this.id = id;
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.status = status;
    }

    //Construtor Sobrecarregado
    //Se o status não for informado, assume "Ativo" por padrão
    public AtivoTI(int id, String patrimonio, String modelo){
        this(id, patrimonio, modelo, "Ativo");
    }

    //Getters e Stters
    public String getStatus() {return this.status;}
    public void setStatus(String status) {this.status = status;}
    public String getModelo(){return this.modelo;}

    //Representação textual do obejto AtivoTI
    @Override
    public String toString(){
        return "Ativo TI [ID: "+this.id+" | Pat: "+this.patrimonio+
                " | Modelo: "+this.modelo+" | Sattus: "+this.status+"]";
    }
}*/

//Aula 05
/*public class AtivoTI{
    //Atributos
    protected int id;
    protected String patrimonio;
    protected String modelo;
    protected String status;

    //Construtor
    public AtivoTI(int id, String patrimonio, String modelo, String status){
        this.id = id;
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.status = status;
    }

    //Getters e Setters
    public int getId() {return id;}
    public String getPatrimonio(){return patrimonio;}
    public String getModelo(){return modelo;}
    public String getStatus(){return status;}
    public void setPatrimonio(String patrimonio){this.patrimonio = patrimonio;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setStatus(String status){this.status = status;}

    //Representação
    @Override
    public String toString(){
        return "ID: " +id+ " | Pat: " +patrimonio+ " | Modelo: " +modelo+ " | Status: " +status;
    }
}*/

//Aula 6
public abstract class AtivoTI{
    //Atributos
    private int id;
    private String patrimonio;
    private String modelo;
    private String status;

    //Construtor
    public AtivoTI(int id, String patrimonio, String modelo, String status){
        this.id = id;
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.status = status;
    }

    //Getters e Setters
    public int getId() {return id;}
    public String getPatrimonio(){return patrimonio;}
    public String getModelo(){return modelo;}
    public String getStatus(){return status;}
    public void setPatrimonio(String patrimonio){this.patrimonio = patrimonio;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setStatus(String status){this.status = status;}

    //Representação
    @Override
    public String toString(){
        return "ID: " +id+ " | Pat: " +patrimonio+ " | Modelo: " +modelo+ " | Status: " +status;
    }

    //Método Abstrato
    public abstract double calcularCustoManutencaoMensal();
}