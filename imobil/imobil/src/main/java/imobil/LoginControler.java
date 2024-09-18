package imobil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginControler{

    Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    @FXML
    private TextField TxtEmail;
    @FXML
    private TextField TxtSenha;
    @FXML
    private void Submit() throws IOException {
           Cliente.setEmail(TxtEmail.getText());
           Cliente.setCpf(Float.valueOf(TxtCpf.getText()));

           conn=Conexao.connectDB();
           String sql="SELECT*FROM usuarios WHERE Nome=? and Senha=?";
           try {
            pst=(PreparedStatement) conn.prepareStatement(sql);
            pst.setString(1, TxtEmail.getText());
            pst.setString(2, TxtSenha.getText());
            rs=pst.executeQuery();
             if (rs.next()) {
                System.out.println("Seja Bem vindo");
             }else{
                System.out.println("Senha ou Email incorreto");
             }
           } catch (Exception e) {
            
           }
    }
}
