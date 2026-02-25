# 🚀 Kemnaker-UI-Katalon  
### UI Automation Testing – SIAPKerja Platform  
Kementerian Ketenagakerjaan Republik Indonesia  

---

## 📌 Overview

**Kemnaker-UI-Katalon** adalah project automation testing berbasis **Katalon Studio** yang digunakan untuk melakukan pengujian UI pada platform SIAPKerja.

Project ini mencakup automation untuk:

- ✅ Login Account  
- ✅ Register Account  
- ✅ Complete Profile  
- ✅ Pencari Kerja Flow  
- ✅ SkillHub – Assessment Diri  

Framework ini dirancang modular, scalable, dan siap untuk kebutuhan regression testing maupun integrasi CI/CD.

---

## 🛠 Tech Stack

| Technology        | Purpose                     |
|------------------|----------------------------|
| Katalon Studio   | UI Automation Testing      |
| Groovy           | Scripting Language         |
| Selenium (Built-in) | Web UI Automation Engine |
| ChromeDriver     | Browser Automation         |
| Gradle           | Dependency Management      |
| GitHub           | Version Control            |

---

## 📂 Project Structure

```
Kemnaker-UI-Katalon/
│
├── Test Cases/
│   ├── SIAPKerja/
│   │   ├── Complete-Profiles/
│   │   ├── Login-Account/
│   │   ├── Pencari-Kerja/
│   │   └── Register-Account/
│   │
│   └── SkillHub/
│       └── Asesment-Diri/
│
├── Object Repository/
│   ├── SIAPKerja/
│   └── SkillHub/
│
├── Test Suites/
│   ├── Login-Account
│   └── Register-Account
│
├── Data Files/
│   └── SIAPKerja/
│
├── Keywords/
├── Test Listeners/
├── Reports/
├── Include/
├── Plugins/
│
├── build.gradle
├── console.properties
└── .gitignore
```

---

## 🎯 Testing Scope

### 1️⃣ Login Flow

### 2️⃣ Register Flow

### 3️⃣ Complete Profile

### 4️⃣ Pencari Kerja

### 5️⃣ SkillHub

---

## 🧪 Data-Driven Testing

Project ini menggunakan **Data Files (Excel/Internal Data)** untuk mendukung data-driven testing.

Contoh penggunaan dalam Test Case:

```groovy
def data = findTestData('SIAPKerja/Register-Files')
String email = data.getValue(1, 1)
```

---

## ▶️ How to Run

### 🔹 Run via Katalon Studio

1. Open Katalon Studio  
2. Import Project  
3. Pilih Test Suite  
4. Klik **Run** (Chrome)

---

### 🔹 Run via Command Line (KRE)

```bash
katalonc -noSplash \
-runMode=console \
-projectPath="Kemnaker-UI-Katalon.prj" \
-retry=0 \
-testSuitePath="Test Suites/Login-Account" \
-browserType="Chrome" \
-executionProfile="default" \
-apiKey=YOUR_API_KEY
```

---

## 📊 Reporting

Report hasil eksekusi tersedia pada folder:

```
Reports/
```

Output report meliputi:

- HTML Report
- Execution Log
- Screenshot on Failure

---

## 🔁 CI/CD Integration (Optional)

Project ini dapat diintegrasikan dengan:

- GitHub Actions
- Jenkins
- GitLab CI

Contoh GitHub Actions:

```yaml
name: Katalon UI Test

on:
  push:
    branches: [ main ]

jobs:
  test:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3
      - name: Run Katalon
        run: katalonc -runMode=console -projectPath="Kemnaker-UI-Katalon.prj" -testSuitePath="Test Suites/Login-Account" -browserType="Chrome"
```

---

## 🧱 Best Practices Implemented

✔ Modular Folder Structure  
✔ Separation of Test Case & Object Repository  
✔ Data-Driven Testing  
✔ Reusable Object Repository  
✔ Screenshot on Failure  
✔ Clean Naming Convention  

---

## 📈 Future Improvements

- Implement Custom Keywords for reusable steps  
- Add Global Variables for environment handling  
- Parallel execution  
- Cross-browser testing  
- Integrate with Katalon TestOps  

---

## 👤 Author

**Zulma Irzamsyah**  
Senior QA Engineer – UI & Automation Testing  

Expertise:
- Selenium
- Katalon
- RestAssured
- API Automation
- CI/CD Integration

---

## 📄 License

This project is created for automation testing portfolio and educational purposes.