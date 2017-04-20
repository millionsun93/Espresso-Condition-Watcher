# Espresso-Condition-Watcher
Set timeout
```java
ConditionWatcher.setTimeoutLimit(2000); //set timeout to 2000ms
```
Set interval
```java
ConditionWatcher.setWatchInterval(2000); //set timeout to 2000ms
```
and let's wait
```java
ConditionWatcher.waitForCondition(new Instruction() {
    @Override
    public void apply() {
        //put your espresso code here if you need to wait
    }
});
```
