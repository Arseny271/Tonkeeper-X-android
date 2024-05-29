package com.tonapps.tonkeeper.extensions

import android.content.Context
import androidx.annotation.ColorInt
import androidx.annotation.StringRes
import com.tonapps.tonkeeper.fragment.camera.CameraFragment
import com.tonapps.tonkeeper.fragment.fiat.FiatScreen
import com.tonapps.tonkeeper.fragment.send.SendScreen
import com.tonapps.tonkeeper.fragment.staking.deposit.DepositScreen
import com.tonapps.tonkeeper.fragment.swap.SwapAmountScreen
import com.tonapps.tonkeeper.ui.screen.root.RootActivity
import com.tonapps.uikit.color.backgroundContentTintColor
import com.tonapps.wallet.localization.Localization
import uikit.extensions.findFragment
import uikit.navigation.Navigation

fun Navigation.toast(@StringRes resId: Int) {
    val context = this as? Context ?: return
    toast(context.getString(resId), false, context.backgroundContentTintColor)
}

fun Navigation.toast(message: String, @ColorInt color: Int) {
    toast(message, false, color)
}

fun Navigation.toast(message: String) {
    val context = this as? Context ?: return
    toast(message, false, context.backgroundContentTintColor)
}

fun Navigation.toastLoading(loading: Boolean) {
    val context = this as? Context ?: return
    toast(context.getString(Localization.loading), loading, context.backgroundContentTintColor)
}

fun Navigation.openCamera() {
    add(CameraFragment.newInstance())
}

fun Navigation.sendCoin(
    address: String? = null,
    text: String? = null,
    amount: Float = 0f,
    jettonAddress: String? = null
) {
    if (this !is RootActivity) return

    val currentFragment = supportFragmentManager.findFragment<SendScreen>()
    if (currentFragment is SendScreen) {
        currentFragment.forceSetAddress(address)
        currentFragment.forceSetComment(text)
        currentFragment.forceSetAmount(amount)
        currentFragment.forceSetJetton(jettonAddress)
    } else {
        add(SendScreen.newInstance(address, text, amount, jettonAddress))
    }
}

fun Navigation.fiat() {
    if (this !is RootActivity) return

    val currentFragment = supportFragmentManager.findFragment<FiatScreen>()
    if (currentFragment is FiatScreen) {

    } else {
        add(FiatScreen.newInstance())
    }
}

fun Navigation.swap() {
    if (this !is RootActivity) return

    val currentFragment = supportFragmentManager.findFragment<SwapAmountScreen>()
    if (currentFragment is SwapAmountScreen) {

    } else {
        add(SwapAmountScreen.newInstance())
    }
}

fun Navigation.stake() {
    if (this !is RootActivity) return

    val currentFragment = supportFragmentManager.findFragment<DepositScreen>()
    if (currentFragment is DepositScreen) {

    } else {
        add(DepositScreen.newInstance())
    }
}