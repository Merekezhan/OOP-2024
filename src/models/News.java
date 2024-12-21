package models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import researchWorks.ResearchPaper;

public class News {
    private String title;
    private String content;
    private String topic;
    private List<String> comments;
    private static List<News> newsList = new ArrayList<>(); // Общий список новостей
    private boolean pinned;

    public News(String title, String content, String topic) {
        this.title = title;
        this.content = content;
        this.topic = topic;
        this.pinned = "Research".equalsIgnoreCase(topic);
        this.comments = new ArrayList<>();
    }

    // Добавление комментария
    public void addComment(String comment) {
        comments.add(comment);
    }

    // Геттеры и сеттеры
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
        this.pinned = "Research".equalsIgnoreCase(topic);
    }

    public boolean isPinned() {
        return pinned;
    }

    public List<String> getComments() {
        return new ArrayList<>(comments);
    }

    // Добавление новости в общий список с приоритетом
    public static void addNews(News news) {
        newsList.add(news);
        prioritizeNews();
    }

    // Метод для сортировки новостей по приоритету (закреплённые темы идут первыми)
    private static void prioritizeNews() {
        newsList.sort(Comparator.comparing(News::isPinned).reversed());
    }

    // Создание и добавление новости о публикации научной статьи
    public static void announcePaper(ResearchPaper paper) {
        News announcement = new News(
                "New Research Paper Published!",
                String.format(
                        "A new research paper titled '%s' has been published in the journal '%s'.",
                        paper.getTitle(),
                        paper.getJournal()
                ),
                "Research"
        );
        addNews(announcement);
    }

    // Получение всех новостей
    public static List<News> getAllNews() {
        return new ArrayList<>(newsList);
    }

    @Override
    public String toString() {
        return String.format(
                "Title: %s\nTopic: %s\nContent: %s\nComments: %s",
                title,
                topic,
                content,
                comments.isEmpty() ? "No comments yet." : comments
        );
    }
}
