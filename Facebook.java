import Interfaces.*;
import java.util.Scanner;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento  {

    Scanner input = new Scanner(System.in);
    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Facebook!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Facebook!");
    }

    @Override
    public void fazStreaming() {
        int answer = 1;
        System.out.println("Iniciando Streaming...");
        while(answer!= 0){
            System.out.println("Digite 0 quando quiser finalizar.");
            answer = input.nextInt();
        }
    }

    @Override
    public void compartilhar() {
        System.out.println("Voce compartilhou um post no Facebook!");
    }
}
