public class KendaraanLL14 {
    NodeKendaraan14 head;

    public boolean isEmpty() {
        return head == null;
    }

    public void addDataKendaraan(Kendaraan14 data) {
        NodeKendaraan14 newNode = new NodeKendaraan14(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodeKendaraan14 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println(">> Kendaraan masuk ke dalam antrian");
    }

    public Kendaraan14 poll() {
        if (isEmpty())
            return null;
        Kendaraan14 result = head.data;
        head = head.next;
        return result;
    }

    public int count() {
        if (isEmpty())
            return 0;
        int count = 0;
        NodeKendaraan14 temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
        NodeKendaraan14 temp = head;
        if (temp == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("== Antrian Kendaraan ==");
        System.out.printf("%-20s %-20s %-20s%n", "Plat Nomor", "Jenis", "Merk");
        while (temp != null) {
            System.out.printf("%-20s %-20s %-20s%n", temp.data.platNomor, temp.data.tipe, temp.data.merk);
            temp = temp.next;
        }
    }
}