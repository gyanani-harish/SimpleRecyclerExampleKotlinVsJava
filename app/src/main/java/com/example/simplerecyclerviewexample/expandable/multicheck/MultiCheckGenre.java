package com.example.simplerecyclerviewexample.expandable.multicheck;


import com.example.simplerecyclerviewexample.expandable.Artist;
import com.example.simplerecyclerviewexample.expandable.models.MultiCheckExpandableGroup;

import java.util.List;

public class MultiCheckGenre extends MultiCheckExpandableGroup {

  private int iconResId;

  public MultiCheckGenre(String title, List<Artist> items, int iconResId) {
    super(title, items);
    this.iconResId = iconResId;
  }

  public int getIconResId() {
    return iconResId;
  }
}

