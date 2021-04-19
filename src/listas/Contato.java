package listas;

public class Contato {
    private String nome ;
    private String email;
    private String whats;

    public Contato(String nome, String email, String whats){
        this.nome = nome;
        this.email = email;
        this.whats = whats;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhats() {
        return whats;
    }

    public void setWhats(String whats) {
        this.whats = whats;
    }
    @Override
    public String toString(){
        return nome + " : "+ email + " whatsApp:  "+ whats;
    }
}
