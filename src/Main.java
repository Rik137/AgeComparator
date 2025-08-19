public class Main {
    public static void main(String[] args) {
        int vasyaAge = 10;
        int katyaAge = 65;
        int mishaAge = 34;

        int min = -1;    // minimum age
        int middle = -1; // middle age
        int max = -1;    // maximum age

        if (vasyaAge < katyaAge && vasyaAge < mishaAge) {
            min = vasyaAge;
        } else if (katyaAge < vasyaAge && katyaAge < mishaAge) {
            min = katyaAge;
        } else {
            min = mishaAge;
        }
        if (vasyaAge > katyaAge && vasyaAge < mishaAge || vasyaAge > mishaAge && vasyaAge < katyaAge) {
            middle = vasyaAge;
        } else if (katyaAge > vasyaAge && katyaAge < mishaAge || katyaAge > mishaAge && katyaAge < vasyaAge) {
            middle = katyaAge;
        } else {
            middle = mishaAge;
        }
        if (vasyaAge > katyaAge && vasyaAge > mishaAge) {
            max = vasyaAge;
        } else if (katyaAge > vasyaAge && katyaAge > mishaAge) {
            max = katyaAge;
            ;
        } else {
            max = mishaAge;
        }
        System.out.println("min " + min + " age \n" + "middle " + middle + " age \n" + "max " + max + " age \n");
    }
}
