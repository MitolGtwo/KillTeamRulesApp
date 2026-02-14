package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.GameMap
import com.example.killteamruleset.ui.model.MapCategory
import com.example.killteamruleset.R

object MapsRepository {
    private val maps = mutableListOf<GameMap>()

    fun byCategory(category: MapCategory): List<GameMap> {
        maps.clear()
        maps.addAll(allMaps.filter { it.category == category })
        return maps
    }
}

    val allMaps = listOf(

        // ─── VOLKUS ───
        GameMap(
            id = "volkus_1",
            category = MapCategory.VOLKUS,
            number = 1,
            title = "Volkus Map 1",
            image = R.drawable.map_vk_1
        ),
        GameMap(
            id = "volkus_2",
            category = MapCategory.VOLKUS,
            number = 2,
            title = "Volkus Map 2",
            image = R.drawable.map_vk_2
        ),
        GameMap(
            id = "volkus_3",
            category = MapCategory.VOLKUS,
            number = 3,
            title = "Volkus Map 3",
            image = R.drawable.map_vk_3
        ),
        GameMap(
            id = "volkus_4",
            category = MapCategory.VOLKUS,
            number = 4,
            title = "Volkus Map 4",
            image = R.drawable.map_vk_4
        ),
        GameMap(
            id = "volkus_5",
            category = MapCategory.VOLKUS,
            number = 5,
            title = "Volkus Map 5",
            image = R.drawable.map_vk_5
        ),
        GameMap(
            id = "volkus_6",
            category = MapCategory.VOLKUS,
            number = 6,
            title = "Volkus Map 6",
            image = R.drawable.map_vk_6
        ),
        GameMap(
            id = "volkus_7",
            category = MapCategory.VOLKUS,
            number = 7,
            title = "Volkus Map 7",
            image = R.drawable.map_vk_7
        ),
        GameMap(
            id = "volkus_8",
            category = MapCategory.VOLKUS,
            number = 8,
            title = "Volkus Map 8",
            image = R.drawable.map_vk_8
        ),
        GameMap(
            id = "volkus_9",
            category = MapCategory.VOLKUS,
            number = 9,
            title = "Volkus Map 9",
            image = R.drawable.map_vk_9
        ),
        GameMap(
            id = "volkus_10",
            category = MapCategory.VOLKUS,
            number = 10,
            title = "Volkus Map 10",
            image = R.drawable.map_vk_10
        ),
        GameMap(
            id = "volkus_11",
            category = MapCategory.VOLKUS,
            number = 11,
            title = "Volkus Map 11",
            image = R.drawable.map_vk_11
        ),
        GameMap(
            id = "volkus_12",
            category = MapCategory.VOLKUS,
            number = 12,
            title = "Volkus Map 12",
            image = R.drawable.map_vk_12
        ),
        GameMap(
            id = "itd_1",
            category = MapCategory.INTO_THE_DARK,
            number = 1,
            title = "Into the Oscurito Map 1",
            image = R.drawable.map_itd_1
        ),
        GameMap(
            id = "itd_2",
            category = MapCategory.INTO_THE_DARK,
            number = 2,
            title = "Into the Oscurito Map 2",
            image = R.drawable.map_itd_2
        ),
        GameMap(
            id = "itd_3",
            category = MapCategory.INTO_THE_DARK,
            number = 3,
            title = "Into the Oscurito Map 3",
            image = R.drawable.map_itd_3
        ),
        GameMap(
            id = "itd_4",
            category = MapCategory.INTO_THE_DARK,
            number = 4,
            title = "Into the Oscurito Map 4",
            image = R.drawable.map_itd_4
        ),
        GameMap(
            id = "itd_5",
            category = MapCategory.INTO_THE_DARK,
            number = 5,
            title = "Into the Oscurito Map 5",
            image = R.drawable.map_itd_5
        ),
        GameMap(
            id = "itd_6",
            category = MapCategory.INTO_THE_DARK,
            number = 6,
            title = "Into the Oscurito Map 6",
            image = R.drawable.map_itd_6
        ),
        GameMap(
            id = "tw_1",
            category = MapCategory.TOMB_WORLD,
            number = 1,
            title = "Tombo World Map 1",
            image = R.drawable.map_tw_1
        ),
        GameMap(
            id = "tw_2",
            category = MapCategory.TOMB_WORLD,
            number = 2,
            title = "Tombo World Map 2",
            image = R.drawable.map_tw_2
        ),
        GameMap(
            id = "tw_3",
            category = MapCategory.TOMB_WORLD,
            number = 3,
            title = "Tombo World Map 3",
            image = R.drawable.map_tw_3
        ),
        GameMap(
            id = "tw_4",
            category = MapCategory.TOMB_WORLD,
            number = 4,
            title = "Tombo World Map 4",
            image = R.drawable.map_tw_4
        ),
        GameMap(
            id = "tw_5",
            category = MapCategory.TOMB_WORLD,
            number = 5,
            title = "Tombo World Map 5",
            image = R.drawable.map_tw_5
        ),
        GameMap(
            id = "tw_6",
            category = MapCategory.TOMB_WORLD,
            number = 6,
            title = "Tombo World Map 6",
            image = R.drawable.map_tw_6
        )
    )





