package com.tonapps.tonkeeper.ui.adapter.holder.pools

import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.isVisible
import com.tonapps.tonkeeper.api.percentage
import com.tonapps.tonkeeper.helper.Coin2
import com.tonapps.tonkeeper.ui.adapter.Item
import com.tonapps.tonkeeperx.R
import com.tonapps.uikit.color.accentGreenColor
import com.tonapps.uikit.list.BaseListHolder
import com.tonapps.uikit.list.ListCell
import com.tonapps.wallet.api.entity.TokenEntity
import com.tonapps.wallet.localization.Localization
import uikit.drawable.CellBackgroundDrawable
import uikit.extensions.dp
import uikit.extensions.drawable
import uikit.widget.RadioButtonView

class HolderPoolImplementation(
    parent: ViewGroup,
) : BaseListHolder<Item.PoolImplementation>(parent, R.layout.holder_pool_implementation) {


    private val titleView = findViewById<AppCompatTextView>(R.id.title)
    private val descriptionView = findViewById<AppCompatTextView>(R.id.description)
    private val labelView = findViewById<AppCompatTextView>(R.id.label)
    private val iconView = findViewById<AppCompatImageView>(R.id.icon)
    private val arrowView = findViewById<AppCompatImageView>(R.id.next)
    private val radioView = findViewById<RadioButtonView>(R.id.radio)

    init {
        labelView.background = CellBackgroundDrawable.create(
            context,
            ListCell.Position.SINGLE,
            (context.accentGreenColor and 0x29FFFFFF),
            4f.dp
        )
        radioView.isClickable = false
        radioView.isEnabled = false
    }

    override fun onBind(item: Item.PoolImplementation) {
        itemView.background = item.position.drawable(context, radius = 18f.dp)

        titleView.text = item.name
        descriptionView.lineHeight = 20.dp
        descriptionView.text = context.getString(
            Localization.staking_pool_description,
            Coin2.fromNano(item.minStakeNano.toString())?.toString(TokenEntity.TON.decimals) + " " + TokenEntity.TON.symbol,
            item.maxApy.percentage
        )

        labelView.isVisible = item.isMaxApy

        iconView.clipToOutline = true
        iconView.setImageResource(item.iconRes)

        arrowView.isVisible = item.poolsCount > 1
        radioView.isVisible = !arrowView.isVisible
        radioView.checked = item.isChecked

        itemView.setOnClickListener {
            item.onClickListener?.invoke()
        }
    }
}