
class Character_Pattern {
    public static void main(String[] args) {

        int count = 65;
        int i, j;
        for (i = 65; i <= 69; i++) {
            for (j = 65; j <= i; j++) {
                System.out.print((char) count);
                count++;
            }
            System.out.println();
        }
    }
}
