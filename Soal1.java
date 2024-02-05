public class Soal1{
    public static void main (String[] args)
    {
    byte angka1 = -125;
    byte angka2 = 6;
    byte hasil = (byte) (angka1-angka2);

    System.out.println("Hasil 1 = "+ hasil);
    }
}
/**Output dari program yaitu text "Hasil 1 = 125", mengetahui bahwa tipe data byte hanya data menampung nomor dari -128 hingga 127, 
dimana apabila hasil penambahan akan melebihi atau kurang dari 127 atau -128 berturut-turut maka penambahan dilaksanakan kembali di batas lainnya 127 ke -128 dan -128 ke 127**/
