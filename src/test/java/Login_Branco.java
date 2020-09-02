import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login_Branco {
    @Test
    public void LoginEmBranco() throws InterruptedException {
        //Abrindo o Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Cenário de testes
        //Dado que faço login na platarforma.
        //Quando um dos campos usuário/senha estiverem em brancos.
        //Então deverá aparecer uma mensagem "usuário/senha obrigatórios".

        //Abrir o browser
        navegador.get("http://automationpractice.com/index.php");

        //Maximizar Browser
        navegador.manage().window().maximize();

        //Clicar em login
        navegador.findElement(By.id("index")).click();

        navegador.findElement(By.xpath("//header[@id='header']/div[2]/div/div/nav/div/a")).click();

        //Inserir email
        navegador.findElement(By.id("email")).sendKeys("vilarnogueira@gmail.com");

        //Acessar conta
        navegador.findElement(By.id("SubmitLogin")).click();

    }
}
