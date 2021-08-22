package bai16.Optional.Docfile_csv;

public class Country {
    String starIp;
    String endIp;
    String x;
    String y;
    String code;
    String name;

    public Country(String starIp, String endIp, String x, String y, String code, String name) {
        this.starIp = starIp;
        this.endIp = endIp;
        this.x = x;
        this.y = y;
        this.code = code;
        this.name = name;
    }

    public String getStarIp() {
        return starIp;
    }

    public void setStarIp(String starIp) {
        this.starIp = starIp;
    }

    public String getEndIp() {
        return endIp;
    }

    public void setEndIp(String endIp) {
        this.endIp = endIp;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.starIp + "," +
                this.endIp + "," +
                this.x + "," +
                this.y + "," +
                this.code + ","+
                this.name;
    }
}
