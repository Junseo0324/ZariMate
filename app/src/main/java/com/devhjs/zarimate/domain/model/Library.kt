package com.devhjs.zarimate.domain.model

data class Library(
    val code: String,
    val name: String,
    val readingRoomName: String,
    val totalSeats: Int,
    val usedSeats: Int,
    val remainingSeats: Int,
    val openTime: String,
    val closeTime: String,
    val address: String,
    val tel: String,
    val latitude: Double,
    val longitude: Double
) {
    val occupancyRate: Int
        get() = if (totalSeats > 0) ((usedSeats.toDouble() / totalSeats) * 100).toInt() else 0

    val status: SeatStatus
        get() = when {
            remainingSeats == 0 -> SeatStatus.FULL
            occupancyRate >= 90 -> SeatStatus.CROWDED
            occupancyRate >= 70 -> SeatStatus.NORMAL
            else -> SeatStatus.PLENTY
        }
}

enum class SeatStatus {
    PLENTY, // 여유
    NORMAL, // 보통
    CROWDED, // 혼잡
    FULL    // 만석
}
