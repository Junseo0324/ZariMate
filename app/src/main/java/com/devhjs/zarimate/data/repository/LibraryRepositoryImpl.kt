package com.devhjs.zarimate.data.repository

import com.devhjs.zarimate.BuildConfig
import com.devhjs.zarimate.data.remote.LibraryService
import com.devhjs.zarimate.domain.model.Library
import com.devhjs.zarimate.domain.repository.LibraryRepository
import javax.inject.Inject

class LibraryRepositoryImpl @Inject constructor(
    private val api: LibraryService
) : LibraryRepository {
    override suspend fun getLibraries(): Result<List<Library>> {
        return try {
            val response = api.getLibrarySeats(serviceKey = BuildConfig.LIBRARY_API_KEY)
            if (response.response.header.resultCode == "00") {
                val libraries = response.response.body.items.map { item ->
                    Library(
                        code = item.libraryCode,
                        name = item.libraryName,
                        readingRoomName = item.readingRoomName,
                        totalSeats = item.totalSeatCount,
                        usedSeats = item.usedSeatCount,
                        remainingSeats = item.remainingSeatCount,
                        openTime = item.openTime ?: "",
                        closeTime = item.closeTime ?: "",
                        address = item.address ?: "",
                        tel = item.tel ?: "",
                        latitude = item.latitude ?: 0.0,
                        longitude = item.longitude ?: 0.0
                    )
                }
                Result.success(libraries)
            } else {
                Result.failure(Exception(response.response.header.resultMsg))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
