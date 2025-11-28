/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author LENOVO
 */
public class Payment {
    private int paymentId;
    private String paymentDesc;
    private String paymentDate;
    private Student student;  //payment --> student

    public Payment() {
    }

    public Payment(int paymentId, String paymentDesc, String paymentDate) {
        this.paymentId = paymentId;
        this.paymentDesc = paymentDesc;
        this.paymentDate = paymentDate;
    }
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentDesc() {
        return paymentDesc;
    }

    public void setPaymentDesc(String paymentDesc) {
        this.paymentDesc = paymentDesc;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentId=" + paymentId + ", paymentDesc=" + paymentDesc + ", paymentDate=" + paymentDate + '}';
    }
    
    
    
    
}
