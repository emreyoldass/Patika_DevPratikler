public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    double calcAvarage;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulKSozluNote(int sozlumat,int sozlufizik,int sozlukimya){
        if (sozlumat >= 0 && sozlumat <= 100) {
            this.mat.sozlu = sozlumat;
        }

        if (sozlufizik >= 0 && sozlufizik <= 100) {
            this.fizik.sozlu = sozlufizik;
        }

        if (sozlukimya >= 0 && sozlukimya <= 100) {
            this.kimya.sozlu = sozlukimya;
        }
    }
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*0.80+this.fizik.sozlu*0.20) + (this.kimya.note*0.80+this.kimya.sozlu*0.20) + (this.mat.note*0.80+this.mat.sozlu*0.20)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("====Sözlü Notları====");
        System.out.println("Matematik Sözlü Notu : " + this.mat.sozlu);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.sozlu);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.sozlu);
        System.out.println("====Ders ortalamaları====");
        System.out.println("Matematik ortalaması: "+(this.mat.note*0.80+this.mat.sozlu*0.20));
        System.out.println("Fizik ortalaması: "+(this.fizik.note*0.80+this.fizik.sozlu*0.20));
        System.out.println("Kimya ortalaması: "+(this.kimya.note*0.80+this.kimya.sozlu*0.20));
    }

}







