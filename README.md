📘 Online Order Processing System – Spring Framework
📌 Aim

To develop an Online Order Processing System using the Spring Framework that demonstrates:

Annotation-based configuration

Constructor-based Dependency Injection

Use of @Primary

Use of @Qualifier

Component scanning

📌 Problem Statement

The system contains the following components:

PaymentService → Interface to process payments

CreditCardPaymentService → Default implementation

PaypalPaymentService → Alternative implementation

InventoryService → Checks product availability

OrderService → Places order using default payment

PaypalOrderService → Places order using PayPal

📌 Technologies Used

Java

Spring Context (Core)

Maven

IntelliJ IDEA

📌 Project Structure
com.example
│
├── config
│   └── AppConfig.java
│
├── service
│   ├── PaymentService.java
│   ├── CreditCardPaymentService.java
│   ├── PaypalPaymentService.java
│   ├── InventoryService.java
│   ├── OrderService.java
│   └── PaypalOrderService.java
│
└── Main.java

📌 Configuration

Spring uses annotation configuration and component scanning.

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
}

📌 Dependency Injection Used
Constructor Injection

Dependencies are provided through the constructor.

Example:

public OrderService(PaymentService paymentService,
                    InventoryService inventoryService)

📌 Use of @Primary

CreditCardPaymentService is marked as default.

@Service
@Primary
public class CreditCardPaymentService implements PaymentService


If multiple implementations exist, Spring automatically chooses this.

📌 Use of @Qualifier

To explicitly select PayPal:

public PaypalOrderService(
    @Qualifier("paypalPaymentService") PaymentService paymentService)

📌 Execution

Run:

Main.java


Spring container initializes beans and injects dependencies automatically.

📌 Expected Output
Checking availability for product: P101
Credit Card payment processed: 1000.0
Order Placed Successfully

PayPal payment processed: 500.0
PayPal order placed successfully.

📌 Learning Outcomes

After completing this experiment, we understand:

How Spring manages beans

Importance of component scanning

Constructor-based dependency injection

Resolving multiple implementations using @Primary and @Qualifier
