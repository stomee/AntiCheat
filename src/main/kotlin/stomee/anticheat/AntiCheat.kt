package stomee.anticheat

import net.minestom.server.extensions.Extension;

class AntiCheat : Extension() {

    override fun initialize() {
        logger.info("[AntiCheat] has been enabled!")
    }

    override fun terminate() {
        logger.info("[AntiCheat] has been disabled!")
    }

}