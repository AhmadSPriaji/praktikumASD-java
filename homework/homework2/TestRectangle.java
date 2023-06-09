public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect0 = new Rectangle();
        rect0.width = Math.random();
        rect0.height = Math.random();
        
        Rectangle rect1 = new Rectangle();
        rect1.width = Math.random();
        rect1.height = Math.random();

        // (1) start...
        double area0 = rect0.width * rect0.height;
        double area1 = rect1.width * rect1.height;
        System.out.println("rect0\n" + "width: " + rect0.width );
        System.out.println("height: " + rect0.height );
        System.out.println("area: " + area0 );

        System.out.println("rect1\n" + "width: " + rect1.width );
        System.out.println("height: " + rect1.height );
        System.out.println("area: " + area1 );
        // ...(1) end

        // (2) start...
        // Rectangle[] rects = new Rectangle[2];
        // double[] area = new double[2];
        // for (int i=0; i<2; i++){
        //     rects[i] = new Rectangle();
        //     rects[i].width = Math.random();
        //     rects[i].height = Math.random();
        //     area[i] = rects[i].width * rects[i].height;
        //     System.out.println("rect" + i);
        //     System.out.println("width: " + rects[i].width );
        //     System.out.println("height: " + rects[i].height );
        //     System.out.println("area: " + area[i] );
        // }
        // ...(2) end
        
        // (3) start...
        // Rectangle[] rects = new Rectangle[10];
        // double[] area = new double[10];
        // for (int i=0; i<10; i++){
        //     rects[i] = new Rectangle();
        //     rects[i].width = Math.random();
        //     rects[i].height = Math.random();
        //     area[i] = rects[i].width * rects[i].height;
        //     System.out.println("rect" + i);
        //     System.out.println("width: " + rects[i].width );
        //     System.out.println("height: " + rects[i].height );
        //     System.out.println("area: " + area[i] );
        // }
        // ...(3) end


        // (4) start...
        // Rectangle[] rects = new Rectangle[10];
        // double[] area = new double[10];
        // for (int i=0; i<10; i++){
        //     rects[i] = new Rectangle();
        //     rects[i].width = Math.random();
        //     rects[i].height = Math.random();
        //     area[i] = rects[i].width * rects[i].height; 
        // }

        // Rectangle maxRect = new Rectangle();
        // Rectangle minRect = new Rectangle();
        // maxRect = rects[0];
        // minRect = rects[0];

        // for (int i=0; i<10; i++){
        //     if(area[i] > maxRect.width*maxRect.height){
        //         maxRect = rects[i];
        //     }
        //     if(area[i] < minRect.width*minRect.height){
        //         minRect = rects[i];
        //     }
        // }
        // System.out.println("rect" + " terbesar");
        // System.out.println("width: " + maxRect.width );
        // System.out.println("height: " + maxRect.height );
        // System.out.println("area: " + maxRect.width*maxRect.height );
        // System.out.println("rect" + " terkecil");
        // System.out.println("width: " + minRect.width );
        // System.out.println("height: " + minRect.height );
        // System.out.println("area: " + minRect.width*minRect.height );
        // ...(4) end

    }
}
