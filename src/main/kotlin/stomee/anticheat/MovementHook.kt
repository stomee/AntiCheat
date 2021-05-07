package stomee.anticheat

import net.minestom.server.event.player.PlayerMoveEvent

fun onMove(event: PlayerMoveEvent) = with(event) {
    if (player.position.getDistance(newPosition) >= 10)
        event.isCancelled = true
}