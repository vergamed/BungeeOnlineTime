package lu.r3flexi0n.bungeeonlinetime.common.objects

import java.util.UUID

data class OnlineTime(@JvmField val uuid: UUID, @JvmField val name: String, @JvmField val time: Long)