class test{
    public static void main(String[] args) {
    

        int H=1;
        int R=1;

        for (int y = 0; y < H;y++){
            for(int x = -R;x < R+1;x++){
                for(int z = -R;z< R+1;z++){
                    System.out.printf("%3d%3d%3d\n",x,y,z);
                }
            }
        }

        
    }    
    


}