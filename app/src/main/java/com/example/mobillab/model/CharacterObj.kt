package com.example.mobillab.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass

/**
 * Rick and Morty Characters API
 * MobilLab 3 - Hálózati hívások API leírása
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/**
 *
 * @param name
 * @param url
 */
@JsonClass(generateAdapter = true)
data class Location(
        val name: String? = null,
        val url: String? = null
) {

}

/**
 *
 * @param name
 * @param url
 */
@JsonClass(generateAdapter = true)
data class Origin(
        val name: String? = null,
        val url: String? = null
)



/**
 *
 * @param id
 * @param name
 * @param status
 * @param species
 * @param type
 * @param origin
 * @param location
 * @param imageUrl
 */
@JsonClass(generateAdapter = true)
@Entity
data class CharacterObj(
        @PrimaryKey(autoGenerate = false)
        val id: Int? = null,
        val name: String? = null,
        val status: String? = null,
        val species: String? = null,
        val type: String? = null,
        val origin: Origin? = null,
        val location: Location? = null,
        val image: String? = null
) {
        override fun toString(): String {
                val sb = StringBuilder()
                sb.append("class Character {\n")
                sb.append("    id: ").append((id)).append("\n")
                sb.append("    name: ").append((name)).append("\n")
                sb.append("    status: ").append((status)).append("\n")
                sb.append("    species: ").append((species)).append("\n")
                sb.append("    type: ").append((type)).append("\n")
                sb.append("    origin: ").append((origin)).append("\n")
                sb.append("    location: ").append((location)).append("\n")
                sb.append("    image: ").append((image)).append("\n")
                sb.append("}")
                return sb.toString()
        }
}

