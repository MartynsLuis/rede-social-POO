public class Main {
    
    public static void main(String [] args){
        MessagePost postmensagem = new MessagePost("ronaldo","mensagem 1");
        PhotoPost postfoto = new PhotoPost("radrigo","peixe","um peixe");

        NewsFeed feednews = new NewsFeed();

        feednews.addPost(postmensagem);
        feednews.addPost(postfoto);

        feednews.show();
    }
}
