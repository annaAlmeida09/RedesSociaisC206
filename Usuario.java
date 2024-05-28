import java.util.Collections;
import java.util.HashSet;
public class Usuario {
    private String nome;
    private String email;

    HashSet<RedeSocial> redesDoUsuario;
    public Usuario(RedeSocial[] redes){
        this.redesDoUsuario = new HashSet<>();
        Collections.addAll(this.redesDoUsuario, redes);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RedeSocial[] getRedes(){
        return this.redesDoUsuario.toArray(new RedeSocial[0]);
    }
}
