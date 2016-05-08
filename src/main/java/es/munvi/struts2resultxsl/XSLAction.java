/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.munvi.struts2resultxsl;

import com.opensymphony.xwork2.ActionSupport;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

/**
 *
 * @author joselopezruiz
 */
public class XSLAction extends ActionSupport {

    private String code, name, city;
    private double salary;
    private List<Libro> libros = new ArrayList();
    {
        Libro libro1 = new Libro();
        libro1.setAutor("Milan Kunder");
        libro1.setTitulo("La vida está en otra parte");
        libro1.setIsbn("9-55263-98");
        libros.add(libro1);
        Libro libro2 = new Libro();
        libro2.setAutor("Mario Vargas Llosa");
        libro2.setTitulo("Pantaleón y las visitadoras");
        libro2.setIsbn("4-325669-23");
        libros.add(libro2);
    }

    public List<Libro> getLibros() {
        return libros;
    }

    
    
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    /*
    @Override
    public void validate() {
        if (code.trim().length() == 0) {
            addFieldError("code", "Code can be left blank");
        }

        if (name.trim().length() == 0) {
            addFieldError("name", "Name can be left blank");
        }

        if (city.trim().length() == 0) {
            addFieldError("city", "City can be left blank");
        }

        if (salary == 0) {
            addFieldError("salary", "salary is not valid");
        }
    }*/
    
    
    public String execute() throws Exception {
        return SUCCESS;
    }
}
