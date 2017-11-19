package net.divineit.uzzal.SpringBoot_JPA_Hibernet_basic.repository;


import net.divineit.uzzal.SpringBoot_JPA_Hibernet_basic.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> getSimillerNote(String tag);
    List<Note> getId();
}
