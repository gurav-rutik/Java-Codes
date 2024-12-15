class Character_Pattern2 {
    public static void main(String[] args) {

        int count = 65, i, j;
        for (i = 65; i <= 69; i++) {
            for (j = 65; j <= i; j++) {
                System.out.print((char) j);
                // System.out.print((char) j);
                count++;
            }
            System.out.println();
        }
    }
}
