package app;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

class DullContactRegistry implements ContactsRegistry{
    static private List<Contact> registry = new ArrayList<>();

    public void addContact(Contact contact){
        DullContactRegistry.registry.add(contact);
    }

    public Contact getContact(String parameter) throws NoSuchElementException{
        for(Contact cont : registry){
            if(cont.isEntry(parameter)) return cont;            
        }
        throw new NoSuchElementException();
    }

    public void deletContact(Contact contact){
        if(DullContactRegistry.registry.contains(contact)) {
            DullContactRegistry.registry.remove(contact);
        }
    }
}