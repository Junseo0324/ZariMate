package com.devhjs.zarimate.domain.repository

import com.devhjs.zarimate.domain.model.Library

interface LibraryRepository {
    suspend fun getLibraries(): Result<List<Library>>
}
