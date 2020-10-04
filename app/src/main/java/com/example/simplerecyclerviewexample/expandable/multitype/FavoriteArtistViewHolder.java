package com.example.simplerecyclerviewexample.expandable.multitype;

import android.view.View;
import android.widget.TextView;

import com.example.simplerecyclerviewexample.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class FavoriteArtistViewHolder extends ChildViewHolder {

  private TextView favoriteArtistName;

  public FavoriteArtistViewHolder(View itemView) {
    super(itemView);
    favoriteArtistName = (TextView) itemView.findViewById(R.id.list_item_favorite_artist_name);
  }

  public void setArtistName(String name) {
    favoriteArtistName.setText(name);
  }

}
