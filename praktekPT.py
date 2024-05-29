hjl = 140000  # harga jungle land
hts = 200000  # harga trans studio
hdf = 250000  # harga dunia fantasi
btw = 50000  # biaya tambahan weekend
disc = 0.15  # diskon

print("=========================================")
print("Selamat Datang!!")
tujuan = input("Pilihan Tujuan : ")
waktu = input("Pilihan Waktu : ")
tiket = int(input("Jumlah tiket : "))

hpt = 0  # harga per tiket

if tujuan == "Jungle Land":
    hpt = hjl
elif tujuan == "Trans Studio":
    hpt = hts
elif tujuan == "Dunia Fantasi":
    hpt = hdf
else:
    print("Tujuan Wisata Tidak Valid, Silahkan pilih kembali")

print("\n")
print("==========================================")
print(f"Tujuan : {tujuan}")
print(f"Waktu : {waktu}")
print(f"Jumlah Tiket : {tiket}")

if hpt != 0:
    if waktu == "Weekend":
        total_harga = (hpt + btw) * tiket
        print(f"Harga : {hpt:,} + {btw:,} = {hpt + btw:,}")
    else:
        total_harga = hpt * tiket
        print(f"Harga : {hpt:,}")

    print(f"Total Harga pemesanan {tiket} tiket : {total_harga:,}")

    if tiket >= 10:
        potongan = total_harga * disc
        print(f"Diskon : {potongan:,}")
    else:
        potongan = 0  # Inisialisasi potongan jika tiket < 10

    print(f"Total Bayar : {total_harga:,} - {potongan:,} = {total_harga - potongan:,}")
    print("\n")
    print("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
    print("Terimakasih Sudah Pesan Tiket Di sini!")