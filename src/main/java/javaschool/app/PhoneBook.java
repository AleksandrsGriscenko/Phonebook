package javaschool.app;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Record> recordList = new ArrayList();

    @Command
    public void createPerson(String name, String adress, String... phones) {
        Person r = new Person();
        r.setName(name);
        r.setAdress(adress);
        r.addPhones(phones);

        recordList.add(r);  //Sohranjaem
    }

    @Command
    public void createNote(String name, String note) {
        Note n = new Note();
        n.setNote(note);
        n.setName(name);
        recordList.add(n);
    }

    @Command
    public void setTime(String name, String txt, String time) {
        Reminder rem = new Reminder();
        rem.setName(name);
        rem.setNote(txt);
        rem.setTime(time);

        recordList.add(rem);
    }





    @Command
    public List<Record> list() {
        return recordList;
    }


    @Command //dobavljaem v opredelljonyj ID telefon
    public void addPhone(int id, String phone) {
        for (Record r : recordList) {  //guljaem po Recordu i kladem peremennuju v r
            if (r instanceof Person && r.getId() == id) {   //sravnivaem    instanceof-proverjaem evljaetsja li on kem-to
                Person p = (Person) r;   //Privedenie tipa
                p.addPhones(phone);   //kladem
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


            String adress;
            if (r instanceof Person) {
                Person p = (Person) r;
                adress = p.getAdress().toLowerCase();
            } else {
                adress = "";
            }


            if (name.contains(str) || adress.contains(str)) {
                result.add(r);
            }


            // else {
            //   for (String p : r.getPhones()) {
            //      p = p.toLowerCase();
            //      if (p.contains(str)) {
            //         result.add(r);
            //       break;
            //     }
            //  }
            ///  }
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
