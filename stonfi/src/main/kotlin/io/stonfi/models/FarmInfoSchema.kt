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

package io.stonfi.models

import io.stonfi.models.FarmNftInfoSchema

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param minStakeDurationS Minimal stake duration seconds
 * @param minterAddress Address of the farm
 * @param nftInfos Farm NFT list
 * @param poolAddress Address of the pool
 * @param rewardTokenAddress Address of the reward token
 * @param status Minter status
 * @param apy Annual percentage yield
 */


data class FarmInfoSchema (

    /* Minimal stake duration seconds */
    @Json(name = "min_stake_duration_s")
    val minStakeDurationS: kotlin.String,

    /* Address of the farm */
    @Json(name = "minter_address")
    val minterAddress: kotlin.String,

    /* Farm NFT list */
    @Json(name = "nft_infos")
    val nftInfos: kotlin.collections.List<FarmNftInfoSchema>,

    /* Address of the pool */
    @Json(name = "pool_address")
    val poolAddress: kotlin.String,

    /* Address of the reward token */
    @Json(name = "reward_token_address")
    val rewardTokenAddress: kotlin.String,

    /* Minter status */
    @Json(name = "status")
    val status: kotlin.String,

    /* Annual percentage yield */
    @Json(name = "apy")
    val apy: kotlin.String? = null

)

