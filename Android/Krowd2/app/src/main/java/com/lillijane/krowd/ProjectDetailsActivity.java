package com.lillijane.krowd;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lillijane.krowd.data.ProjectsContent;

public class ProjectDetailsActivity extends AppCompatActivity {
    private ProjectsContent.ProjectItem mProjectDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mProjectDetail = extras.getParcelable("data");
        } else {
            finish();
        }

        setContentView(R.layout.activity_project_details);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(mProjectDetail.getTitle());

        loadBackdrop();
        loadContent();
    }

    private void loadContent() {
        final TextView textView = (TextView) findViewById(R.id.description);
        final TextView textView2 = (TextView) findViewById(R.id.objectives);
        textView.setText(mProjectDetail.getDescription());
        textView2.setText(String.format("%.1f%% de l'objectif: %d€ sur %d€",
                mProjectDetail.getActualFund() * 100.0f / mProjectDetail.getObjectiveFund(),
                mProjectDetail.getActualFund(), mProjectDetail.getObjectiveFund()));
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        Glide.with(this).load(mProjectDetail.getImage()).centerCrop().into(imageView);
    }
}
