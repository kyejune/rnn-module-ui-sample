# rnn-module-ui-sample

https://facebook.github.io/react-native/docs/native-components-android
https://facebook.github.io/react-native/docs/native-components-ios

모듈과 UI모듈 둘다 테스트했습니다.

JS에서 사용하는 클래스명은
```
통신모듈: RNAudioPlayer
UI모듈: ImageView
```

#### 안드로이드에서는.. 
```
RNAudioPlayer.play로 특정 소스의 재생이 가능하고,
ImageView로 이미지를 띄웁니다.
```

#### iOS에서는 ( object c 코드를 잘 모르는 관계로 클래스 네이밍만 안드로이드와 통일하고 기능은 기본 예제를 참고하느라 약간 다릅니다. )
```
RNAudioPlayer.play 로 log를 출력하고
ImageView에는 MKMapView로 기본 지도를 출력합니다. 
```
