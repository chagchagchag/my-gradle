package io.study.mygradle.common

import com.google.gson.Gson
import com.google.gson.JsonObject

open class CommonEntity (
    private val id : String,
    private val json: JsonObject = JsonObject()
){
    init {
        json.addProperty("msg", "hello")
        json.addProperty("age", "21")
        println("jsonStr = ${Gson().toJson(json)}")
    }
}