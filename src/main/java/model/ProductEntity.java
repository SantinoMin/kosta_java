//package model;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@Builder
//@Table(name = "product")
//public class ProductEntity {
//
//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
//  @Column(name = "product_id", nullable = false, unique = true)
//  private int productId;
//
//  @Column(name = "product_name", nullable = false)
//  private String productName;
//
//  @Column(name = "product_amount", nullable = false)
//  private int productAmount;
//
//}