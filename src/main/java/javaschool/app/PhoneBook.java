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
        for (Record r : recordList) {  //giljaem po Recordu i kladem peremennuju v r
            if (r.getId() == id) {   //sravnivaem
                r.addPhones(phone);   //kladem
                break;
            }

        }
    }


}
