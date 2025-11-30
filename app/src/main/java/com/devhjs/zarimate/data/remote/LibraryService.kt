package com.devhjs.zarimate.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface LibraryService {
    @GET("rlt_rdrm_info") // 실제 엔드포인트 확인 필요
    suspend fun getLibrarySeats(
        @Query("serviceKey") serviceKey: String,
        @Query("pageNo") pageNo: Int = 1,
        @Query("numOfRows") numOfRows: Int = 100,
        @Query("type") type: String = "json"
    ): LibraryResponse
}
