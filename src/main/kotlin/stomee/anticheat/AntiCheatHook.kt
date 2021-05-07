package stomee.anticheat

import net.minestom.server.entity.Player
import world.cepi.kstom.addEventCallback

fun hook(player: Player) {
    player.addEventCallback(::onMove)
}