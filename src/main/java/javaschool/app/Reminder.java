package javaschool.app;

class DateRem extends Note {
    private String dateRem;

    public String getDateRem() {
        return dateRem;
    }

    public void setDateRem(String getRem) {
        this.dateRem = dateRem;
    }

    @Override   //otobrozhaet stroku
    public String toString() {
        return getId() + ". " + getName() + " " + " " + " " + getNote()+ " " +getDateRem();
    }


}
