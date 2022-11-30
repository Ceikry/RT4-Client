package SlayerTrackerPlugin
    
import plugin.Plugin
import plugin.annotations.PluginMeta
import plugin.api.API
import plugin.api.FontColor
import plugin.api.FontType
import plugin.api.TextModifier
import rt4.Sprite
import java.awt.Color
import java.lang.Exception

@PluginMeta(
    author = "Ceikry",
    description = "Draws a simple slayer task tracker onto the screen if one is active.",
    version = 1.0
)
class plugin : Plugin() {
    val boxColor = 6116423
    val posX = 5
    val posY = 30
    val boxWidth = 90
    val boxHeight = 30
    val boxOpacity = 160
    val textX = 65
    val textY = 50
    val spriteX = 7
    val spriteY = 30

    var slayerTaskID = -1
    var slayerTaskAmount = 0
    var curSprite: Sprite? = null

    override fun Draw(deltaTime: Long) {
        if (slayerTaskAmount == 0 || slayerTaskID == -1) return

        API.FillRect(posX, posY, boxWidth, boxHeight, boxColor, boxOpacity)
        curSprite?.render(spriteX, spriteY)
        API.DrawText(
            FontType.SMALL,
            FontColor.fromColor(Color.WHITE),
            TextModifier.LEFT,
            slayerTaskAmount.toString(),
            textX,
            textY
        )
    }

    override fun OnVarpUpdate(id: Int, value: Int) {
        if (id == 2502) {
            slayerTaskID = value and 0x7F
            slayerTaskAmount = (value shr 7) and 0xFF
            setSprite()
        }
    }

    override fun OnLogout() {
        slayerTaskID = -1
        slayerTaskAmount = 0
        curSprite = null
    }

    private fun setSprite() {
        try {
            val itemId: Int = when (slayerTaskID) {
                0 -> 4144
                1 -> 4149
                2 -> 560
                3 -> 10176
                4 -> 4135
                5 -> 4139
                6 -> 14072
                7 -> 948
                8 -> 12189
                9 -> 3098
                10 -> 1747
                11 -> 4141
                12 -> 1751
                13 -> 11047
                14 -> 2349
                15 -> 9008
                16 -> 4521
                17 -> 4134
                18 -> 8900
                19 -> 4520
                20 -> 4137
                21 -> 1739
                22 -> 7982
                23 -> 10149
                24 -> 532
                25 -> 8141
                26 -> 6637
                27 -> 6695
                28 -> 8132
                29 -> 4145
                30 -> 7500
                31 -> 1422
                33 -> 1387
                34 -> 9011
                35 -> 4147
                36 -> 552
                37 -> 6722
                38 -> 10998
                39 -> 9016
                40 -> 2402
                41 -> 1753
                42 -> 7050
                43 -> 8137
                44 -> 12570
                45 -> 8133
                46 -> 4671
                47 -> 4671
                48 -> 1159
                49 -> 4140
                50 -> 2351
                51 -> 4142
                52 -> 7778
                53 -> 8139
                54 -> 4146
                55 -> 2402
                56 -> 2359
                57 -> 12079
                58 -> 12201
                59 -> 12570
                60 -> 4148
                61 -> 4818
                62 -> 6107
                63 -> 4138
                64 -> 14074
                65 -> 4136
                66 -> 6297
                67 -> 10634
                68 -> 553
                69 -> 8135
                70 -> 11732
                71 -> 10284
                72 -> 13923
                73 -> 2353
                74 -> 8136
                75 -> 4143
                76 -> 6528
                77 -> 10109
                78 -> 1403
                79 -> 2952
                80 -> 958
                81 -> 7594
                89 -> 6811
                else -> -1
            }

            val sprite = API.GetObjSprite(itemId, 1, false, 1, 1)

            curSprite = sprite
        } catch (ignored: Exception){}
    }

    //Check the source of plugin.Plugin for more methods you can override! Happy hacking! <3
    //There are also many methods to aid in plugin development in plugin.api.API
}
