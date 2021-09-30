行为特征项：
* 效率 
* 键值对的保存 
* 呈现次序 
* 对象保存周期 
* 多线程中的工作 
* 判定键等价策略
____
1. HashMap
   1. 插入和查询开销固定
   2. 构造器设置容量和负载因子
2. LinkedHashMap
   1. 功能上≈HashMap 
   2. 速度上
      1. 取键值对 < HashMap
      2. 迭代遍历 > HashMap
   3. 遍历时顺序=插入顺序｜最近最少使用（LRU）
3. TreeMap
   1. 基于红黑树实现
   2. 唯一带有subMaps()方法，得到子树
4. WeakHashMap
   1. 弱键映射
   2. 当没有映射之外的引用指向对象时，回收释放对象
5. ConcurrentHashMap
6. IdentityHashMap
   1. 使用==代替equal()对键进行比较
