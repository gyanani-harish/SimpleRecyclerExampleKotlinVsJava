package com.example.simplerecyclerviewexample.expandable.listeners;


import com.example.simplerecyclerviewexample.expandable.models.CheckedExpandableGroup;

public interface OnChildrenCheckStateChangedListener {

  /**
   * @param firstChildFlattenedIndex the flat position of the first child in the {@link
   * CheckedExpandableGroup}
   * @param numChildren the total number of children in the {@link CheckedExpandableGroup}
   */
  void updateChildrenCheckState(int firstChildFlattenedIndex, int numChildren);
}
