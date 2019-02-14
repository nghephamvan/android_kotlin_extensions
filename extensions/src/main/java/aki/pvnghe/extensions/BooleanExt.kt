package aki.pvnghe.extensions

import aki.pvnghe.extensions.constant.Constant

fun Boolean.toStringKey() : String {
    return if (this) {
        Constant.ENABLE_KEY
    } else {
        Constant.DISABLE_KEY
    }
}

fun Boolean.toStringNumber() : String {
    return if (this) "1" else "0"
}