package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.Comum;

public class SacolaPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private String pageURL = "https://www.dafiti.com.br/";
    private Comum  acoesComuns;

    private By btnComprar = By.cssSelector("#add-to-cart > button");
    private By btnIrParaSacola = By.cssSelector(".popover-go-to-cart-content > a");
    private By btnRemover = By.cssSelector(".cart-product-action > a");
    private By inputTamanho = By.cssSelector("#add-to-cart > div.selectbox-2.add-to-cart-form-sizes > input[type=hidden]");
    private By optTamanho = By.cssSelector("#add-to-cart > div.selectbox-2.add-to-cart-form-sizes.popover-click.is-open > ul > li:nth-child(6)");
    private By aProdutoNaSacola = By.xpath("//p[@class='cart-product-name']//a[contains(text(),'Tapete')]");
    private By embalagemparapresente = By.cssSelector("#cart_product_gift_AD464SCF72QTB-58");

    private String produtoURLtapete = "https://www.dafiti.com.br/Tapete-Felpudo-Classic-Casa-Dona-Bege-100cm-x-150cm-5671829.html";
    private String produtoURLmochila = "https://www.dafiti.com.br/Mochila-Colcci-Matelasse-Preta-4802869.html";
    private String produtoURLtenis = "https://www.dafiti.com.br/Tenis-adidas-Originals-Superstar-Slip-on-W-Preto-5125927.html";

    public SacolaPage(WebDriver driver){
        this.driver = driver;
        acoesComuns = new Comum(driver);
    }

    public void irParaURLtapete(){
        acoesComuns.irParaURL(produtoURLtapete);
    }
    public void irParaURLmochila(){
        acoesComuns.irParaURL(produtoURLmochila);
    }
    public void irParaURLtenis(){
        acoesComuns.irParaURL(produtoURLtenis);
    }

    public void clicarbtnComprar(){
        acoesComuns.clicar(btnComprar);
    }
    public void clicarbtnIrParaSacola(){
        acoesComuns.clicar(btnIrParaSacola);
    }
    public void clicarbtnRemover(){
        acoesComuns.clicar(btnRemover);
    }
    public void clicarinputTamanho(){
        acoesComuns.clicar(inputTamanho);
    }
    public void clicaropttamanho(){
        acoesComuns.clicar(optTamanho);
    }
    public void clicarembalagemparapresente(){
        acoesComuns.clicar(embalagemparapresente);
    }
    public String getProdutoNaSacola(){
        return acoesComuns.getElementText(aProdutoNaSacola);
    }
}
