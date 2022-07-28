public class EagerSingleton {
    // 一開始就先建立實例
    private static EagerSingleton instance = new EagerSingleton();

    // 私有化建構子
    // 避免在外面被建構出來
    private EagerSingleton(){}

    // 只能透過這邊取得實例
    public static EagerSingleton getInstance(){
        return instance;
    }
}
