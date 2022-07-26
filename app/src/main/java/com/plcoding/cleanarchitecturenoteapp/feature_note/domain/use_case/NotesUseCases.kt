package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.use_case

data class NotesUseCases(
    val getNotes: GetNotes,
    val addNote: AddNote,
    val deleteNote: DeleteNote,
    val getNote: GetNote
)
