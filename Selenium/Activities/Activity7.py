from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/dynamic-controls")

    
    print("Page title is: ", driver.title)
    
	
    textbox = driver.find_element(By.ID, "textInput")
    
    print("Textbox is enabled: ", textbox.is_enabled())
    
    driver.find_element(By.ID, "textInputButton").click()
    
    print("Textbox is enabled: ", textbox.is_enabled())