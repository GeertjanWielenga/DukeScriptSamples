package org.ds.WorkingWithCollections;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "PersonData", targetId = "", properties = {
    @Property(name = "name", type = String.class),
    @Property(name = "children", type = String.class, array = true)
})
public class Person {
    @Function
    static void addChild(PersonData pd) {
        pd.getChildren().add("New child");
    }
}
