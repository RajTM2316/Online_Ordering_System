# 📘 Online Order Processing System – Spring Framework

## 📌 Aim
To develop an Online Order Processing System using the Spring Framework that demonstrates:

- Annotation-based configuration
- Constructor-based Dependency Injection
- Use of `@Primary`
- Use of `@Qualifier`
- Component scanning

---

## 📌 Problem Statement
The system contains the following components:

- **PaymentService** → Interface to process payments  
- **CreditCardPaymentService** → Default implementation  
- **PaypalPaymentService** → Alternative implementation  
- **InventoryService** → Checks product availability  
- **OrderService** → Places order using default payment  
- **PaypalOrderService** → Places order using PayPal  

---

## 📌 Technologies Used
- Java  
- Spring Context  
- Maven  
- IntelliJ IDEA  

---

## 📌 Project Structure
com.example
│
├── config
│ └── AppConfig.java
│
├── service
│ ├── PaymentService.java
│ ├── CreditCardPaymentService.java
│ ├── PaypalPaymentService.java
│ ├── InventoryService.java
│ ├── OrderService.java
│ └── PaypalOrderService.java
│
└── Main.java

---

## 📌 Configuration

```java
@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
}
---

## 📌 Dependency Injection Used
Constructor-based Dependency Injection is used to provide required dependencies.

Example:
```java
public OrderService(PaymentService paymentService,
                    InventoryService inventoryService)
---

## 📌 Use of @Primary
`CreditCardPaymentService` is marked as the default implementation.

```java
@Service
@Primary
public class CreditCardPaymentService implements PaymentService
---

## 📌 Use of @Qualifier
`@Qualifier` is used when multiple beans of the same type are available and we want to inject a specific one.

In this project, it is used to inject **PaypalPaymentService**.

```java
public PaypalOrderService(
    @Qualifier("paypalPaymentService") PaymentService paymentService) {
    this.paymentService = paymentService;
}

---

## 📌 How to Run the Application

1. Open the project in IntelliJ IDEA.
2. Ensure Maven dependencies are downloaded.
3. Navigate to `Main.java`.
4. Right-click → **Run 'Main'**.

Spring will start the container, create beans, inject dependencies, and execute the order process.

## 📌 Execution
Run the `Main` class.

---

## 📌 Expected Output
Checking availability for product: P101
Credit Card payment processed: 1000.0
Order Placed Successfully

PayPal payment processed: 500.0
PayPal order placed successfully.



