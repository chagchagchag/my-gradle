package io.study.mygradle.sub_project_1

import com.google.gson.JsonObject
import io.study.mygradle.common.CommonEntity

class SubProject1User (
    private val id : String
) : CommonEntity(
    id = id,
    json = JsonObject()
) {
}