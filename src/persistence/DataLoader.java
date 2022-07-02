package persistence;

import logic.TopsController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import logic.VehicleController;

public class DataLoader {

    String pathFile = "C:\\Users\\Usuario\\Documents\\Netbeans Projects\\FoolThief\\src\\persistence\\100000vehiculos.txt";

    public static String[] string;
    public static String[] lines;
    public static String newLicensePlate, newBrand, newReference, newLocalidad, newColor, newModusOperandi;
    public static String text = "";
    public static int u = 0;
    public static int d = 8;
    public static int w = 0;
    public static int y = 0;

    public void loadData() {
        try {
            File file = new File(pathFile);
            BufferedReader obj = new BufferedReader(new FileReader(file));
            String temp = "";
            String bfRead;
            while ((bfRead = obj.readLine()) != null) {
                temp = temp + bfRead;
            }

            text = temp;
            System.out.println(text);
        } catch (Exception e) {

        }

        for (int i = 0; i < 900000; i++) {
            lines = text.split(",");
            if (lines == null) {
                break;
            }
        }

        for (int i = 0; i < 80000; i++) {

            y++;

            for (int c = w; c < y; c++) {
                newLicensePlate = lines[c];

            }
            y++;
            w++;
            for (int c = w; c < y; c++) {
                newBrand = lines[c];

            }
            y++;
            w++;
            for (int c = w; c < y; c++) {
                newReference = lines[c];

            }
            y++;
            w++;
            for (int c = w; c < y; c++) {
                newLocalidad = lines[c];

            }
            y++;
            w++;
            for (int c = w; c < y; c++) {
                newColor = lines[c];

            }

            w++;
            y++;
            for (int c = w; c < y; c++) {
                newModusOperandi = lines[c];

            }

            System.out.println(w + "l" + y);

            String[] data = new String[6];
            data[0] = newLicensePlate;
            data[1] = newBrand;
            data[2] = newReference;
            data[3] = newLocalidad;
            data[4] = newColor;
            data[5] = newModusOperandi;

            VehicleController.addReport(data);
            TopsController.addReportCount(newLocalidad, "Vehiculo", newModusOperandi);
            u++;
        }
    }
}
