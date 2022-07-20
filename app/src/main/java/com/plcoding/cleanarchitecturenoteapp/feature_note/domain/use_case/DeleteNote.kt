package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.repository.NotesRepository

class DeleteNote(
    private val notesRepository: NotesRepository
) {

    suspend operator fun invoke(note: Note) = notesRepository.deleteNote(note)
}
