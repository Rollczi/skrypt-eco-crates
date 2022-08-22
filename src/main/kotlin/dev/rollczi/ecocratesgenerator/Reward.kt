package dev.rollczi.ecocratesgenerator

data class Reward(val id: String, val name: String, val item: String, val chance: Int, val displayChance: Int) {

    fun getRarity(): Rarity {
        return getRarity(chance)
    }

}