class LazySingleton {
  // 運行中途才創建實例
  private static instance: LazySingleton;

  // 私有化建構子
  // 避免在外面被建構出來
  private constructor() {}

  // 只能透過這邊取得實例
  // 跟Java不同的是
  // 由於nodejs只有單執行緒
  // 不用特別對執行緒做限制
  public static getInstance(): LazySingleton {
    if (this.instance === null) {
      this.instance = new LazySingleton();
    }
    return LazySingleton.instance;
  }
}
