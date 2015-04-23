package org.ds.ContactsEditor;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "ContactData", targetId = "", properties = {
    @Property(name = "firstName", type = String.class),
    @Property(name = "lastName", type = String.class),
    @Property(name = "phones", type = Phone.class, array = true)
})
public class Contact {

    @Function
    static void removePhone(ContactData model, PhoneData data) {
        model.getPhones().remove(data);
    }
}
