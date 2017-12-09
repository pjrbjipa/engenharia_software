/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regrasDeNegocio;

/**
 *
 * @author 66546125234
 */
public class Agendamento {
    private int idRegistro; //número do Registro
    private String data;
    private String tituloCompromisso;
    private String descricaoDoCompromisso;
    private boolean situacaoCompromisso = true; 

    public int getIdRegistro() {
        return idRegistro;
    }
    
    public String getIdRegistroStr(){
        return String.valueOf(this.idRegistro);
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTituloCompromisso() {
        return tituloCompromisso;
    }

    public void setTituloCompromisso(String tituloCompromisso) {
        this.tituloCompromisso = tituloCompromisso;
    }

    public String getDescricaoDoCompromisso() {
        return descricaoDoCompromisso;
    }

    public void setDescricaoDoCompromisso(String descricaoDoCompromisso) {
        this.descricaoDoCompromisso = descricaoDoCompromisso;
    }

    public boolean getSituacaoCompromisso() {
        boolean situacao = false;
        String str = String.valueOf(situacao);
        String sts = situacao +"Agendamento Conculuido";
        return situacao;
    }
    

   
    
    
    public void setSituacaoCompromisso(boolean situacaoCompromisso) {
        this.situacaoCompromisso = situacaoCompromisso;
    }



    
    public String getSituacao(){
        String situacao = "Localizado";
        return situacao;
    }
    
    
    
    
    
}
