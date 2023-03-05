package OOP_ALL.Lectures.Lecture_02.Ex006.Interface;

import OOP_ALL.Lectures.Lecture_02.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
