package com.example.mobillab.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

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
@Parcelize
data class Location(
        val name: String? = null,
        val url: String? = null
) : Parcelable

/**
 *
 * @param name
 * @param url
 */
@JsonClass(generateAdapter = true)
@Parcelize
data class Origin(
        val name: String? = null,
        val url: String? = null
):Parcelable



/**
 *
 * @param id
 * @param name
 * @param status
 * @param species
 * @param type
 * @param origin
 * @param location
 * @param image
 */
@JsonClass(generateAdapter = true)
@Parcelize
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
) : Parcelable {
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


