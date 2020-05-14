package classesUtilit;

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
        
        return false;
    }
    
    private static boolean verificaContaFuncionario(String login, String senha){
        
        return false;
    }
}
