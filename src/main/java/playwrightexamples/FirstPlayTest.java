package playwrightexamples;

import com.microsoft.playwright.*;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class FirstPlayTest
{

	public static void main(String[] args)
	{
		 try (Playwright playwright = Playwright.create())
			 {
	            Browser browser = playwright.chromium().launch();
	            Page page = browser.newPage();
	            page.navigate("https://playwright.dev");

	           
	            assertThat(page).hasTitle(Pattern.compile("Playwright"));

	           
	            Locator getStarted = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Get Started"));

	            
	            assertThat(getStarted).hasAttribute("href", "/docs/intro");

	             
	            getStarted.click();

	             
	            assertThat(page.getByRole(AriaRole.HEADING,
	               new Page.GetByRoleOptions().setName("Installation"))).isVisible();
	        }
	}
}
