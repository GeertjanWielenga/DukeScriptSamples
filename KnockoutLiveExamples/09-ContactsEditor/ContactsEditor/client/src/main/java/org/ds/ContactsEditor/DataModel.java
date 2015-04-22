package org.ds.ContactsEditor;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;

@Model(className = "Data", targetId="", properties = {
    @Property(name = "contacts", type = Contact.class, array = true),
    @Property(name = "lastSavedJson", type = String.class)
})
final class DataModel {
    @Function static void addContact(Data model) {
    }
    @Function static void removeContact(Data model) {
    }
    @Function static void addPhone(Data model) {
    }
    @Function static void removePhone(Data model) {
    }
    @Function static void save(Data model) {
    }
}
