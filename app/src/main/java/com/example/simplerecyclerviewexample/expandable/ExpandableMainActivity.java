package com.example.simplerecyclerviewexample.expandable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.simplerecyclerviewexample.R;
import com.example.simplerecyclerviewexample.expandable.expand.ExpandActivity;
import com.example.simplerecyclerviewexample.expandable.multicheck.MultiCheckActivity;
import com.example.simplerecyclerviewexample.expandable.multitype.MultiTypeActivity;
import com.example.simplerecyclerviewexample.expandable.multitypeandcheck.MultiTypeCheckGenreActivity;
import com.example.simplerecyclerviewexample.expandable.singlecheck.SingleCheckActivity;

public class ExpandableMainActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main_expand);

    Button expand = (Button) findViewById(R.id.expand_button);
    expand.setOnClickListener(navigateTo(ExpandActivity.class));

    Button multiSelect = (Button) findViewById(R.id.multi_check_button);
    multiSelect.setOnClickListener(navigateTo(MultiCheckActivity.class));

    Button singleSelect = (Button) findViewById(R.id.single_check_button);
    singleSelect.setOnClickListener(navigateTo(SingleCheckActivity.class));

    Button mixedSelect = (Button) findViewById(R.id.mixedtype_button);
    mixedSelect.setOnClickListener(navigateTo(MultiTypeActivity.class));

    Button mixedTypeAndCheck = (Button) findViewById(R.id.mixedtype_check_button);
    mixedTypeAndCheck.setOnClickListener(navigateTo(MultiTypeCheckGenreActivity.class));
  }

  public OnClickListener navigateTo(final Class<?> clazz) {
    return new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(ExpandableMainActivity.this, clazz);
        startActivity(intent);
      }
    };
  }
}
