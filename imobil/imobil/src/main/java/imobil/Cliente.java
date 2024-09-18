package imobil;

import java.io.File;
import java.io.FileWriter;

public class Cliente {
    private String nome;
    private String email;
    private float CPF;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public float getCpf(){
       return CPF;
    }
    public void setCpf(){
        this.CPF = CPF;
    }
    public String salvar(){
        File fl = new File("C:\\Users\\Antonio\\Documents\\dados\\clientes.txt");

        if (!fl.exists()) {
            try{
                fl.createNewFile();  
                FileWriter writer = new FileWriter(fl);

                writer.write(this.nome + " ; " + this.email + " ; " + this.CPF );
                writer.flush();
                writer.close();
            }
            catch(Exception ex){
                   return "Erro no sistema. MSG: " + ex.getMessage();
            }
        }
   return "Sucesso ao cadastrar";
    }
}
