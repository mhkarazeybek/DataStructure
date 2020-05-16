public class NufusMudurlugu {
    public static void main(String[] args) {
        System.out.println("Nüfus Kaydı");
        Person nPerson = new Person();
        System.out.println(nPerson.setName("Ahmet"));
        System.out.println(nPerson.setLastName("Zonguldak"));
        System.out.println(nPerson.setTC("123456789012"));
        System.out.println(nPerson.setMotherLand("Izmir"));
        System.out.println(nPerson.setLastName("Örnek"));
    }
}