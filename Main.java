import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Clase Anonima
        List<String> list = new ArrayList<String>();
        StringLengthListSort ss = new StringLengthListSort();
        list.add("Singapore");
        list.add("Santa Fe");
        list.add("Charleston");
        list.add("Monte Carlo");
        list.add("Lyon");
        list.add("Kyoto");
        list.add("Merida");
        list.add("Chiang Mai");
        list.add("San Miguel De Allende");
        list.add("Guadalajara");
        Collections.sort(list, ss);
        System.out.println("CLASE ANONIMA");
        System.out.println("By lenght");
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        });
        System.out.println("Alphabetically");
        System.out.println(list);

        //LAMBDA
        System.out.println("\nLAMBDA");
        List<String> cities = new ArrayList<>(Arrays.asList("Singapore", "Santa Fe", "Charleston", "Monte Carlo", "Lyon", "Kyoto", "Merida", "Chiang Mai", "San Miguel De Allende", "Guadalajara"));
        cities.sort((first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println("By length");
        System.out.println(cities);
        cities.sort((first, second) -> first.compareTo(second));
        System.out.println("Alphabetically");
        System.out.println(cities);

        //Metodo Referencia
        sortStringListByLength(new ArrayList<>(
                Arrays.asList("Singapore", "Santa Fe", "Charleston", "Monte Carlo", "Lyon", "Kyoto", "Merida","Chiang Mai", "San Miguel De Allende", "Guadalajara")));
    }

    private static void sortStringListByLength(List<String> list) {
        System.out.println("\nMETODO DE REFERENCIA");
        System.out.println("\nBy lenght");
        Collections.sort(list, Comparator.comparing(String::length));
        list.forEach(System.out::println);
        System.out.println("\nAlphabetically");
        list.sort(String::compareToIgnoreCase);
        list.forEach(System.out::println);
    }
}
