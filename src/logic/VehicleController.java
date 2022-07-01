package logic;

import java.util.Arrays;
import java.util.HashMap;

public class VehicleController {
    
    public static HashMap<Integer, StolenVehicle> hashTable = new HashMap<>();
    final static String[] colors = new String[]{"Rojo", "Negro", "Blanco", "Azul", "Plata", "Amarillo", "Purpura", "Marrón", "Verde", "Multicolor"};
    public static Integer id = 0;

    public static String[] getColors() {
        return colors;
    }

    public static boolean exist(String id) {
        Integer idInt = Integer.parseInt(id);
        return hashTable.containsKey(idInt);
    }

    public static void addReport(String[] data) {
        id++;
        StolenVehicle stolenVehicle = new StolenVehicle();
        stolenVehicle.setAllData(data);
        System.out.println(Arrays.toString(data));
        hashTable.put(id, stolenVehicle);
    }
    
    public static String[][] queryDataTable() {
        try {
            String[][] data = new String[id][6];
            int counter = 0;
            for(HashMap.Entry<Integer, StolenVehicle> m : hashTable.entrySet()){
                String[] dataRow = new String[7];
                String[] infoObject = m.getValue().getAllData();
                dataRow[0] = String.valueOf(m.getKey());
                for (int i = 1; i < 7; i++) {
                    dataRow[i] = infoObject[i - 1];
                }
                data[counter] = dataRow;
                counter++;
            }  
            return data;
        } catch (NegativeArraySizeException e) {
            String[][] data = new String[0][0];
            return data;
        }
    }

    public static String[] queryReportById(String id) {
        Integer idInt = Integer.parseInt(id);
        StolenVehicle stolenVehicle = hashTable.get(idInt);
        String[] infoObject = stolenVehicle.getAllData();
        String[] data = new String[7];
        data[0] = id;
        for (int i = 1; i < 7; i++) {
            data[i] = infoObject[i - 1];
        }
        
        return data;
    }

    public static void updateReport(String id, String[] data) {
        int idInt = Integer.parseInt(id);
        StolenVehicle stolenVehicle = new StolenVehicle();
        stolenVehicle.setAllData(data);
        hashTable.replace(idInt, stolenVehicle);
    }

    public static void deleteReport(String id) {
        int idInt = Integer.parseInt(id);
        hashTable.remove(idInt);
    }
}
