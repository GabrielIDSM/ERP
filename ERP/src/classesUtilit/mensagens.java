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
}
