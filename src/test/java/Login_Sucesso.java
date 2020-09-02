import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login_Sucesso {
    @Test
    public void LoginSucesso() throws InterruptedException {
        //Abrindo o Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        //Cenário de testes
        //Dado que possuo cadastro de Login
        //Quando utilizar meu login válido
        //Então tem que acessar minha conta

        //Abrir o browser
        navegador.get("http://automationpractice.com/index.php");

        //Maximizar Browser
        navegador.manage().window().maximize();

        //Clicar em login
        navegador.findElement(By.id("index")).click();

        navegador.findElement(By.xpath("//header[@id='header']/div[2]/div/div/nav/div/a")).click();

        //Inserir email
        navegador.findElement(By.id("email")).sendKeys("vilarnogueira@gmail.com");

        //Inserir senha
        navegador.findElement(By.id("passwd")).sendKeys("123mudar");

        //Acessar conta
        navegador.findElement(By.id("SubmitLogin")).click();

    }
}
