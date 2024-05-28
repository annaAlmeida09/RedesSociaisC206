import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;
import java.util.Scanner;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    Scanner input = new Scanner(System.in);
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no GooglePlus!");
    }
    @Override
    public void fazStreaming() {
        int answer = 1;
        while(answer!= 0){
            System.out.println("Iniciando Streaming...");
            System.out.println("Digite 0 quando quiser finalizar.");
            answer = input.nextInt();
        }
    }

    @Override
    public void compartilhar() {
        System.out.println("Voce compartilhou um post no Facebook!");
    }
}
