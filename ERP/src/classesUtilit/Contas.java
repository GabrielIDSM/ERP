package classesUtilit;

import java.util.ArrayList;
import java.util.List;
import model.bean.Conta;
import model.dao.ContaDAO;

public abstract class Contas {
    //0 = Dono da empresa /1 = Funcionário / -1 = Erro
    public static int retornaTipoDeConta(String login, char[] arraySenha){
        String senha = "";
        if (arraySenha != null)
            for (int i = 0; i < arraySenha.length; i++) {
                senha += arraySenha[i];
            }
        if(verificaContaDono(login, senha)) return 0;
        else if(verificaContaFuncionario(login, senha)) return 1;
        else return -1;
    }
    
    private static boolean verificaContaDono(String login, String senha){
        return login.equals("GabrielInacio") && senha.equals("UGR8YPLH7G");
    }
    
    private static boolean verificaContaFuncionario(String login, String senha){
        List<Conta> contas = new ArrayList<>();
        ContaDAO dao = new ContaDAO();
        contas = dao.read();
        if (contas != null)
            for (Conta c : contas) {
                if (login.equals(c.getLogin()) && senha.equals(c.getSenha())) {
                    return true;
                }
            }
        return false;
    }
    
    public static boolean isVendedor(String login){
        //Lista com os funcionários
        List<Conta> contas = new ArrayList<>();
        ContaDAO dao = new ContaDAO();
        contas = dao.read();
        //Verifica se o funcionarios é um vendedor
        if (contas != null) for (Conta c : contas){
            if(c.getLogin().equals(login)){
                if(c.getFuncao() == 0) return true;
            }
        }
        return false;
    }
}
