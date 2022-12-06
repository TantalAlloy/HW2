package socialmediapost;

import java.time.LocalDate;
import java.time.LocalTime;

public class Post {
    public int postID;
    public String nickname;
    public LocalDate publicationDate;
    public LocalTime publicationTime;
    public String message;
    public int likes;
    public int dislikes;
    public int comments;

    public Post() {
    }

    public static Post createPost() {
        return new Post();
    }

    public void repost(int postID) {
        System.out.println("have to repost");
    }

    public void promote(int postID) {
        System.out.println("have to promote");
    }
}
