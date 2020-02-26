package app;

interface ContactsFabric{
    ContactsRegistry createRegistry();
    Contact generateContact();
    void putContactIntoRegistry();
}