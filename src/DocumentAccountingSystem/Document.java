package DocumentAccountingSystem;

import java.util.Date;

public abstract class Document implements Info {
    protected int documentNumber;
    protected Date documentDate;

    public Document(int documentNumber, Date documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public Document() {
        this.documentNumber = 0;
        this.documentDate = new Date();
    }
}
