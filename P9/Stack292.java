public class Stack292 {
    int size;
    int top;
    Pakaian29 data[];

    public Stack292(int size) {
        this.size = size;
        data = new Pakaian29[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Pakaian29 pkn) {
        if (!isFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi stack penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Pakaian29 x = data[top];
            top--;
            System.out.println(
                    "Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        System.out.println("Eelemen teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
                + data[top].ukuran + " " + data[top].harga);
    }

    public void print() {
        System.out.println("Isi Stack : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                    + data[i].harga);
        }
        System.out.println(" ");
    }

    public void celar() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
}
