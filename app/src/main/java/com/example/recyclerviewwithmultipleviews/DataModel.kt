package com.example.recyclerviewwithmultipleviews

sealed class DataModel {

    data class Header(
        var title: String = ""
    ): DataModel()

    data class Items(
        var title: String = "",
        var description: String = ""
    ): DataModel()



}