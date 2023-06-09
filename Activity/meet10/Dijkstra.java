public class Dijkstra {
    int nTown;
    double[][] map;
    double[] distance;
    int src;

    Dijkstra(double[][] map){
        this.map = map;
        nTown = map.length; // jumlah node (town)
    }

    public void solve(int src, int dst) {
        this.src = src; // set starting node
        boolean[] selected = new boolean[nTown]; // untuk mengecek apakah node sudah dipilih atau belum
        distance = new double[nTown]; // jarak terpendek ke tiap node 
        
        for (int i=0; i<nTown; i++) {
            distance[i] = Double.MAX_VALUE; // jarak terpendek = tak hingga
            selected[i] = false;
        }
        distance[src] = 0; // jarak ke starting node = 0

        while (true) {
            // dari node-node yang belum dipilih, pilih yang jaraknya terdekat
            int marked = minIndex(distance, selected);
            
            if (marked < 0) return; //seluruh node sudah dipilih
            if (distance[marked] == Double.MAX_VALUE) return; //ada node yang tidak terhubung
            selected[marked] = true; // tandai node tersebut sebagai "sudah dipilih"
            if (marked == dst) return; //sudah sampai tujuan, selesai

            for (int j=0; j<nTown; j++) { // untuk tiap node yang terhubung dengan node yang baru saja dipilih
                if (map[marked][j]>0 && !selected[j] ) { //dan node tersebut belum dipilih
                    //hitung jaraknya
                    double newDistance = distance[marked] + map[marked][j];
                    // update jika nilainya lebih kecil
                    if (newDistance < distance[j]) distance[j] = newDistance; 
                }
            }
        }
    }

    //menentukan idex node yang jaraknya terdekat
    private int minIndex(double[] distance, boolean[] selected) {
        double dist = Double.MAX_VALUE;
        int idx = -1;

        for (int i=0; i<nTown; i++) {
            if (!selected[i] && distance[i]<dist) { //node dengan jarak terkecil yang belum dipilih
                dist = distance[i];
                idx = i;
            }
        }
        return idx;
    }

    public double getDistance(int dst) {
        return distance[dst];
    }
}