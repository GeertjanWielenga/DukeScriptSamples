package org.ds.WorkingWithCollections;

import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "Data", targetId="", properties = {
    @Property(name = "people", type = Person.class, array = true),
    @Property(name = "showRenderTimes", type = boolean.class)
})
final class DataModel {
}
