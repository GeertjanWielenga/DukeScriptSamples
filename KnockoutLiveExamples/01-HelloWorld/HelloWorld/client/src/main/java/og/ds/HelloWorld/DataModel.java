package og.ds.HelloWorld;

import net.java.html.json.ComputedProperty;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "Data", targetId="", properties = {
    @Property(name = "firstName", type = String.class),
    @Property(name = "lastName", type = String.class)
})
final class DataModel {
    @ComputedProperty static String fullName(
            String firstName, 
            String lastName) {
        return firstName + " " + lastName;
    }
}
