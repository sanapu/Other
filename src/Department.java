public enum Department {

    IT(1), MARKET(2), FINANCE(3), HR(4), ENGG(5);

    private int dept_number;

    Department(int number){
        this.dept_number = number;
    }
    public int getDept_number() {
        return dept_number;
    }

}
