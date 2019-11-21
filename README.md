### 引入：<br>
Step 1.Add it in your root build.gradle at the end of repositories:<br>
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
  Step 2. Add the dependency<br>
 ```Java
 	dependencies {
         implementation 'com.github.FantasyEngineer:ToastUtils:v2.0'
	}
```
### 代码使用<br> 
在application的oncreat中调用初始化。
```Java
      D.init(this);
      //之后的每次使用
      D.showShort("不能为空");
```

