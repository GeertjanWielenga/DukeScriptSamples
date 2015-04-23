package org.ds.ContactsEditor;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;
import org.netbeans.html.json.impl.JSON;

@Model(className = "Data", targetId = "", properties = {
    @Property(name = "contacts", type = Contact.class, array = true),
    @Property(name = "lastSavedJson", type = String.class)
})
final class DataModel {

    @Function
    static void addContact(Data model) {
        model.getContacts().add(new ContactData("", "", new PhoneData("", "")));
    }

    @Function
    static void removeContact(Data model, ContactData data) {
        model.getContacts().remove(data);
    }

    @Function
    static void addPhone(ContactData data) {
        data.getPhones().add(new PhoneData("", ""));
    }
    
    @Function
    static void save(Data model) {
        model.setLastSavedJson(model.toString());
    }
}
