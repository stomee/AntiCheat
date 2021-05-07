package stomee.anticheat

import net.minestom.server.extensions.Extension;
import world.cepi.kstom.Manager

class AntiCheat : Extension() {

    override fun initialize() {

        Manager.connection.addPlayerInitialization(::hook)

        logger.info("[AntiCheat] has been enabled!")
    }

    override fun terminate() {

        Manager.connection.removePlayerInitialization(::hook)

        logger.info("[AntiCheat] has been disabled!")
    }

}