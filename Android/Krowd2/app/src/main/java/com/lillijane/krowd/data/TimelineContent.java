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
public class TimelineContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<TimelineItem> ITEMS = new ArrayList<TimelineItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, TimelineItem> ITEM_MAP = new HashMap<String, TimelineItem>();

    static {
        // Add 3 sample items.
        addItem(new TimelineItem("1", "Timeline 1"));
        addItem(new TimelineItem("2", "Timeline 2"));
        addItem(new TimelineItem("3", "Timeline 3"));
    }

    private static void addItem(TimelineItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class TimelineItem {
        public String id;
        public String content;

        public TimelineItem(String id, String content) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
