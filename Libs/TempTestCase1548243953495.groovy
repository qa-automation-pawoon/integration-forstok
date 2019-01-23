import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\RISKAD~1\\AppData\\Local\\Temp\\Katalon\\Test Cases\\325 - Disable all 3rd party apps for trial or free userss\\325 - Disable all 3rd party apps for trial or free users\\20190123_184553\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCase('Test Cases/325 - Disable all 3rd party apps for trial or free userss/325 - Disable all 3rd party apps for trial or free users', new TestCaseBinding('Test Cases/325 - Disable all 3rd party apps for trial or free userss/325 - Disable all 3rd party apps for trial or free users',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
