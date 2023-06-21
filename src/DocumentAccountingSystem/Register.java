package DocumentAccountingSystem;

public class Register {

    private int counter = 0;
    private Document[] documents = new Document[10];

    public void addDocument(Document document) {
        documents[counter] = document;
        counter++;
    }

    public void getDocumentInformation(int number) {
        this.documents[number].getDocumentInfo();
    }
}
