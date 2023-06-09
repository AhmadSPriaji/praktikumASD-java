public class TestBook {
    public static void main(String[] args) {
        // membuat array yang menyimpan 3 instance Buku
        Buku[] buku = new Buku[3];
        buku[0] = new Buku();
        buku[0].judul = "Introduction to Java Programming and Data Structures";
        buku[0].penulis = "Daniel Liang";
        buku[0].harga = 355000;
        buku[1] = new Buku();
        buku[1].judul = "Advanced Java Programming";
        buku[1].penulis = "Uttam Roy";
        buku[1].harga = 236250;
        buku[2] = new Buku();
        buku[2].judul = "Practical Java Programming";
        buku[2].penulis = "Perry Xiao";
        buku[2].harga = 95000;

        // menghitung harga total termasuk pajak 10% lalu disimpan ke array hargaTotal
        int[] hargaTotal = new int[3];
        for(int i=0; i<3; i++){
            hargaTotal[i] = buku[i].harga * 110/100;
        }

        // menampilkan infromasi ter-update (judul, penulis, dan harga total)
        for(int i=0; i<3; i++){
            System.out.println("Judul: " + buku[i].judul);
            System.out.println("Penulis: " + buku[i].penulis);
            System.out.println("Harga Total (pajak 10%): Rp" + hargaTotal[i]);
            System.out.println();
        }
    }
}
