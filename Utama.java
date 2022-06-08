import java.io.*;
class Utama
{
    public static void main (String[]args)throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        //instance of class
        Login user1 = new Login();
        Login user2 = new Login("","");
        while(true)
        {
            
            //menu
            System.out.println("===============================");
            System.out.println("           MENU LOGIN          ");
            System.out.println("===============================");
            System.out.println("1. Login Admin");
            System.out.println("2. Ubah Password Admin");
            System.out.println("3. Buat User");
            System.out.println("4. Lihat Data User");
            System.out.println("5. Keluar");
            System.out.println("===============================");
            
            //input
            System.out.print("Masukkan Pilihan = ");
            int pilih = Integer.parseInt (br.readLine());
            
            System.out.println();
            
            //proses + output
            switch(pilih)
            {
                
                //jika pilih = 1
                case 1:
                    //isi pilihan bernilai 1 ketika dijalankan
                    
                    System.out.print("Masukkan Username = ");
                    String my_user = br.readLine();
                    System.out.print("Masukkan Password = ");
                    String my_password = br.readLine();
                    
                    System.out.println();
                    
                    //cek apakah user dan password yang diinputkan sesuai dengan isi data user dan password pada class Login
                    if (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword()))
                    {
                        System.out.println("*** Login Sukses ***");
                        
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("*** Login gagal ***");
                        
                        System.out.println();
                    }
                    break;
                    
                //jika pilih = 2
                case 2:
                    //isi pilihan bernilai 2 ketika dijalankan
                    
                    System.out.print("Masukkan Password Lama = ");
                    String old_password = br.readLine();
                    System.out.print("Masukkan Password Baru = ");
                    String new_password = br.readLine();
                    
                    System.out.println();
                    
                    if (old_password.equals(user1.getPassword()))
                    {
                        user1.setPassword(new_password);
                        System.out.println("*** Password Berhasil Dirubah ***");
                        
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("*** Anda Salah Memasukkan Password Lama ***");
                        
                        System.out.println();
                    }
                    break;
                    
                //jika pilih =3
                case 3:
                    //isi pilihan bernilai 3 ketika dijalankan
                    System.out.print("Masukkan Username = ");
                    String create_user = br.readLine();
                    System.out.print("Masukkan Password = ");
                    String create_password = br.readLine();
                        
                    user2 = new Login(create_user,create_password);
                    
                    System.out.println();
                        
                    System.out.println("*** User Telah Berhasil Dibuat ***");
                        
                    System.out.println();
                    break;
                    
                //jika pilih = 4
                case 4:
                    //isi pilihan bernilai 4 ketika dijalankan
                    
                    System.out.println("======================");
                    System.out.println("        DATA USER     ");
                    
                    System.out.println();
                    
                    System.out.println("User 1");
                    System.out.println("Username = "+user1.getUsername());
                    System.out.println("Password = "+user1.getPassword());
                    
                    System.out.println();
                    
                    System.out.println("User 2");
                    System.out.println("username = "+user2.getUsername());
                    System.out.println("Password = "+user2.getPassword());
                    
                    System.out.println("======================");
                    
                    System.out.println();
                    break;
                    
                //jika nilai pilih yang dimasukkan 1, 2, 3, atau 4, maka program akan keluar secara otomatis
                default:
                    System.exit(0);
            }
        }
    }
}