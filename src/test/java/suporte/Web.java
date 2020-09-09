package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() {

        //Abrir o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chrome\\84\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit/");

        //Maximizar o Navegador
        navegador.manage().window().maximize();

        return navegador;
    }
}
