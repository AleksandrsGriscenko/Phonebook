package javaschool.app;

import asg.cliche.Command;

import java.util.*;

public class PhoneBook {
    private Map<Integer, Record> recordList = new HashMap<>();
    private NavigableMap<String, Record> indexByName = new TreeMap<>();


    @Command
    public void createPerson(String name, String adress, String... phones) {
        Person r = new Person();
        r.setName(name);
        r.setAdress(adress);
        r.addPhones(phones);
        recordList.put(r.getId(), r);  //Sohranjaem
        indexByName.put(r.getName(), r);
    }

///    @Command
////    public Collection <Record> findAfter(String, str) {
///}

    @Command
    public void createNote(String name, String note) {
        Note n = new Note();
        n.setNote(note);
        n.setName(name);
        recordList.put(n.getId(), n);
    }

    @Command
    public void createReminder(String name, String txt, String time) {
        Reminder rem = new Reminder();
        rem.setName(name);
        rem.setNote(txt);
        rem.setTime(time);
        recordList.put(rem.getId(), rem);
    }


    @Command
    public Collection<Record> list() {
        return recordList.values();
    }


    @Command //dobavljaem v opredelljonyj ID telefon
    public void addPhone(int id, String phone) {
        for (Record r : recordList.values()) {  //guljaem po Recordu i kladem peremennuju v r
            if (r instanceof Person && r.getId() == id) {   //sravnivaem    instanceof-proverjaem evljaetsja li on kem-to
                Person p = (Person) r;   //Privedenie tipa
                p.addPhones(phone);   //kladem
                break;
            }
        }
    }

    @Command  // metod poiska po imeni
    public List<Record> find(String str) {
        str = str.toLowerCase();
        List<Record> result = new ArrayList<>();
        for (Record r : recordList.values()) {
            if (r.contains(str)) {
                result.add(r);
            }
        }
        return result;
    }

    @Command
    public Record show(int id) {
        return recordList.get(id);
    }




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


/// poisk v adresse
    //       for (Record r : recordList) {
    //          String adress = r.getAdress().toLowerCase();
    //           if (adress.contains(str)) {
    //               result.add(r);
    //          }
    //   }
    //      return result;
    //   }






