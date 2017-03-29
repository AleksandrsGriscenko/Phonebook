package javaschool.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Person extends Record {
    private String adress;
    private final List<String> phones = new ArrayList<>();  // sdelatj spisok telefonov dlja odnogo cheloveka


    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<String> getPhones() {
        return phones;
    }

    //   public void setPhone(String phone) {    this.phones = phones;   }

    public void addPhones(String... phones) {
        this.phones.addAll(Arrays.asList(phones));   //pereobrazouvaem v kolekciju
    }

    @Override   //otobrozhaet stroku
    public String toString() {
        return getId() + ". " + getName() + " " + " " + adress + phones;
    }


}