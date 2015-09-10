package com.lillijane.krowd.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;

import com.lillijane.krowd.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ProjectsContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<ProjectItem> ITEMS = new ArrayList<ProjectItem>();

    static {
        // Add 3 sample items.
        addItem(new ProjectItem(R.drawable.alzheimer, "Haltes répit-détente Alzheimer",
                "Ces lieux d’accueil non médicalisés proposent des activités adaptées aux personnes malades et permettent aux aidants de prendre du temps pour eux. Une prise de relais temporaire centrée sur l’écoute et le partage, pour maintenir un lien social, malheureusement trop souvent altéré par la maladie et rompre le face à face exclusif entre l’aidant et l’aidé.",
                52500, 150000));
        addItem(new ProjectItem(R.drawable.banque_alimentaire, "Distribution Alimentaire",
                "La distribution alimentaire permet de gérer l'urgence et de satisfaire le besoin élémentaire de se nourrir, tout en donnant à tous le droit à une alimentation de qualité et équilibrée. Il s'agit en effet d'une aide d'urgence attribuée gratuitement ou à un prix symbolique. La distribution alimentaire peut prendre différentes formes : paniers, repas chauds, repas partagés, sandwichs, soupes…",
                68000, 100000));
        addItem(new ProjectItem(R.drawable.creches, "Crèches Croix-Rouge",
                "Nos 60 crèches proposeront chaque année près de 2 300 places en accueil régulier, occasionnel et d’urgence. Soucieux de répondre au mieux aux besoins des familles, nous offrons des modes d’accueil souples – multi-accueils, crèches collectives, crèches familiales, haltes garderies et micro-crèches –, qualitatifs et accessibles à tous. 25 espaces \"parents-enfants\" feront aussi leur apparition.",
                148500, 148500));
        addItem(new ProjectItem(R.drawable.oasis, "L'Oasis, maison de soins palliatifs pour enfants", "Seuls 10% des enfants atteints de maladies incurables bénéficieraient d’une prise en charge et d’un accompagnement dignes. C’est pour répondre à la détresse des enfants et des familles confrontés à cette terrible issue que l’idée d’une maison d’accompagnement et de soins palliatifs pour enfants (« Oasis ») a vu le jour. En partenariat avec Enfant Do, équipe mobile régionale douleur soins palliatifs pédiatriques du CHU de Toulouse.",
                186300, 186300));
    }

    private static void addItem(ProjectItem item) {
        ITEMS.add(item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class ProjectItem implements Parcelable {
        private final @DrawableRes int image;
        private final String title;
        private final String description;
        private final Integer actualFund;
        private final Integer objectiveFund;

        public ProjectItem(int image, String title, String description, Integer actualFund, Integer objectiveFund) {
            this.image = image;
            this.title = title;
            this.description = description;
            this.actualFund = actualFund;
            this.objectiveFund = objectiveFund;
        }

        public Integer getActualFund() {
            return actualFund;
        }

        public Integer getObjectiveFund() {
            return objectiveFund;
        }

        public int getImage() {
            return image;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return title;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.image);
            dest.writeString(this.title);
            dest.writeString(this.description);
            dest.writeValue(this.actualFund);
            dest.writeValue(this.objectiveFund);
        }

        protected ProjectItem(Parcel in) {
            this.image = in.readInt();
            this.title = in.readString();
            this.description = in.readString();
            this.actualFund = (Integer) in.readValue(Integer.class.getClassLoader());
            this.objectiveFund = (Integer) in.readValue(Integer.class.getClassLoader());
        }

        public static final Parcelable.Creator<ProjectItem> CREATOR = new Parcelable.Creator<ProjectItem>() {
            public ProjectItem createFromParcel(Parcel source) {
                return new ProjectItem(source);
            }

            public ProjectItem[] newArray(int size) {
                return new ProjectItem[size];
            }
        };
    }
}
