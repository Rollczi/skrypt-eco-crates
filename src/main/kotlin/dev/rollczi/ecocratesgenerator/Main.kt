package dev.rollczi.ecocratesgenerator

fun main() {

    val rewards = listOf(
        Reward("netherite_chestplate_darkness",
            "<gradient:#031b5e:#41035e><b>Napierśnik Mrocznego Władcy",
            "netherite_chestplate 1 mending:1 unbreaking:3 fire_protection:4 thorns:3 name:\"<gradient:#031b5e:#41035e><b>Napierśnik Mrocznego Władcy\"",
            1,
            2),
        Reward("netherite_hemlet_darkness",
            "<gradient:#031b5e:#41035e><b>Hełm Mrocznego Władcy",
            "netherite_hemlet 1 mending:1 unbreaking:3 protection:4 respiration:3 aqua_affinity:1 thorns:3 name:\"<gradient:#031b5e:#41035e><b>Hełm Mrocznego Władcy\"",
            1,
            2),
        Reward("netherite_leggings_darkness",
            "<gradient:#031b5e:#41035e><b>Spodnie Mrocznego Władcy",
            "netherite_leggings 1 mending:1 unbreaking:3 projectile_protection:4 swift_sneak:3 thorns:3 name:\"<gradient:#031b5e:#41035e><b>Spodnie Mrocznego Władcy",
            1,
            2),
        Reward("netherite_boots_darkness",
            "<gradient:#031b5e:#41035e><b>Buty Mrocznego Władcy",
            "netherite_boots 1 mending:1 unbreaking:3 blast_protection:4 feather_falling:4 frost_walker:2 soul_speed:3 thorns:3 name:\"<gradient:#031b5e:#41035e><b>Buty Mrocznego Władcy\"",
            1,
            2),
        Reward("netherite_sword_darkness",
            "<gradient:#031b5e:#41035e><b>Miecz Mrocznego Władcy",
            "netherite_sword 1 mending:1 unbreaking:3 efficiency:5 sharpness:5 name:\"<gradient:#031b5e:#41035e><b>Miecz Mrocznego Władcy\"",
            1,
            3),
    )

    print("START -----------------------------------------------------\n")
    print("rewards:")

    for (reward in rewards) {
        print("""

  - id: ${reward.id}
    commands: [ ]
    items:
      - ${reward.item}
    messages: [ ]
    weight:
      permission-multipliers: false
      actual: ${reward.chance}
      display: ${reward.displayChance}
    max-wins: -1
    display:
      name: "${reward.name}"
      item: ${reward.item}
      lore:
        - "&7Szansa: &a%actual_chance%%"
        - "&7"
        - "&7${reward.getRarity().displayName}
""".trimIndent())

    }

    print("\nEND -----------------------------------------------------")
}


