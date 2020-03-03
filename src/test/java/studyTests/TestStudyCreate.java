package studyTests;

import org.testng.annotations.Test;

import com.pages.CreateStudyPage;
import com.pages.StudiesPage;

import basetest.BaseTests;
import io.qameta.allure.Description;

public class TestStudyCreate extends BaseTests {
	@Test
	@Description("Test Study create")
	public void testStudyCreate() {
		StudiesPage studiespage = loginpage.userLogin("bselvam@agatisys.com","Welcome3#");
		CreateStudyPage createstudypage = studiespage.clickStudyCreate();
		createstudypage.setstudyIDField("SMK_TEST_1");
		createstudypage.setdescriptionField("SMK_TEST_1");
		createstudypage.setprotocolNumberField("SMK_TEST_1");
		createstudypage.setprotocolTitleField("SMK_TEST_1");
		createstudypage.setsponsorNameField("SMK_TEST_1");
		createstudypage.setstudyNameField("SMK_TEST_1");
		createstudypage.settherapeuticAreaField("SMK_TEST_1");
		createstudypage.clickSaveButton();
		studiespage.searchStudy("SMK_TEST_1");
	}
}
