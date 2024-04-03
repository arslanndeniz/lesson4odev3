import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.IOException;

public class PersonelNesnesi {
    public static void main(String[] args) throws IOException {
        // Personel nesnesi oluştur
        Personel personel = new Personel("John Doe", 30, "Software Engineer");

        // JSON formatına dönüştür
        ObjectMapper jsonMapper = new ObjectMapper();
        String json = jsonMapper.writeValueAsString(personel);
        System.out.println("JSON:");
        System.out.println(json);

        // XML formatına dönüştür
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(personel);
        System.out.println("\nXML:");
        System.out.println(xml);

        YAML formatına dönüştür
        YAMLMapper yamlMapper = new YAMLMapper();
        String yaml = yamlMapper.writeValueAsString(personel);
        System.out.println("\nYAML:");
        System.out.println(yaml);
    }
}

class Personel {
    private String ad;
    private int yas;
    private String pozisyon;

    public Personel(String ad, int yas, String pozisyon) {
        this.ad = ad;
        this.yas = yas;
        this.pozisyon = pozisyon;
    }

    // Getter ve Setter metotları
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }
}
