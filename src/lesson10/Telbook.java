package lesson10;


import java.util.*;


public class Telbook {

    private HashMap<String, Set<String>> telbook = new HashMap<>();

    public Set<String> get(String name) {
        return telbook.get(name);
    }

    public void add(String name, String nomer) {
        Set<String> tel = telbook.getOrDefault(name, new HashSet<>());
        tel.add(nomer);
        telbook.put(name, tel);
    }

    @Override
    public String toString() {
        return "Telbook{" +
                "telbook=" + telbook +
                '}';
    }
}
