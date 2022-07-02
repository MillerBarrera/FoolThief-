package logic;

import java.util.HashMap;

/**
 * Esta clase se encarga de ser intermediario entre la capa de interfaz y la
 * capa de persistencia respecto a reportes de vehiculos.
 */
public class VehicleController {

    public static HashMap<Integer, StolenVehicle> hashTable = new HashMap<>();
    final static String[] colors = new String[]{"Rojo", "Negro", "Blanco", "Azul", "Plata", "Amarillo", "Purpura", "Marrón", "Verde", "Multicolor"};
    public static Integer id = 0;

    public static String[] getColors() {
        return colors;
    }

    /**
     * Busca el id y retorna si esta en la Tabla Hash.
     *
     * @param id
     * @return <ul>
     * <li>true: existe el elemento en la hash table.</li>
     * <li>false: no existe el elemento en la hash table.</li>
     * </ul>
     */
    public static boolean exist(String id) {
        Integer idInt = Integer.parseInt(id);
        return hashTable.containsKey(idInt);
    }

    /**
     * Recibe un arreglo con los datos y agrega un objeto que los contiene en la
     * Tabla Hash.
     *
     * @param data
     */
    public static void addReport(String[] data) {
        id++;
        StolenVehicle stolenVehicle = new StolenVehicle();
        stolenVehicle.setAllData(data);
        hashTable.put(id, stolenVehicle);
    }

    /**
     * Esta función retorna un matriz con todos los datos guardados en la Tabla
     * Hash.
     *
     * @return String[][] matriz con todos los datos guardados en la hash table.
     */
    public static String[][] queryDataTable() {
        try {
            String[][] data = new String[id][6];
            int counter = 0;
            for (HashMap.Entry<Integer, StolenVehicle> m : hashTable.entrySet()) {
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

    /**
     * Retorna un arreglo con los datos guardados en la Tabla Hash para su
     * lectura en la interfaz.
     *
     * @param id
     * @return String[] data.
     */
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

    /**
     * Dado un ID y un arreglo se busca el elemento y se actualiza los datos
     * tanto en la Tabla Hash.
     *
     * @param id
     * @param data
     */
    public static void updateReport(String id, String[] data) {
        int idInt = Integer.parseInt(id);
        StolenVehicle stolenVehicle = new StolenVehicle();
        stolenVehicle.setAllData(data);
        hashTable.replace(idInt, stolenVehicle);
    }

    /**
     * Dado un ID elimina en la Tabla Hash.
     *
     * @param id
     */
    public static void deleteReport(String id) {
        int idInt = Integer.parseInt(id);
        hashTable.remove(idInt);
    }
}
