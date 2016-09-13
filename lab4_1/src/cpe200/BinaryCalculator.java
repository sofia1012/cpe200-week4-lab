package cpe200;


import java.text.DecimalFormat;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() {
        double total = Double.parseDouble(firstOperand.getOperand()) + Double.parseDouble(secondOperand.getOperand());
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            return Integer.toString(i);
        }else {
            return Double.toString(total);
        }

    }

    public String subtract() {
        double total = Double.parseDouble(firstOperand.getOperand()) - Double.parseDouble(secondOperand.getOperand());
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            return Integer.toString(i);
        }else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);

        }

    }

    public String multiply() {
        double total = Double.parseDouble(firstOperand.getOperand()) * Double.parseDouble(secondOperand.getOperand());
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            return Integer.toString(i);
        }else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
            //Math.round(total,1);
        }
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if(Double.parseDouble(secondOperand.getOperand()) != 0) {
            double total = Double.parseDouble(firstOperand.getOperand()) / Double.parseDouble(secondOperand.getOperand());
            if ((total == Math.floor(total) && !Double.isInfinite(total))) {
                int i = (int) total;
                return Integer.toString(i);

            } else {
                total = total*100000;
                total = Math.floor(total);
               int count = (int)total;
                   total = (double)count/100000;
                return Double.toString(total);

            }
        }else{
            int a=2;
            return Integer.toString(a/0);
        }

    }

    public String power() {
        double firs,second;
        double total;
        firs = Double.parseDouble(firstOperand.getOperand());
        second = Double.parseDouble(secondOperand.getOperand());
        total = Math.pow(firs,second);
        if( (total == Math.floor(total) && !Double.isInfinite(total))){
            int i = (int)total;
            return Integer.toString(i);
        }else {
            DecimalFormat formatter = new DecimalFormat("#0.0");
            return formatter.format(total);
            //Math.round(total,1);
        }

    }


}
