# 🔐 Spring Security Mini Project (JWT + OAuth2 + RBAC)

A complete backend authentication & authorization system built using **Spring Boot** and **Spring Security**, covering real-world security implementations like JWT authentication, OAuth2 login, role-based access, and more.

---

## 🚀 Features Implemented

### 🔒 Security Basics
- Protection against:
    - CSRF (Cross-Site Request Forgery)
    - XSS (Cross-Site Scripting)
    - SQL Injection

---

### ⚙️ Spring Security Internals
- Understanding Spring Security architecture
- Core components:
    - AuthenticationManager
    - UserDetailsService
    - PasswordEncoder
- Security Filter Chain configuration

---

### 🔑 JWT Authentication System
- JWT Token generation & validation
- Stateless authentication
- Custom authentication filter
- Secure login & signup APIs

---

### 🔁 Refresh Token Mechanism
- Access Token + Refresh Token based authentication
- Token expiration handling
- Secure token renewal flow

---

### 🔐 API Authentication
- Securing REST APIs using JWT
- Authorization headers (`Bearer Token`)
- Custom request filtering

---

### ❌ Exception Handling
- Global exception handling for security
- Custom error responses for unauthorized access

---

### 🌐 OAuth2 Integration
- Google OAuth2 Login
- Secure authentication via external provider
- Handling OAuth2 user details

---

### 👥 Session Management
- Stateless session handling using JWT
- Token-based user session control

---

### 🛡️ Authorization
#### Role-Based Access Control (RBAC)
- Role-based endpoint protection (e.g., ADMIN, USER)

#### Granular Permissions
- Authorities & permissions-based access control

---

### 🧠 Method-Level Security
- `@Secured`
- `@PreAuthorize`
- Fine-grained access control at method level

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- OAuth2 Client
- Maven
- MySQL / PostgreSQL (or your DB)

---

## 📂 Project Structure

src/
├── config/ # Security configurations
├── controller/ # REST APIs
├── dto/ # Data Transfer Objects
├── entity/ # Database entities
├── repository/ # JPA repositories
├── service/ # Business logic
├── security/ # JWT, filters, providers
└── exception/ # Custom exception handling


---

## 🔧 Setup & Run

### 1. Clone the repo
```bash
git clone https://github.com/ShubhamPDev7/spring-security-mini-project.git
cd your-repo-name
```

📌 Learning Outcomes
Deep understanding of Spring Security
Real-world authentication system design
Secure API development practices
Industry-level backend architecture

