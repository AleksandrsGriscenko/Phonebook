package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> recordList = new ArrayList();

    @Command
    public void create(String name, String adress, String... phones) {
        Record r = new Record();
        r.setName(name);
        r.setAdress(adress);
        r.addPhones(phones);

        recordList.add(r);  //Sohranjaem
    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command //dobavljaem v opredelljonyj ID telefon
    public void addPhone(int id, String phone) {
        for (Record r : recordList) {  //guljaem po Recordu i kladem peremennuju v r
            if (r.getId() == id) {   //sravnivaem
                r.addPhones(phone);   //kladem
                break;
            }
        }
    }

    @Command  //poisk po imeni
    public void find(String str) {
        str = str.toLowerCase();
        List<Record> result = new ArrayList<>();
        for (Record r : recordList) {
            String name = r.getName().toLowerCase();
            String adress = r.getAdress().toLowerCase();
            if (name.contains(str) || adress.contains(str)) {
                result.add(r);
            }
        }
    }
/// poisk v adresse
    //       for (Record r : recordList) {
    //          String adress = r.getAdress().toLowerCase();
    //           if (adress.contains(str)) {
    //               result.add(r);
    //          }
    //   }
    //      return result;
    //   }






}
