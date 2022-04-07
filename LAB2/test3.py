from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

import time

driver = webdriver.Chrome('Users\szjakob\Desktop\tau2\firefoxdriver')


driver.get("https://wolnifarmerzy.pl/")
time.sleep(3)



username = driver.find_element_by_id("loginusername")
username.send_keys('szymek2000')

time.sleep(3)

password = driver.find_element_by_id("loginpassword")
password.send_keys('Strongpass123')

time.sleep(3)


try:
    click_login = WebDriverWait(driver, 5).until(
        EC.presence_of_element_located((By.ID, "loginbutton"))
    )
    click_login.click()

except:
    driver.quit()

time.sleep(3)
