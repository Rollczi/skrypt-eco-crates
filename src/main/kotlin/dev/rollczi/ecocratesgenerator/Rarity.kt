package dev.rollczi.ecocratesgenerator

enum class Rarity(val min: Int, val max: Int, val displayName: String) {
    COMMON(66, 100, "Zwykły"),
    UNCOMMON(36, 65, "Niepospolity"),
    RARE(16, 35, "Rzadki"),
    EPIC(6, 15, "Epicki"),
    LEGENDARY(0, 5, "Legendarny");


}

fun getRarity(chance: Int): Rarity {
    for (rarity in Rarity.values()) {
        if (chance >= rarity.min && chance <= rarity.max) {
            return rarity
        }
    }
    throw IllegalArgumentException("Invalid chance: $chance")
}
