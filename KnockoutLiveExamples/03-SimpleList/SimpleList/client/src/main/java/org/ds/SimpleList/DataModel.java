package org.ds.SimpleList;

import java.util.List;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "Data", targetId="", properties = {
    @Property(name = "itemToAdd", type = String.class),
    @Property(name = "items", type = String.class, array = true)
})
final class DataModel {
    @Function static void addItem(Data model) {
        String itemToAdd = model.getItemToAdd();
        List<String> items = model.getItems();
        if (itemToAdd!=null){
            items.add(itemToAdd);
            model.setItemToAdd("");
        }
    }
}
