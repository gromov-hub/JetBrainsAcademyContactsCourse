package app;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Contact {

    private Map<String, String> entry = new Hashtable<String, String>();


    Contact(String name, String surname, String phoneNumber){
        this.entry.put("name", name);
        this.entry.put("surname", surname);
        this.entry.put("phoneNumber", phoneNumber);
    }

    public String getName(){
        return this.entry.get("name");
    }

    public String getSurname(){
        return this.entry.get("surname");
    }

    public String getPhoneNumber(){
        return this.entry.get("phoneNumber");
    }

    Boolean isEntry(String parameter){
        Set<String> keys = entry.keySet();
        for(String key : keys){
            if (parameter.equals(entry.get(key))) return true;
        }
        return
    }

    @Override
    public String toString(){
        StringBuilder contactString = new StringBuilder();
        Set<String> keySet = this.entry.keySet();
        Iterator<String> iter = keySet.iterator();
        
        while(iter.hasNext()){
            contactString.append(iter.next());
        }
        return contactString.toString();
    }
}