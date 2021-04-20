package 注解.应用;

import org.junit.Test;

import java.lang.reflect.Method;

public class BankBussiness {

    public BankBussiness(){}

    public static void main(String[] args) {
        transferMoney(15000.0);
    }

    @LimitationAnnotation(maxAmount = 10000)
    public static void transferMoney(double money){
        System.out.println(topUp(money));
    }
    
    private static String topUp(double money){
        try{
            Method transfer = BankBussiness.class.getDeclaredMethod("transferMoney",double.class);
            boolean annotationPreset = transfer.isAnnotationPresent(LimitationAnnotation.class);
            if (annotationPreset){
                LimitationAnnotation a = transfer.getAnnotation(LimitationAnnotation.class);
                double limit = a.maxAmount();
                if (money > limit){
                    return "金额超出限制，转账失败";
                }else{
                    return "转账成功";
                }
            }else{
                System.out.println("无限制，转账成功");
                return "无限制，转账成功";
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "转账失败";
    }
}
