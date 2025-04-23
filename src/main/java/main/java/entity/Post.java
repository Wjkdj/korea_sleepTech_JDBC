package main.java.entity;

import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class Post {
    private int id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createAt;

    // 생성자 (Setter의 역할)
    public Post(int id, String title, String content, String author, LocalDateTime createAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createAt = createAt;
    }

    // 생성자 (DB 결정값을 제외한 필드 설정)
    public Post(String title, String content, String author) {
        // this: 해당 인스턴스 그 자체를 의미
        // this(): 해당 인스턴스의 생성자를 호출
        this(0, title, content, author, LocalDateTime.now());
    }

    // Getter
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getAuthor() { return author; }
    public LocalDateTime getCreateAt() { return createAt; }

    public void setTitle(String newTitle) {
    }
}
