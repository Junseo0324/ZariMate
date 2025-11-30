package com.devhjs.zarimate.data.remote

import com.google.gson.annotations.SerializedName

data class LibraryResponse(
    @SerializedName("response")
    val response: ResponseData
)

data class ResponseData(
    @SerializedName("header")
    val header: Header,
    @SerializedName("body")
    val body: Body
)

data class Header(
    @SerializedName("resultCode")
    val resultCode: String,
    @SerializedName("resultMsg")
    val resultMsg: String
)

data class Body(
    @SerializedName("items")
    val items: List<LibraryItem>,
    @SerializedName("totalCount")
    val totalCount: Int,
    @SerializedName("pageNo")
    val pageNo: Int,
    @SerializedName("numOfRows")
    val numOfRows: Int
)

data class LibraryItem(
    @SerializedName("lbrryCd")
    val libraryCode: String,
    @SerializedName("lbrryNm")
    val libraryName: String,
    @SerializedName("clsurlNm")
    val readingRoomName: String, // 열람실 명
    @SerializedName("totSeatCnt")
    val totalSeatCount: Int,
    @SerializedName("useSeatCnt")
    val usedSeatCount: Int,
    @SerializedName("remndrSeatCnt")
    val remainingSeatCount: Int,
    @SerializedName("opnTime")
    val openTime: String?,
    @SerializedName("clsTime")
    val closeTime: String?,
    @SerializedName("addr")
    val address: String?,
    @SerializedName("tel")
    val tel: String?,
    @SerializedName("lat")
    val latitude: Double?,
    @SerializedName("lot")
    val longitude: Double?
)
