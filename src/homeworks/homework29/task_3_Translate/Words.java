package homeworks.homework29.task_3_Translate;

import java.util.Objects;

public class Words {

    private String word;
    private String translation;

    public Words(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    @Override
    public String toString() {
        return "Words{" +
                "word='" + word + '\'' +
                ", translation='" + translation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Words words)) return false;
        return Objects.equals(getWord(), words.getWord()) && Objects.equals(getTranslation(), words.getTranslation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWord(), getTranslation());
    }
}