import java.util.*;

public class VehicleRegister {

    public HashMap<RegistrationPlate, String> owners;

    public boolean add(RegistrationPlate plate, String owner){
        if (owners.containsKey(plate)) {
            return false;
        }
        owners.put(plate, owner);
        return true;
    }
    public String get(RegistrationPlate plate) {
        if (!owners.containsKey(plate)){
            return null;
        }
        return owners.get(plate);
    }
    public boolean delete(RegistrationPlate plate) {
        if (!owners.containsKey(plate)) {
            return false;
        }
        owners.remove(plate);
        return true;
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    public void printOwners(){
        Set<String> setOwner = new HashSet<>(owners.values());
        for (String owner : setOwner) {
            System.out.println(owner);
        }
    }
}
