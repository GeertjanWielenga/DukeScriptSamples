package org.ds.BetterList;

import java.util.Collections;
import java.util.List;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "Data", targetId="", properties = {
    @Property(name = "itemToAdd", type = String.class),
    @Property(name = "allItems", type = String.class, array = true),
    @Property(name = "selectedItems", type = String.class, array = true)
})
final class DataModel {
    @Function static void addItem(Data model){
        String itemToAdd = model.getItemToAdd();
        List<String> items = model.getAllItems();
        if (itemToAdd!=null){
            items.add(itemToAdd);
            model.setItemToAdd("");
        }
    }
    @Function static void removeSelected(Data model){
        List<String> selectedItems = model.getSelectedItems();
        model.getAllItems().removeAll(selectedItems);
        selectedItems.add("");
    }
    @Function static void sortItems(Data model){
        Collections.sort(model.getAllItems());
    }
}
