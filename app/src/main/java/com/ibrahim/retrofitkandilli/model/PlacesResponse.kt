package com.ibrahim.retrofitkandilli.model

import com.google.gson.annotations.SerializedName

data class PlacesResponse(

	@field:SerializedName("result")
	val result: List<PlaceItem?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)