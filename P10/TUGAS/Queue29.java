public class Queue29 {
    Pembeli29[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue29 (int n) {
        max = n;
        data = new Pembeli29[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].noID
                                            + " "  + data[front].jenisKelamin   + " " + data[front].umur);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen terbelakang: " + data[rear].nama + " " + data[rear].noID
                                                + " " + data[rear].jenisKelamin   + " " + data[rear].umur);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].noID
                                                + " "  + data[front].jenisKelamin  + " " + data[front].umur);
                i = (i + 1) % max;
            }
            System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].noID
                                            + " "  + data[front].jenisKelamin   + " " + data[front].umur);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void Enqueue(Pembeli29 dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public Pembeli29 Dequeue() {
        Pembeli29 dt = new Pembeli29();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public int peekPosition(String nama) {
        if (IsEmpty()) {
            return -1;
        }
        int i = front;
        int position = 0;
        while (i != rear) {
            if (data[i].nama.equals(nama)) {
                System.out.println("Nama: " + data[i].nama + ", No. ID: " + data[i].noID+
                                ", JK: "    + data[i].jenisKelamin   + ", Umur: "   + data[i].umur);
                return position;
            }
            position++;
            i = (i + 1) % max;
            }
            if (data[i].nama.equals(nama)) {
                System.out.println("Nama: " + data[i].nama + ", No. ID: " + data[i].noID +
                                ", JK: "    + data[i].jenisKelamin   + ", Umur: "   + data[i].umur);
            return position;
            }
            return -1;
        }

        public void daftarPasien() {
            if (IsEmpty()) {
            System.out.println("Daftar pasien masih kosong");
            } else {
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + data[i].nama + ", No. ID: " + data[i].noID +
                                ", JK: "    + data[i].jenisKelamin   + ", Umur: "   + data[i].umur);
                i = (i + 1) % max;
            }
            
            System.out.println("Nama: " + data[i].nama + ", No. ID: " + data[i].noID +
            ", JK: "    + data[i].jenisKelamin   + ", Umur: "   + data[i].umur);
        }
    }
}
