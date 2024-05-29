nama = input("Masukkan nama Anda: ")
tahun_lahir = int(input("Tahun berapa Anda lahir: "))

if tahun_lahir >= 1944 and tahun_lahir <= 1964:
    generasi = "Baby Boomer"
elif tahun_lahir >= 1965 and tahun_lahir <= 1979:
    generasi = "Generasi X"
elif tahun_lahir >= 1980 and tahun_lahir <= 1994:
    generasi = "Generasi Y (Millennials)"
elif tahun_lahir >= 1995 and tahun_lahir <= 2015:
    generasi = "Generasi Z"

print(nama + ", berdasarkan tahun lahir Anda tergolong " + generasi)