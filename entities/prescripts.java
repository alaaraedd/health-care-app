package entities;
public class prescripts {
      String publishDate;
  int pat_id;  
  int medicine_id;
  int doctors_id;


    public prescripts( String publishDate,int pat_id, int medicine_id, int doctors_id) {
         this.publishDate = publishDate;
        this.pat_id = pat_id;
        this.medicine_id = medicine_id;
        this.doctors_id = doctors_id;
       
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

    public int getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(int medicine_id) {
        this.medicine_id = medicine_id;
    }

    public int getDoctors_id() {
        return doctors_id;
    }

    public void setDoctors_id(int doctors_id) {
        this.doctors_id = doctors_id;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
  
}
