package javaschool.app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Record {
    private static int count = 0;
    private int id;
    private String name;
    private String adress;
    private final List<String> phones = new ArrayList<>();  // sdelatj spisok telefonov dlja odnogo cheloveka

    public Record() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
        return id + ". " + name + " " + " " + adress + phones;
    }

}
