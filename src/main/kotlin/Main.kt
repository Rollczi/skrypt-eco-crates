fun main() {

    val rewards = listOf(
        Reward("dirt_id", "&aSuper Dirt", "dirt 1", 50, 10),
        Reward("dirt_id", "&aSuper Dirt", "dirt 1", 50, 10),
        Reward("dirt_id", "&aSuper Dirt", "dirt 1", 50, 10),
        Reward("dirt_id", "&aSuper Dirt", "dirt 1 mending:1 unbreaking:5 efficiency:5 name:\"<gradient:#4444aa:#111199><b>Mroczny Toporek Drwala\"", 50, 10),
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
""".trimIndent())

    }

    print("\nEND -----------------------------------------------------")
}


