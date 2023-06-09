import java.util.*;

public class RunDijkstra {
    static double[][] map;
    static int src;
    static int dst;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan jumlah node");
        int nTown = sc.nextInt(); // jumlah node

        map = new double[nTown][nTown];

        // inisialisasi nilai tiap elemen dari array 2d map[][]
        for (int i=0; i<nTown; i++) {
            for (int j=0; j<nTown; j++) {
                if(i==j) map[i][j] = 0; // jarak dari node ke dirinya sendiri = 0
                else if(i>j) map[i][j] = map[j][i]; // jarak dari node i ke node j = jarak dari node j ke node i
                else {
                    System.out.println("masukkan jarak dari node " + i + " ke node " + j);
                    map[i][j] = sc.nextDouble();
                }
            }
        }

        Dijkstra dj = new Dijkstra(map);
        dj.solve(src, dst);
        System.out.println(dj.getDistance(dst));
        sc.close();
    }
}
