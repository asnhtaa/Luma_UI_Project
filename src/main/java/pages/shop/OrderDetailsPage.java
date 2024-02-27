package pages.shop;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.shop.components.PaymentComponent;
import pages.shop.components.ShippingAddressComponent;

import static com.codeborne.selenide.Selenide.$;

public class OrderDetailsPage {
    private final SelenideElement addNewAddressBtn = $("div.new-address-popup button");
    public ShippingAddressComponent shippingAddressComponent;
    public PaymentComponent paymentComponent;

    public OrderDetailsPage() {
        shippingAddressComponent = new ShippingAddressComponent();
        paymentComponent = new PaymentComponent();
    }

    public ShippingAddressComponent getShippingAddressComponent() {
        return shippingAddressComponent;
    }

    public PaymentComponent getPaymentComponent() {
        return paymentComponent;
    }

    @Step("Clicking 'Add New Address' button")
    public OrderDetailsPage clickAddNewAddressBtn() {
        addNewAddressBtn.click();

        return this;
    }
}