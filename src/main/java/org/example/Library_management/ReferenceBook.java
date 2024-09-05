package org.example.Library_management;

public class ReferenceBook extends Book{

    private String subject;

    public ReferenceBook(String title, String author, String ISBN, boolean isAvailable,String subject) {
        super(title, author, ISBN, isAvailable);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject:" + subject;
    }
}
