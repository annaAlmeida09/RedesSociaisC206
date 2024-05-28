import excecoes.*;
public class Main {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        Instagram instagram = new Instagram();
        GooglePlus googlePlus = new GooglePlus();

        facebook.senha = "12345";
        instagram.senha = "123";
        twitter.senha = "1234";
        googlePlus.senha = "123456";


        facebook.numAmigos = 100;
        twitter.numAmigos = 50;
        instagram.numAmigos = 3000;
        googlePlus.numAmigos = 10;

        RedeSocial[] redesDoUsuario = new RedeSocial[3];
        redesDoUsuario[0] = instagram;
        redesDoUsuario[1] = twitter;
        redesDoUsuario[2] = facebook;
        Usuario usuario = new Usuario(redesDoUsuario);

        usuario.setNome("Anna");
        usuario.setEmail("almeida.annaclara@outlook.com");

        try{
            ((GooglePlus) usuario.getRedes()[0]).fazStreaming();
            usuario.getRedes()[0].postarVideo();
            usuario.getRedes()[0].curtirPublicacao();

            ((Twitter)usuario.getRedes()[1]).compartilhar();
            usuario.getRedes()[1].postarFoto();
            usuario.getRedes()[1].postarComentario();
        }
        catch (Unchecked e){
            e.printStackTrace();
        }
    }
}