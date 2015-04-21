package org.ds.ClickCounter;

import net.java.html.json.ComputedProperty;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "Data", targetId = "", properties = {
    @Property(name = "numberOfClicks", type = int.class)
})
final class DataModel {

    @Function
    static void registerClick(Data model) {
        model.setNumberOfClicks(model.getNumberOfClicks() + 1);
    }

    @Function
    static void resetClicks(Data model) {
        model.setNumberOfClicks(0);
    }
    
    @ComputedProperty
    static boolean hasClickedTooManyTimes(int numberOfClicks) {
        return numberOfClicks >=3;
    }

}
