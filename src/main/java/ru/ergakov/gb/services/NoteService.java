package ru.ergakov.gb.services;

import ru.ergakov.gb.models.Note;

import java.util.List;


/**
 * Интерфейс сервиса заметок
 */
public interface NoteService {
    List<Note> getAllNotes();
    Note createNote(Note note);
    Note getNoteById(Long id);
    Note updateNote(Long id, String changeHeading, String changeContent);
    void deleteNote(Long id);

}
