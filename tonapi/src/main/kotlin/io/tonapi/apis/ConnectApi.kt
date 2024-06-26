/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.tonapi.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import io.tonapi.models.AccountInfoByStateInit
import io.tonapi.models.GetAccountInfoByStateInitRequest
import io.tonapi.models.GetBlockchainBlockDefaultResponse
import io.tonapi.models.GetTonConnectPayload200Response

import com.squareup.moshi.Json

import io.tonapi.infrastructure.ApiClient
import io.tonapi.infrastructure.ApiResponse
import io.tonapi.infrastructure.ClientException
import io.tonapi.infrastructure.ClientError
import io.tonapi.infrastructure.ServerException
import io.tonapi.infrastructure.ServerError
import io.tonapi.infrastructure.MultiValueMap
import io.tonapi.infrastructure.PartConfig
import io.tonapi.infrastructure.RequestConfig
import io.tonapi.infrastructure.RequestMethod
import io.tonapi.infrastructure.ResponseType
import io.tonapi.infrastructure.Success
import io.tonapi.infrastructure.toMultiValue

class ConnectApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://tonapi.io")
        }
    }

    /**
     * 
     * Get account info by state init
     * @param getAccountInfoByStateInitRequest Data that is expected
     * @return AccountInfoByStateInit
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getAccountInfoByStateInit(getAccountInfoByStateInitRequest: GetAccountInfoByStateInitRequest) : AccountInfoByStateInit {
        val localVarResponse = getAccountInfoByStateInitWithHttpInfo(getAccountInfoByStateInitRequest = getAccountInfoByStateInitRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AccountInfoByStateInit
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get account info by state init
     * @param getAccountInfoByStateInitRequest Data that is expected
     * @return ApiResponse<AccountInfoByStateInit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getAccountInfoByStateInitWithHttpInfo(getAccountInfoByStateInitRequest: GetAccountInfoByStateInitRequest) : ApiResponse<AccountInfoByStateInit?> {
        val localVariableConfig = getAccountInfoByStateInitRequestConfig(getAccountInfoByStateInitRequest = getAccountInfoByStateInitRequest)

        return request<GetAccountInfoByStateInitRequest, AccountInfoByStateInit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getAccountInfoByStateInit
     *
     * @param getAccountInfoByStateInitRequest Data that is expected
     * @return RequestConfig
     */
    fun getAccountInfoByStateInitRequestConfig(getAccountInfoByStateInitRequest: GetAccountInfoByStateInitRequest) : RequestConfig<GetAccountInfoByStateInitRequest> {
        val localVariableBody = getAccountInfoByStateInitRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/v2/tonconnect/stateinit",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }

    /**
     * 
     * Get a payload for further token receipt
     * @return GetTonConnectPayload200Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun getTonConnectPayload() : GetTonConnectPayload200Response {
        val localVarResponse = getTonConnectPayloadWithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GetTonConnectPayload200Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * 
     * Get a payload for further token receipt
     * @return ApiResponse<GetTonConnectPayload200Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun getTonConnectPayloadWithHttpInfo() : ApiResponse<GetTonConnectPayload200Response?> {
        val localVariableConfig = getTonConnectPayloadRequestConfig()

        return request<Unit, GetTonConnectPayload200Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation getTonConnectPayload
     *
     * @return RequestConfig
     */
    fun getTonConnectPayloadRequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/v2/tonconnect/payload",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
