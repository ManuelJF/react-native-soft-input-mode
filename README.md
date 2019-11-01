# react-native-soft-input-mode

## Getting started

`$ npm install react-native-soft-input-mode --save`

### Mostly automatic installation

`$ react-native link react-native-soft-input-mode`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-soft-input-mode` and add `SoftInputMode.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libSoftInputMode.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.SoftInputModePackage;` to the imports at the top of the file
  - Add `new SoftInputModePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-soft-input-mode'
  	project(':react-native-soft-input-mode').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-soft-input-mode/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-soft-input-mode')
  	```


## Usage
```javascript
import SoftInputMode from 'react-native-soft-input-mode';

// TODO: What to do with the module?
SoftInputMode;
```
