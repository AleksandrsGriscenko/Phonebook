package javaschool.app;

/**
 * Created by JavaCourses on 29.03.2017..
 */
public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override   //otobrozhaet stroku
    public String toString() {
        return getId() + ". " + getName() + " " + " " + " " + getNote();
    }

    @Override
    public boolean contains(String str) {
        return super.contains(str) || note.contains(str);
    }
}


