package Script;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Cadastro_Login {
    @Test
    public void CadastroLogin() throws InterruptedException {
        //Abrindo o Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Escrita dos cenários
        //Dado que quero realizar o login.
        //Quando inserir os dados válido para cadastro
        //Então tenho que acessa a minha conta.
        //Obs: Alterar dados de cadastros ultilizados.


        //Abrir o browser
        navegador.get("http://automationpractice.com/index.php");

        //Maximizar Browser
        navegador.manage().window().maximize();

        //Clicar em login
        navegador.findElement(By.id("index")).click();

        navegador.findElement(By.xpath("//header[@id='header']/div[2]/div/div/nav/div/a")).click();

        //Inserir E-mail de cadastro
        navegador.findElement(By.id("email_create")).sendKeys("vilarnogueira@gmail.com");

        //Criar conta
        navegador.findElement(By.id("SubmitCreate")).click();

        //Dados de Cadastro

        navegador.findElement(By.id("id_gender1")).click();
        navegador.findElement(By.id("customer_firstname")).sendKeys("Felipe");
        navegador.findElement(By.id("customer_lastname")).sendKeys("Vilar");
        navegador.findElement(By.id("passwd")).sendKeys("123mudar");
        navegador.findElement(By.id("days")).sendKeys("8");
        navegador.findElement(By.id("months")).sendKeys("december");
        navegador.findElement(By.id("years")).sendKeys("1986");
        navegador.findElement(By.id("firstname")).sendKeys("Casa");
        navegador.findElement(By.id("lastname")).sendKeys("Teste");
        navegador.findElement(By.id("company")).sendKeys("Teste Company");
        navegador.findElement(By.id("address1")).sendKeys("Praça MArisa Marques");
        navegador.findElement(By.id("city")).sendKeys("Guarulhos");
        navegador.findElement(By.id("id_state")).sendKeys("Texas");
        navegador.findElement(By.id("postcode")).sendKeys("12345");
        navegador.findElement(By.id("id_country")).sendKeys("United States");
        navegador.findElement(By.id("phone_mobile")).sendKeys("1198585858");
        navegador.findElement(By.id("alias")).sendKeys("Teste Refrência");

        //Salvar informações de cadastro
        navegador.findElement(By.id("submitAccount")).click();
        WebElement result = navegador.findElement(By.id("submitAccount"));
        result.getText().contentEquals("MY ACCOUNT");

    }

    }