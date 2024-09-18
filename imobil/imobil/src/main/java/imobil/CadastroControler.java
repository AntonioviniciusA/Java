package imobil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CadastroControler {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

    @FXML
    private TextField TxtNome;
    @FXML
    private TextField TxtEmail;
    @FXML
    private TextField TxtCpf;
    @FXML
    private TextField TxtSenha;
    
    @FXML
    private void Submit() throws IOException {
           Cliente cliente = new Cliente();

           cliente.setNome(TxtNome.getText());
           cliente.setEmail(TxtEmail.getText());
           cliente.setCpf(Float.valueOf(TxtCpf.getText()));

           conn=Conexao.connectDB();
           String sql="SELECT*FROM usuarios WHERE Nome=? and Senha=?";
    }
}