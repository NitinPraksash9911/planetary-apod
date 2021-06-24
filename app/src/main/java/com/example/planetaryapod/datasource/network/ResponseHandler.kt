package com.example.planetaryapod.datasource.network

import com.example.planetaryapod.arch.Result
import retrofit2.Response

/**
 * Abstract ResponseHandler class with error handling
 */
abstract class ResponseHandler {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Result<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                if (body != null) return Result.success(
                    data = body
                )
            }
            return Result.error(
                " ${response.code()} ${response.message()}"
            )
        } catch (e: Exception) {
            return Result.error(e.message ?: e.toString())
        }
    }

}

