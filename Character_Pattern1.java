
class Character_Pattern1 {
    public static void main(String[] args) {

        int count = 'A';
        int i, j;
        for (i = 'A'; i <= 'C'; i++) {
            for (j = 'A'; j <= i; j++) {
                System.out.print((char) count);
                count++;
            }
            System.out.println();
        }
    }
}
