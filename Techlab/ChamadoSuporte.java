package Techlab;

public class ChamadoSuporte{
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
}
