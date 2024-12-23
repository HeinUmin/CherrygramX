package org.telegram.tgnet

import kotlin.coroutines.Continuation

/* loaded from: classes3.dex */
class ConnectionsManagerImpl{

    fun checkConnection(continuation: Continuation<*>): Any {
        return Unit
    }

    fun checkConnectionInstance(continuation: Continuation<*>): Any {
        return Unit
    }

    companion object {
        @JvmField
        val INSTANCE: ConnectionsManagerImpl = ConnectionsManagerImpl()
    }
}