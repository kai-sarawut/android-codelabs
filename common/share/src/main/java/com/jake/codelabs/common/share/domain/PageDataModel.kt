package com.jake.codelabs.common.share.domain

import android.os.Parcelable
import kotlinx.android.parcel.IgnoredOnParcel
import kotlinx.android.parcel.Parcelize

@Parcelize
class PageDataModel(val id: String, val title: String) : Parcelable {
    @IgnoredOnParcel
    var description: String = ""
}