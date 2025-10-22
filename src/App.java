import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== KALKULATOR SEDERHANA ===");
        System.out.println("Operasi yang tersedia:");
        System.out.println("1. Tambah (+)");
        System.out.println("2. Kurang (-)");
        System.out.println("3. Kali (*)");
        System.out.println("4. Bagi (/)");
        System.out.println();
        
        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        
        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();
        
        double hasil = 0;
        boolean operasiValid = true;
        
        // Proses perhitungan
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    operasiValid = false;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid!");
                operasiValid = false;
        }
        
        // Tampilkan hasil jika operasi valid
        if (operasiValid) {
            System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        
        scanner.close();
    }
}