package dev.rollczi.ecocratesgenerator

enum class Rarity(val min: Int, val max: Int, val displayName: String) {
    COMMON(81, 100, "Zwykły"),
    UNCOMMON(61, 80, "Niepospolity"),
    RARE(31, 60, "Rzadki"),
    EPIC(11, 30, "Epicki"),
    LEGENDARY(0, 10, "Legendarny");


}

fun getRarity(chance: Int): Rarity {
    for (rarity in Rarity.values()) {
        if (chance >= rarity.min && chance <= rarity.max) {
            return rarity
        }
    }
    throw IllegalArgumentException("Invalid chance: $chance")
}
