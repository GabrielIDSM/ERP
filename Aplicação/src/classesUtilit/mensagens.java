package classesUtilit;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabri
 */
public abstract class mensagens {
    public static void exibeMensagemSucesso(){
        JOptionPane.showMessageDialog(null, 
                "Foi possível efetuar a operação!", 
                "Operação realizada", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    public static void exibeMensagemFracasso(){
        JOptionPane.showMessageDialog(null, 
                "Ocorreu um erro ao efetuar a operação", 
                "Operação não realizada", 
                JOptionPane.ERROR_MESSAGE);
    }
    public static void exibeMensagemFracasso(String mensagem){
        JOptionPane.showMessageDialog(null, 
                mensagem, 
                "Operação não realizada", 
                JOptionPane.ERROR_MESSAGE);
    }
    public static void exibeInformacoesCad(){
        String mensagem = "";
        mensagem += "Login e Senha devem ser criados respeitando as seguintes regras: \n\n";
        mensagem += "1. O login deve conter de 6 à 20 caracteres\n";
        mensagem += "2. A senha deve conter de 6 à 20 caracteres\n";
        mensagem += "3. Login e Senha só podem conter letras e números\n";
        mensagem += "4. O Sistema não permite logins iguais";
        JOptionPane.showMessageDialog(null, 
                mensagem, 
                "Cadastro", 
                JOptionPane.INFORMATION_MESSAGE);
    }
}
