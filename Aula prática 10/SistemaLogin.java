public class SistemaLogin {
    private String senhaSecreta;

    public SistemaLogin(){
        senhaSecreta= "123456";
    }
    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (!senha.equals(senhaSecreta)) {
            throw new LoginInvalidoException("Login ou senha incorretas");
        }
        System.out.println("Login realizado com sucesso!");
    }
}