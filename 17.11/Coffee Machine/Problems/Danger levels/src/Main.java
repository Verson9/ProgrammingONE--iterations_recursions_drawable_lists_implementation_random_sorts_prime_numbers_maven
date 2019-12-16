enum DangerLevel {
    LOW (1),
    MEDIUM (2),
    HIGH (3);

    private final int lvl;

    DangerLevel(int lvl){
        this.lvl = lvl;
    }

    public Integer getLevel(){
        return lvl;
    }
}

