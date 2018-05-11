package cn.ledaikuan.ldkbatch.model;

public class CashBackUserField {

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public long getTotalLoanAmt() {
        return totalLoanAmt;
    }

    public void setTotalLoanAmt(long totalLoanAmt) {
        this.totalLoanAmt = totalLoanAmt;
    }

    public String getNextPayDate() {
        return nextPayDate;
    }

    public void setNextPayDate(String nextPayDate) {
        this.nextPayDate = nextPayDate;
    }

    public long getBaseTotCreLine() {
        return baseTotCreLine;
    }

    public void setBaseTotCreLine(long baseTotCreLine) {
        this.baseTotCreLine = baseTotCreLine;
    }

    public long getBaseRestCreLine() {
        return baseRestCreLine;
    }

    public void setBaseRestCreLine(long baseRestCreLine) {
        this.baseRestCreLine = baseRestCreLine;
    }

    private String customerId;
    
    private String mobileNo;
    
    private long totalLoanAmt;
    
    private String nextPayDate;
    
    private long baseTotCreLine;
    
    private long baseRestCreLine;
    
}
