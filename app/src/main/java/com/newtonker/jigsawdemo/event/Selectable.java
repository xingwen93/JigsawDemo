package com.newtonker.jigsawdemo.event;

import com.newtonker.jigsawdemo.model.Photo;

import java.util.List;

public interface Selectable
{
    /**
     * Indicates if the item at position position is selected
     *
     * @param photo JigsawPhoto of the item to check
     * @return true if the item is selected, false otherwise
     */
    boolean isSelected(Photo photo);

    /**
     * Toggle the selection status of the item at a given position
     *
     * @param photo JigsawPhoto of the item to toggle the selection status for
     */
    void toggleSelection(Photo photo);

    /**
     * Clear the selection status for all items
     */
    void clearSelection();

    /**
     * Count the selected items
     *
     * @return Selected items count
     */
    int getSelectedItemCount();

    /**
     * Indicates the list of selected photos
     *
     * @return List of selected photos
     */
    List<Photo> getSelectedPhotos();
}
