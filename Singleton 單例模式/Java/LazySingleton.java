public class LazySingleton {
    // 運行中途才創建實例
    private static LazySingleton instance;

    // 私有化建構子
    // 避免在外面被建構出來
    private LazySingleton() {}

    // 只能透過這邊取得實例
    // Double-Checked Locking
    public static LazySingleton getInstance() {
        // 避免拖累效能
        // 在外層先檢查一次
        if (instance == null) {
            // 限制只有一個thread可以進入
            // 避免多個thread同時進入
            // 而建立出多個實例
            synchronized (LazySingleton.class) {
                // 當實例尚未被建立出來
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
