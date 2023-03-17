package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class MobileTests extends TestBase {
    @Test
    @DisplayName("Проверка, что в настройках есть настройки интерфейса")
    void searchInputTest() {
        step("Кликни Настройки", () ->
                $(id("com.simplemobiletools.calendar.pro:id/settings")).click()
        );
        step("Проверь, что имеется поле настроек интерфейса", () ->
                $(id("com.simplemobiletools.calendar.pro:id/settings_color_customization_label")).shouldBe(visible)
        );
    }
}
