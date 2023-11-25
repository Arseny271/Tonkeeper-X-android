package com.tonkeeper.core.history.list.item

data class HistoryActionItem(
    val iconURL: String? = null,
    val action: Action,
    val title: String,
    val subtitle: String,
    val timestamp: Long,
    val comment: String? = null,
    val value: String,
    val value2: String = "",
    val nftImageURL: String? = null,
    val nftTitle: String? = null,
    val nftCollection: String? = null,
    val tokenCode: String? = null,
    val date: String,
): HistoryItem(TYPE_ACTION) {

    enum class Action {
        Received, Send, CallContract, NftReceived, NftSend, Swap
    }

    val hasNft: Boolean
        get() = nftImageURL != null && nftTitle != null && nftCollection != null
}