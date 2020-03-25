package roles;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.CreateRolePage;
import com.pages.CreateStudyPage;
import com.pages.OrganizationsPage;
import com.pages.RolesPage;
import com.pages.StudiesPage;

import basetest.BaseTests;
import io.qameta.allure.Description;

public class TestRoleCreate extends BaseTests {
	@Test
	@Description("Test Role create")
	public void testRoleCreate() {
		OrganizationsPage organizationspage = loginpage.userLogin("bselvam@agatisys.com", "Welcome3#");
		StudiesPage studiespage = organizationspage.clickAltavozLink();
		RolesPage rolesPage = studiespage.clickRoleMenu();
		CreateRolePage createrolepage = rolesPage.clickRoleCreate();
		createrolepage.clickCancelButton();
		String pageTitle = driver.getTitle();
		waitForElementToBeDisplayed(driver, pageTitle);
		Assert.assertEquals(pageTitle, "IQVIA: Roles", "Wrong page is displayed");
		rolesPage.clickRoleCreate();
		createrolepage.setroleNameField("AT_Test_Role");
		createrolepage.setroleDescField("AT_Test_Description");
		createrolepage.selectAllPermissions();
		createrolepage.clickSaveButton();
	}
}