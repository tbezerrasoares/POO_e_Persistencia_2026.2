package Techlab;

public class Servidor extends AtivoTI{
    private String ipEstatico;
    private String sistemaOperacional;
    private int memoriaRam;

    public Servidor(int id, String patrimonio, String modelo, String status, String ipEstatico
        , String sistemaOperacional, int memoriaRam){
                super(id, patrimonio, modelo, status);
                this.ipEstatico = ipEstatico;
                this.sistemaOperacional = sistemaOperacional;
                this.memoriaRam = memoriaRam;
            }
    
    @Override
    public String toString(){
        return "[Servidor] " +super.toString()+ " | IP: " +ipEstatico+ " | SO: " +sistemaOperacional;
    }

}
