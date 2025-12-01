# 🎬 ScreenMatch - Series & Episodes Analyzer

A powerful Spring Boot application that consumes the OMDb API to search, analyze, and process TV series data with advanced stream operations, statistical analysis, and intelligent filtering capabilities.

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-brightgreen?style=for-the-badge&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven)
![Jackson](https://img.shields.io/badge/Jackson-3.0.2-blue?style=for-the-badge)

---

## 📋 Table of Contents

- [About the Project](#about-the-project)
- [Features](#features)
- [Technologies & Skills](#technologies--skills)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [What I Learned](#what-i-learned)
- [Acknowledgments](#acknowledgments)
- [Connect With Me](#connect-with-me)

---

## 🌟 About the Project

This project is a significant achievement in my **Backend Developer** journey, showcasing my ability to build enterprise-level applications using **Spring Framework** from the ground up. ScreenMatch demonstrates advanced Java development skills by consuming external APIs, processing complex nested data structures, and performing sophisticated data analysis.

The application integrates with the [OMDb API](http://www.omdbapi.com/) to fetch comprehensive TV series information, including all seasons and episodes, then applies powerful Stream API operations to filter, sort, and analyze the data in meaningful ways.

**This project represents countless hours of dedication and learning**, reflecting my growth as a backend developer. Every feature implemented showcases a new concept mastered and a challenge overcome.

<div align="center">
  <img src="src/main/java/com/daniidev/screenmatch/assests/ChatGPT Image 1 dic 2025, 00_47_34.png" alt="ScreenMatch Banner" width="400"/>
</div>

---

## ✨ Features

- 🔍 **Series Search** - Search any TV series by name with real-time API consumption
- 📺 **Complete Season Data** - Retrieves all seasons and episodes automatically
- ⭐ **Top Episodes Ranking** - Displays the top 5 highest-rated episodes
- 📅 **Date Filtering** - Filter episodes by release date with custom year input
- 🔎 **Title Search** - Find specific episodes by partial title matching (case-insensitive)
- 📊 **Statistical Analysis** - Average ratings per season with detailed statistics
- 🎯 **Advanced Streams** - FlatMap, filter, map, collect, and grouping operations
- 📈 **Summary Statistics** - Min, max, average, count, and sum of episode ratings
- 🏗️ **DTO Pattern** - Clean separation between API responses and domain models
- ⚙️ **Data Transformation** - Converts DTOs to domain objects with validation
- 🛡️ **Exception Handling** - Robust error management for API calls and data parsing

---

## 🛠️ Technologies & Skills

### Core Technologies
- **Java 17** - Modern Java features including Records
- **Spring Boot 4.0.0** - Enterprise application framework
- **Maven** - Dependency management and project build
- **Jackson Databind 3.0.2** - JSON serialization/deserialization
- **Java HTTP Client** - Native HTTP requests for API consumption
- **OMDb API** - External REST API for movie and series data

### Skills Demonstrated
- ✅ **RESTful API consumption** with dynamic URL building
- ✅ **JSON deserialization** using Jackson annotations (`@JsonAlias`, `@JsonIgnoreProperties`)
- ✅ **DTO (Data Transfer Object)** pattern for clean architecture
- ✅ **Advanced Stream API** operations (flatMap, filter, map, sorted, collect)
- ✅ **Functional programming** with lambdas and method references
- ✅ **Data aggregation** with Collectors (groupingBy, averagingDouble, summarizingDouble)
- ✅ **Optional handling** for safe null management
- ✅ **Date manipulation** with LocalDate and DateTimeFormatter
- ✅ **Exception handling** with try-catch blocks and validation
- ✅ **Object-oriented design** with interfaces and implementations
- ✅ **Package organization** following clean code principles
- ✅ **Maven dependency management** and build configuration

---

## 📁 Project Structure

```
src/main/java/com/daniidev/screenmatch/
│
├── model/                       # DTOs and domain models
│   ├── DTOEpisodio.java        # Episode data from API
│   ├── DTOSerie.java           # Series general information
│   ├── DTOTemporadas.java      # Season data with episodes list
│   └── Episodio.java           # Domain model with validation
│
├── service/                     # Business logic and API layer
│   ├── ConsumoAPI.java         # HTTP client for API calls
│   ├── Deserializacion.java   # JSON to Object conversion
│   └── IDeserializacion.java  # Deserialization interface
│
├── principal/                   # Application logic
│   ├── ScreenmatchApplication.java  # Spring Boot entry point
│   ├── Principal.java          # Main menu and features
│   └── EjempoStreams.java      # Stream API examples
│
└── resources/
    └── application.properties   # Application configuration
```

### Architecture Highlights

- **model**: Contains DTOs (Data Transfer Objects) that map API JSON responses directly, plus the `Episodio` domain class that handles business logic and validation
- **service**: Service layer responsible for API communication and data transformation
- **principal**: Presentation layer with user interaction and Stream operations showcase

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- Maven 3.6+
- Internet connection (for API calls)
- OMDb API Key (included in code, or get your own at [omdbapi.com](http://www.omdbapi.com/apikey.aspx))

### Installation

1. Clone the repository
```bash
git clone <repository-url>
cd screenmatch
```

2. Build the project
```bash
mvn clean install
```

3. Run the application
```bash
mvn spring-boot:run
```

---

## 💻 Usage

### Basic Workflow

1. **Search for a Series**
```
Ingrese el nombre de la Serie que desea consultar
> Game of Thrones
```

2. **View All Episodes**
   - The app automatically fetches all seasons
   - Displays every episode title from every season

3. **Top 5 Episodes**
   - Shows the highest-rated episodes across all seasons
   - Sorted by IMDb rating

4. **Filter by Date**
```
ingrese la fecha
> 2015
```
Shows all episodes released after January 1, 2015

5. **Search by Title**
```
Ingrese el Titulo del episodio
> winter
```
Finds episodes with "winter" in the title (case-insensitive)

6. **View Statistics**
   - Average rating per season
   - Overall statistics (min, max, average, count)

### Example Output Features

<div align="center">
  <img src="src/main/java/com/daniidev/screenmatch/assests/Captura de pantalla 2025-12-01 005037.png" alt="Series Search and Episodes" width="400"/>
  <p><em>Searching for a series and viewing all episodes data</em></p>
</div>

<div align="center">
  <img src="src/main/java/com/daniidev/screenmatch/assests/Captura de pantalla 2025-12-01 005159.png" alt="Filtering and Statistics" width="400"/>
  <p><em>Top episodes ranking, date filtering, and statistical analysis</em></p>
</div>

<div align="center">
  <img src="src/main/java/com/daniidev/screenmatch/assests/Captura de pantalla 2025-12-01 005422.png" alt="Filtering and Statistics" width="900"/>
  <p><em>Top episodes ranking, date filtering, and statistical analysis</em></p>
</div>



---

## 📚 What I Learned

Building ScreenMatch from scratch with **Spring Framework** was an incredible learning experience that deepened my understanding of:

### Technical Concepts

#### Stream API Mastery
- **FlatMap**: Converting nested lists (seasons → episodes) into a single stream
- **Filter**: Removing invalid data (N/A ratings, null dates)
- **Sorted**: Organizing episodes by rating using `Comparator.comparing()`
- **Collect**: Aggregating data into Lists, Maps, and statistics
- **GroupingBy**: Creating rating maps organized by season
- **AveragingDouble**: Calculating average ratings per group
- **SummarizingDouble**: Generating complete statistical summaries

#### DTO Pattern Implementation
- Creating lightweight Record classes for API responses
- Using `@JsonAlias` to map JSON fields to Java properties
- Implementing `@JsonIgnoreProperties` to handle unknown API fields
- Transforming DTOs into rich domain objects with validation

#### Data Processing
- Handling optional data with the `Optional<T>` container
- Converting String dates to `LocalDate` with proper exception handling
- Formatting dates with `DateTimeFormatter`
- Parsing and validating numeric strings with try-catch blocks

#### API Integration
- Building dynamic URLs with query parameters
- Handling spaces in user input for URL construction
- Making multiple sequential API calls (one per season)
- Processing JSON responses with Jackson

### Development Practices
- Clean separation of concerns (model, service, principal)
- Interface-based design for extensibility (`IDeserializacion`)
- Proper exception handling at multiple layers
- Using Java Records for immutable DTOs
- Command-line interface for user interaction

**This project challenged me to think like a professional backend developer**, combining API consumption, data transformation, functional programming, and statistical analysis into a cohesive application. I'm incredibly proud of mastering these advanced concepts!

---

## 🎯 Key Stream Operations Demonstrated

### 1. FlatMap - Data Flattening
```java
List<DTOEpisodio> dtoEpisodioList = temporadas.stream()
    .flatMap(t -> t.episodioList().stream())
    .collect(Collectors.toList());
```
Converts multiple season lists into a single episode list.

### 2. DTO to Domain Transformation
```java
List<Episodio> episodios = temporadas.stream()
    .flatMap(t -> t.episodioList().stream()
        .map(e -> new Episodio(t.numero(), e)))
    .collect(Collectors.toList());
```
Transforms API DTOs into domain objects with validation.

### 3. Filtering and Sorting
```java
dtoEpisodioList.stream()
    .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
    .sorted(Comparator.comparing(DTOEpisodio::evaluacion).reversed())
    .limit(5)
    .forEach(System.out::println);
```
Top 5 episodes by rating.

### 4. GroupBy with Aggregation
```java
Map<Integer, Double> evaluacionPorTemporada = episodios.stream()
    .filter(e -> e.getEvaluacion() > 0.0)
    .collect(Collectors.groupingBy(
        Episodio::getTemporada,
        Collectors.averagingDouble(Episodio::getEvaluacion)
    ));
```
Average rating per season.

### 5. Statistical Summary
```java
DoubleSummaryStatistics est = episodios.stream()
    .filter(e -> e.getEvaluacion() > 0.0)
    .collect(Collectors.summarizingDouble(Episodio::getEvaluacion));
```
Complete statistics: count, sum, min, average, max.

---

## 🙏 Acknowledgments

I want to express my heartfelt gratitude to:

### 🎓 **ORACLE ONE & Alura Latam**
Thank you for providing an exceptional learning platform and comprehensive curriculum that has been fundamental in my development as a backend developer. Your hands-on approach and real-world projects have been invaluable.

### 👩‍🏫 **Genesys Rondón Merchán**
My outstanding instructor, whose expertise, guidance, and patience made complex concepts accessible and exciting. Thank you for inspiring me to push beyond my limits and for your unwavering support throughout this journey.

### 💼 **My Backend Developer Formation**
This project is an integral part of my ongoing training as a **Backend Developer** through the ORACLE ONE program in partnership with Alura Latam. It represents not just technical growth, but the dedication, persistence, and countless hours invested in becoming a professional developer.

---

## 🤝 Connect With Me

I'd love to connect with fellow developers, recruiters, and anyone passionate about backend development!

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?style=for-the-badge&logo=linkedin)](YOUR_LINKEDIN_URL)
- GitHub: [@DaniiMahecha](https://github.com/DaniiMahecha)
- LinkedIn: [Daniel Felipe Mahecha Peña](https://www.linkedin.com/in/daniel-felipe-mahecha-peña)

---

## 🔑 API Key Note

This project uses the OMDb API. The API key included is for demonstration purposes. For production use or heavy testing, please obtain your own free API key at [omdbapi.com](http://www.omdbapi.com/apikey.aspx).

---

## 📝 License

This project was created for educational purposes as part of the ORACLE ONE Backend Developer program.

---

<div align="center">

**Crafted with ❤️ and ☕ by Daniel F. Mahecha**

*Every line of code is a step forward. Every challenge is an opportunity to grow.*

</div>
