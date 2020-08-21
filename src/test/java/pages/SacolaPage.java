package pages;

import Utils.Constantes;
import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.Comum;

public class SacolaPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private Comum acoesComuns;

    private By btnComprar = By.cssSelector("#add-to-cart > button");
    private By btnIrParaSacola = By.cssSelector(".popover-go-to-cart-content > a");
    private By btnRemover = By.cssSelector(".cart-product-action > a");
    private By inputTamanho = By.cssSelector("#add-to-cart > div.selectbox-2.add-to-cart-form-sizes > input[type=hidden]");
    private By optTamanho = By.cssSelector("#add-to-cart > div.selectbox-2.add-to-cart-form-sizes.popover-click.is-open > ul > li:nth-child(6)");
    private By adicionarProdutoNaSacola = By.xpath("//p[@class='cart-product-name']//a[contains(text(),'Tapete')]");
    private By embalagemParaPresente = By.cssSelector("#cart_product_gift_AD464SCF72QTB-58");
    private By removerMsg = By.xpath("//h3[contains(text(),'Sua sacola está vazia...')]");

    public SacolaPage(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
        wait = DriverManager.getDriverWait();
    }

    public void irParaUrlTapete(){
        acoesComuns.irParaURL(Constantes.PRODUTO_URL_TAPETE);
    }

    public void clicarBtnComprar(){
        acoesComuns.clicarComJavaScript(btnComprar);
    }
    public void clicarBtnIrParaSacola(){
        acoesComuns.clicar(btnIrParaSacola);
    }
    public void clicarBtnRemover(){
        acoesComuns.clicar(btnRemover);
    }

    public String getProdutoNaSacola(){
        return acoesComuns.getElementText(adicionarProdutoNaSacola);
    }
    public String getRemoverMsg() {
        return acoesComuns.getElementText(removerMsg);
    }
}
