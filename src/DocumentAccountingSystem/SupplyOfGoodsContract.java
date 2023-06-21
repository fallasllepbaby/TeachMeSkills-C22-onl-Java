package DocumentAccountingSystem;

import java.util.Date;

public class SupplyOfGoodsContract extends Document implements Info {
    private String productType;
    private int productAmount;

    public SupplyOfGoodsContract(int documentNumber, Date documentDate, String productType, int productAmount) {
        super(documentNumber, documentDate);
        this.productType = productType;
        this.productAmount = productAmount;
    }

    public SupplyOfGoodsContract() {

    }

    @Override
    public void getDocumentInfo() {
        System.out.println("Номер документа: " + documentNumber + "\n"
                + "Дата документа: " + documentDate + "\n" + "Тип товара: " + productType
                + "\n" + "Количество товара: " + productAmount + "\n");
    }
}
