package excecoes;
import java.io.IOException;

public class Checked extends IOException {
    public Checked(String message){
        super(message);
    }
}
