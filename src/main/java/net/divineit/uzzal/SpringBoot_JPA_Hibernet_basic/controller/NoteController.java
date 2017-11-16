package net.divineit.uzzal.SpringBoot_JPA_Hibernet_basic.controller;

import net.divineit.uzzal.SpringBoot_JPA_Hibernet_basic.model.Note;
import net.divineit.uzzal.SpringBoot_JPA_Hibernet_basic.repository.NoteRepository;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {

    @Autowired
    NoteRepository noteRepository;

    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Note creatNote(@Valid @RequestBody Note note){
        return noteRepository.save(note);
    }




}
