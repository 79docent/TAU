from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

import time

driver = webdriver.Chrome('Users\szjakob\Desktop\tau2\firefoxdriver')


driver.get("https://www.beatstars.com/")
time.sleep(3)

print('Sprawdzam listę utworów')
try:
    tracks = WebDriverWait(driver, 5).until(
        EC.presence_of_element_located((By.LINK_TEXT, "Tracks"))
    )
    tracks.click()

except:
    driver.quit()

time.sleep(5)
print('Sprawdzam utwory z tagiem "pop"')

search_box = driver.find_element_by_name("search")

search_box.send_keys('pop')

search_box.send_keys(Keys.RETURN)

time.sleep(5)
print('Sprawdzam, czy pokazał się tag pop po wyszukaniu')



time.sleep(3)
