package blur.node.api26

import blur.node.NodeCompat

internal abstract class BaseNode(name: String): NodeCompat(name) {

    abstract fun release()
}