package com.SourceIT.Lesson_05;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class LLElement<T> {
    private T value;
    LLElement<T> linkToNext;
    LLElement<T> linkToPrev;

    //конструктор
    public LLElement(T value, LLElement<T> linkToNext, LLElement<T> linkToPrev) {
        this.value = value;
        this.linkToNext = linkToNext;
        this.linkToPrev = linkToPrev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public LLElement<T> getLinkToNext() {
        return linkToNext;
    }

    public void setLinkToNext(LLElement<T> linkToNext) {
        this.linkToNext = linkToNext;
    }

    public LLElement<T> getLinkToPrev() {
        return linkToPrev;
    }

    public void setLinkToPrev(LLElement<T> linkToPrev) {
        this.linkToPrev = linkToPrev;
    }
}
