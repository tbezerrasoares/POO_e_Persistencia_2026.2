package Techlab;

//Aula 03
/*public class ChamadoSuporte{
   private int id;
   private String descrição;
   private boolean aberto;
   private AtivoTI ativoRelacionado; 
    
   //Construtor
   public ChamadoSuporte(int id, String descrição, AtivoTI ativoRelacionado) {
       this.id = id;
       this.descrição = descrição;
       this.aberto = true;
       this.ativoRelacionado = ativoRelacionado;
    }

    public void fecharChamado(){
        this.aberto = false;
    }

    public AtivoTI getAtivoRelacionado(){
        return this.ativoRelacionado;
    }
}*/

//Aula 04
public class ChamadoSuporte{
    private int id;
    private String descricao;
    private String prioridade;
    private AtivoTI ativoRelacionado;

    public ChamadoSuporte(int id, String descricao, String prioridade, AtivoTI ativoRelacionado){
        this.id = id;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.ativoRelacionado = ativoRelacionado;
    }

    public AtivoTI getAtivoRelacionado(){
        return this.ativoRelacionado;
    }

    //Representação textual
    @Override
    public String toString(){
        return "------------------------------------\n" +
                "Chamado #" + this.id + "\n" +
                "Descrição: " + this.descricao + "\n" +
                "Prioridade: " + this.prioridade + "\n" +
                "Equipamento Relacionado: " + this.ativoRelacionado + "\n" +
                "------------------------------------";
    }
}