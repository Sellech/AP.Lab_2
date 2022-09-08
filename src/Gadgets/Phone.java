package Gadgets;

/**
 * The Phone class is used to store information about the phone user
 * @author Yaroslav Chepiuk, CS-207
 * @version 1.0 2022-09-08
 */
public class Phone {
    private int id;
    private String sName;
    private String Name;
    private String fName;
    private int accNum;
    private int cityCalls;
    private int intercityCalls;

    public Phone(int id, String sName, String Name, String fName, int accNum, int cityCalls, int intercityCalls ){
        this.id = id;
        this.sName = sName;
        this.Name = Name;
        this.fName = fName;
        this.accNum = accNum;
        this.cityCalls = cityCalls;
        this.intercityCalls = intercityCalls;
    }

    public int getCityCalls() {
        return cityCalls;
    }

    public int getIntercityCalls() {
        return intercityCalls;
    }

    public int getAccNum() {
        return accNum;
    }

}
