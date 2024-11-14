Prak PBO 10
1. Fitur Ubah Pin
Pada Account.java saya menambahkan void changePin untuk mengubah pin 

<img width="480" alt="Tangkapan Layar 2024-11-14 pukul 15 13 56" src="https://github.com/user-attachments/assets/f6629ee2-9746-4e54-9a59-ff17a7230a9f">
Pada ATM.java saya menambahkan pilihan ini agar bisa memilih untuk mengubah pin 

<img width="291" alt="Tangkapan Layar 2024-11-14 pukul 15 15 35" src="https://github.com/user-attachments/assets/0bcc6dc1-48f8-4a86-959d-3c92abe1840d">
Pada ATM.java saya menambahkan switch case 5 agar pilihan ubah pin dapat berfungsi

<img width="174" alt="Tangkapan Layar 2024-11-14 pukul 15 15 59" src="https://github.com/user-attachments/assets/8634228f-c458-40c7-8ff3-6c3c5030ec44">

Hasilk Run Ubah Pin
<img width="243" alt="Tangkapan Layar 2024-11-14 pukul 14 33 45" src="https://github.com/user-attachments/assets/6d737171-a6d5-4e66-b57c-f6d4c9c3a7dc">


2.Validasi Saldo Minimal pada saat penarikan

Saya Menambahkan ini pada Account.java agar saldo minimal yang ada di rekening Rp 50.000,00
<img width="578" alt="Tangkapan Layar 2024-11-14 pukul 15 17 18" src="https://github.com/user-attachments/assets/7e00f367-8baa-419c-8890-d50364fba527">

Lalu saya memodifikasi execute() yang berada di Withdrawal.java agar kita dapat memeriksa saldo setelah penarikan akan tetap sama atau sama dengan minimum_balance. Jika tidak, penarikan dibatalkan dan pesan kesalahan ditampilkan.
<img width="757" alt="Tangkapan Layar 2024-11-14 pukul 15 17 47" src="https://github.com/user-attachments/assets/6c2718de-ce73-4e37-b77c-2f598dc4dc7c">

Hasil Run
<img width="278" alt="image" src="https://github.com/user-attachments/assets/7dbf13d3-cb23-444f-83ce-8dcef7d1f517">
Apabila melakukan penarikan tetapi tidak sisakan uang di rekening sebesar Rp 50.000 maka akan keluar tulisan ‘Saldo Tidak Mencukupi’

<img width="328" alt="image" src="https://github.com/user-attachments/assets/3646bbb5-91d1-4988-88a3-c097f8ae13eb">
Lalu apabila melakukan penarikan dengan menyisikan saldo min Rp 50.000 maka dana bisa ditarik seperti tampilan diatas ini.

3.	Dokumentasi Seluruh Kegiatan Praktikum Hari Ini
Src
  com
               atm
                  model
                    Account.java
	        transaction
		Transaction.java
		Deposit.java
		Transfer.java
		Withdrawal.java
	         util
	      ATM.java
	      Main.java

Model
   Account.java
   <img width="215" alt="image" src="https://github.com/user-attachments/assets/823f7bfd-e535-4a89-9235-04b29b8860ef">
<img width="236" alt="image" src="https://github.com/user-attachments/assets/3118c0a6-2936-4139-8297-ced2db829660">

  

Transaction
     Deposit.java
 <img width="261" alt="image" src="https://github.com/user-attachments/assets/db548b2d-c794-40df-ad2d-d355490f4c1b">

     Transaction.java
 <img width="275" alt="image" src="https://github.com/user-attachments/assets/75c9a1b4-ac6e-4a28-abca-b233d0cc2c21">


      Transfer.java
<img width="288" alt="image" src="https://github.com/user-attachments/assets/f42acdba-2a1d-4a4f-899d-5ad295fa5be6">
 

     Withdrawal.java
 <img width="348" alt="image" src="https://github.com/user-attachments/assets/2c9770ee-cf83-4356-aadd-c1de0be6fe65">

atm
   ATM.java
   <img width="222" alt="image" src="https://github.com/user-attachments/assets/2f096540-6222-41d0-b75c-15c1f42bf641">
<img width="208" alt="image" src="https://github.com/user-attachments/assets/1b1e5e24-e23e-4442-b0c9-c35885789f58">
<img width="307" alt="image" src="https://github.com/user-attachments/assets/ba7c8af8-9bce-454f-8500-7db834641008">


   Main.java
 
<img width="307" alt="image" src="https://github.com/user-attachments/assets/0a7d99ca-7e08-4dfa-8aa4-33f51e8bbe89">

Compile
 <img width="352" alt="image" src="https://github.com/user-attachments/assets/dcd2ec8a-3787-406c-aa94-718473e0f0ec">


