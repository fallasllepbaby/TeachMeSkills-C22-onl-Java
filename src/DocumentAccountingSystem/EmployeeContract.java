package DocumentAccountingSystem;

import java.util.Date;

public class EmployeeContract extends Document implements Info{
    private String name;
    private Date contractEndDate;

    public EmployeeContract(int documentNumber, Date documentDate, String name, Date contractEndDate) {
        super(documentNumber, documentDate);
        this.name = name;
        this.contractEndDate = contractEndDate;
    }

    public EmployeeContract() {

    }

    @Override
    public void getDocumentInfo() {
        System.out.println("Номер документа: " + documentNumber + "\n"
                + "Дата документа: " + documentDate + "\n" + "Имя сотрудника: " + name
                + "\n" + "Дата окончания контракта: " + contractEndDate + "\n");
    }
}
