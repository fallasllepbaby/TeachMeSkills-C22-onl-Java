package DocumentAccountingSystem;

import java.util.Date;

public class FinancialInvoice extends Document implements Info{
    private int monthTotal;
    private int departmentCode;

    public FinancialInvoice(int documentNumber, Date documentDate, int monthTotal, int departmentCode) {
        super(documentNumber, documentDate);
        this.monthTotal = monthTotal;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice() {

    }

    @Override
    public void getDocumentInfo() {
        System.out.println("Номер документа: " + documentNumber + "\n"
                + "Дата документа: " + documentDate + "\n" + "Итоговая сумма за месяц: " + monthTotal
                + "\n" + "Код департамента: " + departmentCode + "\n");
    }
}
