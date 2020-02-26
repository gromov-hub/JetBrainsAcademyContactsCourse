package app;

interface ContactsRegistry{
    void addContact(Contact contact);
    Contact getContact(String parameter);
    void deletContact(Contact contact);
}