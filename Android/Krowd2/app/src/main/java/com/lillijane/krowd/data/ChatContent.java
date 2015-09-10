package com.lillijane.krowd.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ChatContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<ChatItem> ITEMS = new ArrayList<ChatItem>();

    static {
        // Add 3 sample items.
        addItem(new ChatItem("Vattutsod: CRIT SPOTS=FIORA PASSIVE"));
        addItem(new ChatItem("Wixur10: VITAL SPOTS"));
        addItem(new ChatItem("HueghM: play diana jg"));
        addItem(new ChatItem("Wrborges: DUO WASEEEM"));
        addItem(new ChatItem("Knightgraywind: skål"));
        addItem(new ChatItem("Marzipanhiro: @Nightblue3 When he says spot, he means vital"));
        addItem(new ChatItem("Ak0or: @RickDead, nb3H"));
        addItem(new ChatItem("Ace814: ya"));
        addItem(new ChatItem("naticusss: TUE"));
        addItem(new ChatItem("Rossenboy: Leona Jungle"));
        addItem(new ChatItem("danne789: gött jobbat gubbar"));
        addItem(new ChatItem("Gustavbkn: SKÅÅÅÅÅÅÅÅÅÅL 4thewin"));
        addItem(new ChatItem("Thebickblacknipple: that sonnnggg"));
        addItem(new ChatItem("Takato_Hero: more farm for top pls"));
        addItem(new ChatItem("Deviantsoul: 1v1 me for worst fiora in league"));
        addItem(new ChatItem("spellvamprice: mystery gift urself u flamingo"));
        addItem(new ChatItem("Kallipowa: Jungle Zed"));
        addItem(new ChatItem("Eyalkaz: Bronze to diamond!!"));
        addItem(new ChatItem("Piffzz: Alex ich!"));
        addItem(new ChatItem("SeanSacred: Fiora isnt freelo. Just play Wukong, Pantheon, Irelia"));
        addItem(new ChatItem("K4yncnr: shyvana shyvana shyvana shyvana shyvana shyvana shyvana shyvana shyvana"));
        addItem(new ChatItem("DevveD: LOLO"));
        addItem(new ChatItem("2fancyomg: lucïøn junglë"));
        addItem(new ChatItem("Sbart92: Cmon italy against serbia"));
        addItem(new ChatItem("Solei13: BibleThump Help BibleThump Wassem BibleThump with BibleThump The BibleThump"));
        addItem(new ChatItem("Norwegianfapper: PLAY PROJECT YI B1TCHS"));
        addItem(new ChatItem("FreddePlays: REKTTT"));
        addItem(new ChatItem("Sbart92: ITALY-SERBIA EUROBASKET"));
        addItem(new ChatItem("Kappa123keepo123: Mid annie or Food Kappa"));
        addItem(new ChatItem("Katraskiller13: Kappa"));
        addItem(new ChatItem("Gangione: Ciaioo"));
        addItem(new ChatItem("Gangione: HeyGuys AthenaPMS"));
        addItem(new ChatItem("Cxthesituation: u paly again vs free lord xD"));
        addItem(new ChatItem("Fruktosi: master yi"));
        addItem(new ChatItem("Bl4ckDestinyGR: @nightblue3 4k followers for cam?"));
    }

    private static void addItem(ChatItem item) {
        ITEMS.add(item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ChatItem {
        public String content;

        public ChatItem(String content) {
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
