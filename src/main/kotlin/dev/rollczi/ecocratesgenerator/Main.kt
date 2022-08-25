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
        Reward("sculk_shrieker",
            "Sculkowe wrzeszczydło",
            "sculk__shrieker 1",
            13,
            15),
        Reward("beacon",
            "Beacon",
            "beacon 1",
            7,
            10),
        Reward("nether_star",
            "Netherowa gwiazda",
            "nether_star 1",
            14,
            14),
        Reward("enchanted_book_mending",
            "Zaczarowana książka ~ Mending",
            "enchanted_book 1 mending:1",
            8,
            11),
        Reward("experience_bottle",
            "Zaklęta butelka",
            "experience_bottle 32",
            13,
            14),
        Reward("enchanted_golden_apple",
            "Zaklęte złote jabłko",
            "enchanted_golden_apple 1",
            6,
            8),
        Reward("trident",
            "Trójząb",
            "trident 1 loyalty:3 riptide:3",
            8,
            9),
        Reward("netherite_ingot",
            "Sztabka netherytu",
            "netherite_ingot 1",
            10,
            12),
        Reward("axolotl_bucket",
            "Wiadro z axolotlem",
            "axolotl_bucket 1",
            26,
            28),
        Reward("diamond",
            "Diament",
            "diamond 5",
            16,
            17),
        Reward("golden_apple",
            "Złote jabłko",
            "golden_apple 1",
            22,
            25),
        Reward("name_tag",
            "Znacznik",
            "name_tag 1",
            26,
            29),
        Reward("totem_of_undying",
            "Totem nieśmiertelności",
            "totem_of_undying 1",
            19,
            22),
        Reward("shulker_box",
            "Shulkerowa skrzynia",
            "shulker_box 1",
            28,
            30),
        Reward("ender_chest",
            "Skrzynia Endu",
            "ender_chest 1",
            30,
            33),
        Reward("clock_admin",
            "<gradient:#B38D02:#DAB602><b>Zegarek Admina",
            "clock 1 name:<gradient:#B38D02:#DAB602><b>Zegarek Admina",
            33,
            35),
        Reward("ametyst_shard",
            "<gradient:#B144C8><b>Smoczna Runa",
            "ametyst_shard 1 sharpness:10 protection:10 name:<gradient:#B144C8><b>Smocza Runa",
            25,
            28),
        Reward("redstone",
            "<gradient:#B0181C><b>Smocza Krew",
            "redstone 32 protection:10 name:<gradient:#B0181C><b>Smocza Krew",
            30,
            33),
        Reward("end_rod_unicorn",
            "<gradient:#ff4dea:#33aaff><b>Róg Jednorożca",
            "end_rod 1 name:\"<gradient:#ff3dea:#33aaff><b>Róg Jednorożca\"",
            19,
            21),
        Reward("sing_goat_horn",
            "Kozi róg",
            "sing_goat_horn 1",
            38,
            41),
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


