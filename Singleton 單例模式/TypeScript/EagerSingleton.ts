class EagerSingleton {
  // 一開始就先建立實例
  private static instance: EagerSingleton = new EagerSingleton();

  // 私有化建構子
  // 避免在外面被建構出來
  private constructor() {}

  // 只能透過這邊取得實例
  public static getInstance(): EagerSingleton {
    return EagerSingleton.instance;
  }
}