berat_badan = float(input("Masukkan berat badan anda (kg): "))
tinggi_badan_cm = float(input("Masukkan tinggi badan anda (cm): "))

tinggi_badan_m = tinggi_badan_cm / 100

bmi = berat_badan / (tinggi_badan_m ** 2)

print("Nilai BMI anda adalah", round(bmi, 4))

if bmi < 18.5:
    print("Anda termasuk berbadan kurus")
elif bmi < 25:
    print("Anda termasuk berbadan langsing/sehat")
else:
    print("Anda termasuk berbadan gemuk")