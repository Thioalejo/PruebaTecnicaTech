/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.techandsolver.pruebatecnica.util;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;
import org.openqa.selenium.By;

/**
 *
 * @author Acer
 */
public class Util {
    public boolean searchText(final String text) {

        String searchProductByName =null;
        boolean noExiste = true;
        int contProduct = 1;

        while (noExiste) {
            searchProductByName = SearchTextByXpathYReturnValue("//*[@id=\"content\"]/form/div/table/tbody/tr[" + contProduct + "]/td[2]/a");

            if (searchProductByName.equals(text)) {  
                contProduct = 1;
                noExiste = false;
                return true;
            } else if (contProduct >= 30) {
                contProduct = 1;
                noExiste = false;
            }
            contProduct++;
        }
        return false;
    }
    
    public boolean searchTextAndClick(final String text) {

        String searchProductByName =null;
        boolean noExiste = true;
        int contProduct = 1;

        while (noExiste) {
            searchProductByName = SearchTextByXpathYReturnValue("//*[@id=\"content\"]/form/div/table/tbody/tr[" + contProduct + "]/td[2]/a");

            System.out.println("Product not found:" + searchProductByName);

            if (searchProductByName.equals(text)) {
                getDriver().findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[" + contProduct + "]/td[4]/div/span/button[2]")).click();    
                contProduct = 1;
                noExiste = false;
                return true;
            } else if (contProduct >= 30) {
                contProduct = 1;
                noExiste = false;
            }
            contProduct++;
        }
        return false;
    }

    //Acceso a elementos por medio de Xpath
    private String SearchTextByXpathYReturnValue(final String xpathCampo) {
        final String ELEMENT = getDriver().findElement(By.xpath(xpathCampo)).getText();
        return ELEMENT;
    }
}
